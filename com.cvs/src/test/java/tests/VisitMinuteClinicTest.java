package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.ClinicLocatorPage;
import pages.VisitMinuteClinicPage;
import util.BrowserFactory;

public class VisitMinuteClinicTest extends BasePage {
	VisitMinuteClinicPage clinicPage;
	ClinicLocatorPage clinicLocatorPage;
	@BeforeMethod
	
	public void goToSite() { 
		BrowserFactory.setUp();
		clinicPage = new VisitMinuteClinicPage();
		clinicLocatorPage = new ClinicLocatorPage();
	}
	@Test(priority=1, enabled = false)
	public void verifyPage() {
		boolean verify =clinicPage.verifyLogo();
		Assert.assertTrue(verify);
		getTitle();
	}
	@Test(priority=2,enabled = false)
	public void visitMinuteClinicTest() throws InterruptedException {
		clinicPage.visitMinuteClinic();
		Thread.sleep(5000);
		clinicPage.findClinic();
		clinicPage.searchForClinic();
	}
	@Test(priority=3)
	public void verifyZipCodeDisplayed() throws InterruptedException {
		clinicPage.visitMinuteClinic();
		Thread.sleep(5000);
		clinicPage.findClinic();
		clinicPage.searchForClinic();
		String actualZip=clinicLocatorPage.getZipcode("zipCode");
		System.out.println("Actual is :" +actualZip);
		Assert.assertEquals(actualZip, prop.getProperty("zipcode"));
	}
	@AfterMethod
	public void closeEverything() {
		//tearDown();
	}
}
