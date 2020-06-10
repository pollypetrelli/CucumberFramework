package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.TestBase;

public class BasePage {
	
	 private AppiumDriver driver;
	    

	    public BasePage(){
	        this.driver = TestBase.getDriver();
	        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
	    }

}
