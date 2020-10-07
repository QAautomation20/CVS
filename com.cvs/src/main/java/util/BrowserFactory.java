package util;

import org.openqa.selenium.chrome.ChromeDriver;

import pages.BasePage;

public class BrowserFactory extends BasePage {

	public static void setUp() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			return;
		}
		driver.get(prop.getProperty("url"));

	}
}
