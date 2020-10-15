package page;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CVSClinicLocatorPage extends CVSBasePage {	
	
	public CVSClinicLocatorPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String cliniclocatorpage() {
		
		
	List<WebElement> elements = driver.findElements(By.xpath("//div[@class='address-information']//descendant::div[3]"));
	
		for (WebElement Element: elements) {
			if (Element.getText().contains("Denton, TX 76210")){
				System.out.println("For LOOP  "  + Element.getText());
				return Element.getText();				
			}			
		}
		return null;	
	}
	
	public void clinicpageAssertion() {
		String Expected = "Clinic locator";
		String Actual = driver.findElement(By.xpath("//h1[text() = 'Clinic locator']")).getText();
		System.out.println("Clinic locator page =  " + Actual);
		
		
		try {
		Assert.assertEquals(Actual, Expected);
		System.out.println("Clinic Locator Page Assertion Successful");
		} catch (Throwable t) {
			System.out.println("Clinic Locator Page Assertion Unsuccessful");
		}
		
	}

}
