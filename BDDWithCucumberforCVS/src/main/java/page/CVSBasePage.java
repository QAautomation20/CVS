package page;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CVSBasePage {
	
	public static WebDriver driver;
	
	public static void waitForElement(WebElement elements, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(elements));
		}

	public static void POPup() {				
		
	WebElement Popup = driver.findElement(By.xpath("//div[@class='acsAbandonButton acsModalBackdrop']//descendant::a[@title='No, thanks']"));
	
		try{   
			Actions action = new Actions(driver);
			action.moveToElement(Popup).click().build().perform();
			   
			  }
		catch(Exception e){ 
			   System.out.println("unexpected alert not present");   
			  }		
	}
	
}
//div[@class='acsAbandonButton acsModalBackdrop']//descendant::a[@title='No, thanks']