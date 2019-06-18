package automationFramework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	String driverPath = "E:\\6.others\\drivers";
    	
    	System.setProperty("webdriver.chrome.driver", driverPath + "\\chromedriver.exe");
    WebDriver driver;
    	driver = new ChromeDriver();
  	  driver.manage().deleteAllCookies();
  	  
  	  driver.get("http://192.168.2.241/isolusv3/#/app/sacsdevicedashborad");
  	  driver.manage().window().maximize();
  	  JavascriptExecutor js=(JavascriptExecutor) driver;
  	  js.executeScript("window.scrollBy(0,150)");
  	String title=  js.executeScript("return.document.title").toString();
  	System.out.println(title);
	}

}
