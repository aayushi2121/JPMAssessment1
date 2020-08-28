package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JPMorganPage {
	
	WebDriver driver;

	@FindBy(xpath="//div[contains(@class,'logo-desktop-only')]//img[contains(@class,'first-logo')]") WebElement logo;
	
	public JPMorganPage(WebDriver ldriver)
	{
		
		this.driver=ldriver;
	}
	
	
	//Method for checking the logo is Displayed or not
	public void LogoDisplayed()
	{
		if(logo.isDisplayed())
		{
			System.out.println("Logo is Displayed");
			
			///verify the logo text value
			System.out.println("The logo text is  " +logo.getAttribute("alt"));
		}
		
		else
		{
			System.out.println("Logo is not Displayed");
		}
	}

}
