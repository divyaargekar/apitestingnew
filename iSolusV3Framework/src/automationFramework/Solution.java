package automationFramework;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
	public static List<Integer>  compinteger=new ArrayList<Integer>();

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	  int resultofint[]=new int[3];
    		    int ascore[]=new int[a.size()];

    		       int bscore[]=new int[b.size()];
    		     for(int i=0;i<a.size();i++)
    		      {
    		          for(int j=0;i<b.size();i++)
    		          {
    		              ascore[i]=a.get(i);
    		              bscore[i]=b.get(j);
    		              if(ascore[i]>bscore[j])
    		              {
    		            	 resultofint[i]=i+1;
    		          }
    		              else if(a.get(i).equals(b.get(i)))
    		              {
    		            	  resultofint[j]=j+1;
    		          }
    		              else
    		              { 
    		            	  resultofint[j]=j+0;
    		              }
    		      }
    		      }
    		    return compinteger;



    }

    public static void main(String[] args) throws IOException {


        List<Integer> a = new ArrayList<Integer>();
        a.add(30);
        a.add(5);
        a.add(10);
        System.out.println(a);
        
      
        List<Integer> b = new ArrayList<Integer>();
        b.add(10);
        b.add(5);
        b.add(20);
       
        System.out.println(b);

        List<Integer> result = compareTriplets(a, b);
System.out.println(result);
    }
}
