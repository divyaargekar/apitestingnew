package appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageObjects.LocationPage;

public class Actionsclass {
	
	
	public void  clickon_Location(WebDriver driver)
	{
	
		WebElement LocationElemnt= LocationPage.LocationLink(driver);
		
		LocationElemnt.click();
	}
	public void clickon_NewButton(WebDriver driver)
	{
		WebElement NewButton=    LocationPage.New_button(driver);
		NewButton.click();
	}
	public WebElement  getLocationNameTextbox(WebDriver driver)
	{ 
		WebElement Locationtextbox=LocationPage.Location_TextBox(driver);
		return Locationtextbox;
		
	}
	public void clickon_SubmitButton(WebDriver driver)
	{
		WebElement submitbutton=LocationPage.Submit_button(driver);
		submitbutton.click();
	}
}
