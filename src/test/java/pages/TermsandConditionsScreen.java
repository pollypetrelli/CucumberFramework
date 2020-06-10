package pages;

	
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utility.TestBase;

import org.openqa.selenium.By;

	public class TermsandConditionsScreen extends BasePage{
		
		@AndroidFindBy (id = "com.youtility.test:id/cbTermsAndConditions")
		@iOSXCUITFindBy (id = "test-Username")
		private MobileElement tickTandCs;
		
		@AndroidFindBy (id = "com.youtility.test:id/btnContinue")
		@iOSXCUITFindBy (id = "test-Username")
		private MobileElement continueBtn;
		
		public TermsandConditionsScreen tandcs() {
			tickTandCs.click();
			return this;
		
	}

	     public EmailScreen continueBtn() {
		   continueBtn.click();
		   return new EmailScreen();
		
	}

	}


