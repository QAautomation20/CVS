package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class cvsPage {

	public abstract String getTitle();
	public abstract void Wait (WebElement Element);
	public abstract void Wait (WebElement element, long Time);

}
