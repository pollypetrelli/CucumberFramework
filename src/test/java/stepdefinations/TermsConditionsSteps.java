package stepdefinations;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.EmailScreen;
import pages.IntroductionScreen;
import pages.TermsandConditionsScreen;


public class TermsConditionsSteps {
	
	@Given("^I am on the Terms policy screen$")
	public void i_am_on_the_Terms_policy_screen() {
	
     	 new IntroductionScreen().pressStartedBtn();
	  
	}
	
	@When("^I accept the Terms of Services$")
	public void i_accept_the_Terms_of_Services() {
	  
		new TermsandConditionsScreen().tandcs();
	  
	}

	@When("^I click the Continue button$")
	public void i_click_the_Continue_button() {
	   
		new TermsandConditionsScreen().continueBtn();
	}

	@Then("^I should see the email screen$")
	public void i_should_see_the_email_screen() {
		
		Assert.assertEquals(new EmailScreen().getTitle(), "What's your email address?");
		     
		 	
	}


}
