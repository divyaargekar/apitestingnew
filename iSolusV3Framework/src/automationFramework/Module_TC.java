package automationFramework;
import Utility.ExcelUtils;
import Utility.Log;
import Utility.Constant;
import appModules.SignInAction;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import appModules.SignInAction;
import pageObjects.LoginPage;
public class Module_TC {
	
	private static WebDriver driver=null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String driverPath = "E:\\6.others\\chromedriver_win32";

		 Log.startTestCase("Selenium_Test_001");
        ExcelUtils.setExcelfile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");

		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath + "\\chromedriver.exe");
		driver = new ChromeDriver();
		 Log.info("New driver instantiated");
		driver.get(Constant.URL);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		SignInAction.Execute(driver);
		
		
		
		ExcelUtils.SetCelldata("Pass", 1, 3);
		
		Log.endTestCase("Selenium_Test_001");
	

	}

}
