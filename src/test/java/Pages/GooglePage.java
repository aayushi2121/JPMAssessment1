package Pages;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage 
{
	
	WebDriver driver;

    @FindBy(xpath="//input[@name='q']") WebElement searchname;
    
    @FindBy(xpath="//h3[contains(text(),'J.P. Morgan Home | J.P. Morgan')]") WebElement firstresult;
    
   // @FindBy(xpath="//button[@name='login']") WebElement login;

	
	public GooglePage(WebDriver ldriver)
	{
		
		this.driver=ldriver;
	}
	
	//Method for Entering J.P.Morgan
	public void EnterResult(String string)
	{
		searchname.sendKeys(string);
				
	}
	
	//Method for searching J.P.Morgan
	public void SearchResult(Keys enter)
    {
		searchname.sendKeys(enter);
			
	}
	
	//Method for clicking on 1st google result
	public void ClickOnFirstResult()
	{
		firstresult.click();
	}

}
