package appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pageObjects.*;
public class MoveToElement {
	
	public static void MoveToelementMaster(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
WebElement drivereleMaster=	AirportPage.Master(driver);
Action MasterElementBuild=act.moveToElement(drivereleMaster).build();
MasterElementBuild.perform();
		
	}
  
}
