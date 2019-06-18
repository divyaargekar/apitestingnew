package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;

public class AirportPage {
	
	public static  WebElement element;
	public static WebElement Master(WebDriver driver){
		 
		element = driver.findElement(By.xpath("//i[@class='zmdi ng-scope zmdi-assignment-check']"));

        Log.info("Master is not clicked");
        return element;

        }
	public static WebElement Airport(WebDriver driver)
	{
	element=	driver.findElement(By.xpath("//span[@data-translate='Airport']"));

    Log.info("Airport is not clicked");
	return element;
	}
  
	
	public static WebElement NewButton(WebDriver driver)
	{
	element=	driver.findElement(By.xpath("//button[text()=' New']"));
    Log.info("New button  is not clicked");
	return element;
	}
}
