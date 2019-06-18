package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Logintohttpssystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driverPath = "E:\\6.others\\drivers";
    	
    	System.setProperty("webdriver.chrome.driver", driverPath + "\\chromedriver.exe");
    	
   WebDriver  	driver = new ChromeDriver();
   
   driver.get("https://172.16.1.18/isolusv2/#/contractorRegistration");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

WebElement element=driver.findElement(By.xpath("//select[@id='TitleCode']"));

Select selecttitle=new Select(element);

selecttitle.selectByIndex(3);

	}

}
