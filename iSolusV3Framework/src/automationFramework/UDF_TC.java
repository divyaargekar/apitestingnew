package automationFramework;

import org.testng.annotations.Test;

import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;
import Utility.UserDefinedFunctions;
import Utility.Utils;
import appModules.Actionsclass;
import appModules.SignInAction;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class UDF_TC {
	public WebDriver driver;
	 
    private String sTestCaseName;
 
    private int iTestCaseRow;
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
	
	Actionsclass actone=new Actionsclass();
	actone.clickon_Location(driver);
	actone.clickon_NewButton(driver);
	actone.getLocationNameTextbox(driver).sendKeys("Raichur");
  actone.clickon_SubmitButton(driver);
	  
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
      //DOMConfigurator.configure("log4j.xml");

      sTestCaseName = this.toString();
System.out.println(sTestCaseName);
      sTestCaseName = UserDefinedFunctions.getTestCaseName(sTestCaseName);

     Log.startTestCase(sTestCaseName);
     System.out.println(sTestCaseName);

     ExcelUtils.setExcelfile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");

     iTestCaseRow = ExcelUtils.getrowcontains(sTestCaseName, Constant.Col_TestCaseName);
     System.out.println(iTestCaseRow);
     driver = Utils.openBrowser(iTestCaseRow);

     }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  
	  Log.endTestCase("Selenium_Test_001");
	  driver.quit();

}
}
