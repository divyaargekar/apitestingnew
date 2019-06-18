package appModules;

import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import Utility.ExcelUtils;
import Utility.Constant;
import Utility.Log;

public class SignInAction {

	public static void Execute(WebDriver driver)
	{
		
		String sUserName=ExcelUtils.getcelldata(1,1);
		Log.info("Username picked from Excel is "+ sUserName );

		System.out.println(sUserName);
		String sPassWord=ExcelUtils.getcelldata(1,2);
		Log.info("Password picked from Excel is "+ sPassWord );

     LoginPage.txtbx_UserName(driver).sendKeys(sUserName);
 	Log.info("Username entered in the Username text box");
     LoginPage.txtbx_password(driver).sendKeys(sPassWord);
		Log.info("Password entered in the Password text box");
     LoginPage.btn_LogIn(driver).click();

		Log.info("Click action performed on Submit button");
     Log.info("Click action performed on My Account link");
	}

}
