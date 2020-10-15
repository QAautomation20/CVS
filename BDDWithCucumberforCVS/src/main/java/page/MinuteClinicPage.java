package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MinuteClinicPage extends CVSBasePage {

	public MinuteClinicPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "MinuteClinic")
	WebElement minuteclinic;
	
	@FindBy (how = How.ID, using = "zip")
	WebElement Zip;
	
	@FindBy (how = How.XPATH, using = "//a[@title='No, thanks']")
	WebElement PopUp;
	
	
	public void minuteClinic() {
		minuteclinic.click();		
	}
	
	public void Typezipcode(String zipcode) {
		waitForElement(Zip, driver);
		Zip.sendKeys(zipcode);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();		
	}
	

	public void MinuteAssertion() {
		String Expected = "minute clinic";
		String Actual = driver.findElement(By.xpath("//nav[@id='navbar']/a[contains(text(), 'minute clinic')]")).getText();
		System.out.println("minute clinic page =  " + Actual);
			
	try {
		Assert.assertEquals(Actual, Expected);
		System.out.println("Minute Clinic Page Assertion Successful");
	}catch (Throwable t) {
		System.out.println("Minute Clinic Page Assertion failed");
	}
	}
}
