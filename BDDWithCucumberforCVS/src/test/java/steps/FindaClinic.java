package steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.CVSBasePage;
import page.CVSClinicLocatorPage;
import page.MinuteClinicPage;
import util.CVSBrowserFactory;

public class FindaClinic extends CVSBasePage {	
	
	MinuteClinicPage minuteclinicpage;
	CVSClinicLocatorPage cliniclocator;	
	
	@Before
	public void beforeRun() {
		CVSBrowserFactory.startBrowser();
	}	
		
	@Given("^user is already on the cvs pharmacy minute clinic page$")
	public void user_is_already_on_the_cvs_pharmacy_minute_clinic_page() throws Throwable {
			
		minuteclinicpage = new MinuteClinicPage();
		minuteclinicpage.minuteClinic();
		minuteclinicpage.MinuteAssertion();
	}

	@When("^user enters their \"([^\"]*)\"$")
	public void user_enters_their(String zipcode) throws Throwable {
		minuteclinicpage = new MinuteClinicPage();
		minuteclinicpage.Typezipcode(zipcode);
		POPup();
	    
	}

	@Then("^user should be able to get the locations of the minute clinic within his zip code\\.$")
	public void user_should_be_able_to_get_the_locations_of_the_minute_clinic_within_his_zip_code() throws Throwable {
			    
	    cliniclocator = new CVSClinicLocatorPage();	
	    Thread.sleep(3000);
	    cliniclocator.cliniclocatorpage();	    
	    cliniclocator.clinicpageAssertion();
	   
	    String actual = cliniclocator.cliniclocatorpage();
	    String expected = "Denton, TX 76210";
	    Assert.assertEquals(actual, expected, "Wrong Zipcodes");
	    System.out.println(actual);
	}
	
	
	@After
	public void shutdown() {
	
}

}
