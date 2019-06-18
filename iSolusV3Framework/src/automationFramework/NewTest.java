package automationFramework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import  Utility.Utils;

import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;
import appModules.SignInAction;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;
import Utility.*;

public class NewTest {
	private static WebDriver driver=null;
	
	@BeforeMethod
	  public void beforeMethod() throws Exception {
		//String driverPath = "E:\\6.others\\chromedriver_win32";

		 Log.startTestCase("Selenium_Test_001");
       ExcelUtils.setExcelfile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
   driver=    Utils.openBrowser(ExcelUtils.getcelldata(1,4));

	//	System.out.println("launching chrome browser");
		//System.setProperty("webdriver.chrome.driver", driverPath + "\\chromedriver.exe");
	//	driver = new ChromeDriver();
		// Log.info("New driver instantiated");
	//	driver.get(Constant.URL);
	//	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  
		  
		  
		  
	  }
  @Test
  public void SignIn()  {
	  
	  driver.manage().window().maximize();
		SignInAction.Execute(driver);
		Actions act = new Actions(driver);

		WebElement driverele = driver.findElement(By.xpath("//i[@class='zmdi ng-scope zmdi-assignment-check']"));
		Action elementtwo = act.moveToElement(driverele).build();
		elementtwo.perform();
	WebElement Airport=	driver.findElement(By.xpath("//span[@data-translate='Airport']"));

		//AssertCustomized.softAssert(Airport.isDisplayed());
	Assert.assertTrue(Airport.isDisplayed());
	System.out.println("Element is displayed");
		//ExcelUtils.SetCelldata("Pass", 1, 3);
	  
  }
  

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  
	  Log.endTestCase("Selenium_Test_001");
	  driver.quit();
	  
	  
  }
  
  

}
