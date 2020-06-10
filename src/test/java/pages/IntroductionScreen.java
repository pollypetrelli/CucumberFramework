package pages;

	
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.TestBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import org.openqa.selenium.By;

	public class IntroductionScreen extends BasePage {
		
		@AndroidFindBy (id = "com.youtility.test:id/btnGetStarted") 
		@iOSXCUITFindBy (id = "test-Username")
		private MobileElement getStartedButton;
		
		public TermsandConditionsScreen pressStartedBtn() {
	     	getStartedButton.click();
			return new TermsandConditionsScreen();
		}

	}

