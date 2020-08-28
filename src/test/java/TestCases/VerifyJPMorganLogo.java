package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import Pages.GooglePage;
import Pages.JPMorganPage;

public class VerifyJPMorganLogo {
	
WebDriver driver;
	
	@BeforeMethod 
	public void SetUP()
	{
		//Call Chrome browser
        driver=BrowserFactory.getBrowser("chrome");
		//Call application url
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}
	
	@Test
	public void verifylogo() throws Exception
	{
		//Call Google Page and search J.P.Morgan
		GooglePage google=PageFactory.initElements(driver, GooglePage.class);
		//Search J.P.Morgan
		google.EnterResult("J.P.Morgan");
		//Press Enter
		google.SearchResult(Keys.ENTER);
		//Click on 1st result
		google.ClickOnFirstResult();
		Thread.sleep(2000);
		
		//call JPMorgan home page
		JPMorganPage morgan=PageFactory.initElements(driver, JPMorganPage.class);
		//Verify that logo is Shown
		morgan.LogoDisplayed();
		
	
		

}
    @AfterMethod
	public void close() {
		driver.quit();
		
	}

	
}
