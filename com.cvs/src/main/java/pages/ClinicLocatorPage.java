package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ClinicLocatorPage extends BasePage {
	public ClinicLocatorPage() {
		PageFactory.initElements(driver, this);
	}

	

	public String getZipcode(String zipCode) {
		List<WebElement> Elements = driver
				.findElements(By.xpath("//div[@class='address-information']//descendant::div[3]"));
		for(WebElement element: Elements)
			if(element.getText().contains(prop.getProperty("zipcode"))) {
				System.out.println(element.getText());
				return element.getText();
			}
		return null;
		
	}

}
