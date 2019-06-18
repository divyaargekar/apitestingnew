package Utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CSVUtils {
	
	static String perticularvalue;
	public static String getSessiondata(String datevalue) throws IOException
	{
		FileReader reader=new FileReader("E:\\6.others\\iSolusV3Framework\\src\\testdata\\analytics.csv");    
		
		//ArrayList<String> listofsessions=new ArrayList<String>();
		HashMap <String,String> mapofsessions=new HashMap<>();

	      //  BufferedReader reader = Files.newBufferedReader(Paths.get(first, more)
	        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("dayindez","User","Sessions").withIgnoreHeaderCase().withTrim());
	        for (CSVRecord csvRecord: csvParser) {
	            // Accessing Values by Column Index
	            String Users = csvRecord.get(0);
	            //Accessing the values by column header name
	           // dayindexdate= csvRecord.toString();
	
	          //s  System.out.println(dayindexdate);
	          String Sessions = csvRecord.get("Sessions");
	          mapofsessions.put(Users,Sessions);
	      // System.out.println(mapofsessions);

	            //Printing the record 
	          //  System.out.println("Record Number - " + csvRecord.getRecordNumber());
	        //  System.out.println("DayIndex " + Users);
	          //int position=Users.lastIndexOf("x");
	    //String      sessions=            Users.substring(position+2);
	    //  System.out.println("Sessions : " + Sessions);
	    
	    }
	   	 perticularvalue=          mapofsessions.get(datevalue);
		    System.out.println(perticularvalue);
		    return perticularvalue;
		// TODO Auto-generated method stub

	}
}


