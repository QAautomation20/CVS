package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.CVSBasePage;

public class CVSBrowserFactory extends CVSBasePage {
	
	
	
	public static void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		driver.get("https://www.cvs.com/");
		
	}
}
