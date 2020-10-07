package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class VisitMinuteClinicPage extends BasePage {

	public VisitMinuteClinicPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[@class='siteLogo head-sprite']")
	WebElement CVSlogo;
	@FindBy(how = How.LINK_TEXT, using = "Visit MinuteClinic")
	WebElement Visit;
	@FindBy(how = How.XPATH, using = "//form//descendant::input[@id='zip']")
	WebElement Zip;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement Search;

	public void visitMinuteClinic() {
		Visit.click();
		waitForElement(Zip, 10);
	}
	public void searchForClinic() {
		Zip.sendKeys(prop.getProperty("zipcode"));
		Search.click();
	}

	public void findClinic() {
		Wait(driver.findElement(By.xpath("")), 10);


	}

	

	public boolean verifyLogo() {
		return CVSlogo.isDisplayed();
	}
}