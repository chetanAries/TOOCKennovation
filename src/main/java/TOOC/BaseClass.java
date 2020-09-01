package TOOC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void OpenBrowser() throws Exception 
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chetan\\Desktop\\NewStartUpProject\\TOOC\\drivers\\chromedriver.exe");
		
//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		
		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.setHeadless(true);
//		chromeOptions.addArguments("--disable-dev-shm-usage");
//		chromeOptions.addArguments("disable-infobars");
//		chromeOptions.addArguments("--disable-browser-side-navigation");
//		chromeOptions.addArguments("--start-maximized");
//		chromeOptions.addArguments("--no-sandbox");
//		chromeOptions.addArguments("--disable-dev-shm-usage");
		chromeOptions.setExperimentalOption("useAutomationExtension", false);
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		 driver=new ChromeDriver(chromeOptions);
		 
		 
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\chetan\\Desktop\\NewStartUpProject\\TOOC\\drivers\\geckodriver.exe");
////	
		 
//		 FirefoxOptions firefoxOption = new FirefoxOptions();
//		 firefoxOption.setHeadless(true);
//		 System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
//         driver = new FirefoxDriver(firefoxOption); 
		 

		driver.manage().window().maximize();
		
		driver.get("https://uat2.temeculaoliveoil.com/");
//      driver.get("https://uat.temeculaoliveoil.com/");
//		driver.get("https://temeculaoliveoil.com/");
		Thread.sleep(6000);

	}
	
//	@AfterTest
//	public void terminate()
//	{	
//		driver.close();
//	}

}

