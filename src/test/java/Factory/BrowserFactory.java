package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory
{
static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName)
	
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			String geckoDriverPath=System.getProperty("user.dir");
			System.out.println(geckoDriverPath);
			System.setProperty("webdriver.gecko.driver",geckoDriverPath+"//com.JPMorgan//Drivers//Chromedriver//chromedriver.exe");
			driver=new FirefoxDriver();
			
			
		}
		
		else if(browserName.equalsIgnoreCase("chrome"))
			
			
		{
			String chromeDriverPath=System.getProperty("user.dir");
			System.out.println(chromeDriverPath);
			System.setProperty("webdriver.chrome.driver",chromeDriverPath+"//com.JPMorgan//Drivers//Chromedriver//chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}

}
