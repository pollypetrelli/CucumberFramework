package pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EmailScreen extends BasePage {
	
	@AndroidFindBy (id = "com.youtility.test:id/tvInstruction") 
	@iOSXCUITFindBy (id = "test-Username")
	private MobileElement titleTxt;
	
	
	    public String getTitle() {
			return titleTxt.getText();
		}
	    
	   
	       
	        
	    

}
