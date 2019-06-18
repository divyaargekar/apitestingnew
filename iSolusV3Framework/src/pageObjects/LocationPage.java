package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;

public class LocationPage {

	 

	        private static WebElement element = null;
	 
	    public static WebElement LocationLink(WebDriver driver){
	 
	         element = driver.findElement(By.xpath("//span[@data-translate='Location']"));

	         Log.info("Location link not clickable");
	         return element;
	 
	         }
	 public static WebElement New_button(WebDriver driver)
	 {
		 
		 element =driver.findElement(By.xpath("//button[@ng-click='vm.fnClickNewBtn();']"));
		 Log.info("New button not clickable");
		 
		 return element;
	 }
	     
	 
	 public static WebElement Submit_button(WebDriver driver){
	 
	         element = driver.findElement(By.xpath("//button[@type='submit']"));
	         Log.info("Submit button not found");
	         return element;
	 
	         }
	 
	 public static WebElement Location_TextBox(WebDriver driver){
		 
         element = driver.findElement(By.xpath("//input[@data-display='Location Name']"));
         Log.info("Submit button not found");
         return element;
 
         }
 
	 
	}

