package automationFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.CSVUtils;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;

public class AutomateAjaxDataPointsText {
	
	private static WebDriver driver=null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String driverPath = "E:\\6.others\\drivers";

		 Log.startTestCase("Selenium_Test_001");
        ExcelUtils.setExcelfile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");

		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath + "\\chromedriver.exe");
		driver = new ChromeDriver();
		 Log.info("New driver instantiated");
		driver.get(Constant.URL2);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 WebDriverWait waitbasedonconditions = new WebDriverWait(driver, 10);
	//WebElement Defaultelement=	 driver.findElement(By.xpath("//div[@class='btn-group theme']/a[1]"));
		 waitbasedonconditions.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='btn-group theme']/a[1]")));
	String tooltipsessionvalue=	 CSVUtils.getSessiondata(Constant.DateTogetSession);
	System.out.println("tooltipsessionvalue"+tooltipsessionvalue);

}

}