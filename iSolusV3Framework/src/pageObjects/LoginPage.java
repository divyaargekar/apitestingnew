
 package pageObjects;
 
import org.openqa.selenium.*;

import Utility.Log;
 
public class LoginPage{
 
        private static WebElement element = null;
 
    public static WebElement txtbx_UserName(WebDriver driver){
 
         element = driver.findElement(By.xpath("//input[@ng-model='auth.login.UserID']"));

         Log.info("Username text box found");
         return element;
 
         }
 public static WebElement txtbx_password(WebDriver driver)
 {
	 
	 element =driver.findElement(By.xpath("//input[@ng-model='auth.login.Password']"));
	 Log.info("Password text box found");
	 
	 return element;
 }
     
 
 public static WebElement btn_LogIn(WebDriver driver){
 
         element = driver.findElement(By.xpath("//button[@type='submit']"));
         Log.info("Submit button found");
         return element;
 
         }
 
}