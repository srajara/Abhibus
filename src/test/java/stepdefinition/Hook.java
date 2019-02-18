package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
public static WebDriver driver;
	
	@Before
	public static void loadDriver() {
		System.setProperty("webdriver.chrome.driver","B:\\Testngpractice\\Abhibus\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
	@After
	public static void quitbrowser() {
	//	driver.quit();

	}


}
