package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends cvsPage{

	public static WebDriver driver;
	public static Properties prop;

	public BasePage() {
		prop = new Properties();
		try {
			FileInputStream fi = new FileInputStream(
					"C:\\Users\\nshrestha\\Desktop\\Selenium\\com.cvs\\src\\main\\java\\config.properties");
			prop.load(fi);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
	public void waitForElement(WebElement element, long TimeUnit) {
		WebDriverWait wait = new WebDriverWait(driver,TimeUnit) ;
			wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitForPage(long TimeUnit) {
		WebDriverWait wait = new WebDriverWait(driver, TimeUnit);
		wait.until(ExpectedConditions.alertIsPresent());
}
	
	public void waits() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void waits(TimeUnit TimeUnit) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit);
	}
	

	public static void tearDown() {
		//driver.close();
		
	}
	public void handlePopUp() {
		driver.switchTo().alert().dismiss();
	}
	@Override
	public String getTitle() {
		return driver.getTitle();
	}
	@Override
	public void Wait(WebElement Element) {
		WebDriverWait waits = new WebDriverWait(driver, 10);
		waits.until(ExpectedConditions.elementToBeClickable(Element));
	}
	@Override
	public void Wait(WebElement element, long Time) {
		driver.manage().timeouts().implicitlyWait(Time, TimeUnit.SECONDS);
	}
	
}
