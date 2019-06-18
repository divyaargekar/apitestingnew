package Utility;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.apache.poi.ss.formula.EvaluationWorkbook.ExternalSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Utils {
	
	 public static WebDriver driver = null;
	 
	    public static WebDriver openBrowser(int iTestCaseRow ) throws Exception
	    {
	    	
	 
	        String sBrowserName;

	 
	    sBrowserName = ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_Browser);
	    System.out.println(sBrowserName);
	 
	        if(sBrowserName.equals("Chrome")){
	 
	        
	        	String driverPath = "E:\\6.others\\drivers";
	        	
	        	System.setProperty("webdriver.chrome.driver", driverPath + "\\chromedriver.exe");
			/*
			 * DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			 * ChromeOptions options = new ChromeOptions();
			 * options.addArguments("test-type"); options.addArguments("start-maximized");
			 * options.addArguments("user-data-dir=D:/temp/");
			 * capabilities.setCapability("chrome.binary","res/chromedriver.exe");
			 * capabilities.setCapability(ChromeOptions.CAPABILITY,options); WebDriver
			 * driver = new ChromeDriver(capabilities);
			 */
	        	driver = new ChromeDriver();
	        	  driver.manage().deleteAllCookies();
	            Log.info("New driver instantiated");
	 
	            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	            driver.manage().deleteAllCookies();
	 
	            Log.info("Implicit wait applied on the driver for 10 seconds");
	 
	            driver.get(Constant.URL);
	          
	 
	            Log.info("Web application launched successfully");
	            return driver;
	 
	            }
	 
	       
	        
	        else if(sBrowserName.equals("Mozilla"))
	        {
	            String driverPath = "E:\\6.others\\drivers";
	        	
	        	System.setProperty("webdriver.gecko.driver", driverPath + "\\geckodriver.exe");
	        	
	        	driver = new FirefoxDriver();
	       	 
	            Log.info("New driver instantiated");
	 
	            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	            Log.info("Implicit wait applied on the driver for 10 seconds");
	 
	            driver.get(Constant.URL);
	 
	            Log.info("Web application launched successfully");
	            return driver;
	        	
	         }
	        
	        else 
	        	
	        {  
	        	
	        	File file = new File("E:\\6.others\\drivers\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	   		 
	   		 String driverPath = "E:\\6.others\\drivers";
	        	
	        	System.setProperty("phantomjs.binary.path", driverPath + "\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	          //  System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
	            WebDriver driver = new PhantomJSDriver();	
	 
	            driver.get(Constant.URL);
	 
	            Log.info("Web application launched successfully");
	            return driver;
	        }
	        }
}

	

