package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

/**
 * @author CHIRAG
 *
 */
public class TestBase {

	//private static WebDriver driver;
	public static AppiumDriver driver;
	public static String AndroidloadPropertyFile = "Android_App.properties";
	//public static String IOSloadPropertyFile = "IOS_App.properties";
	//public static Properties props=new Properties();
	//public static String scrPath;
	public String platform;
	

	
	@Before("@appium")
	public void setUpAppium() throws IOException
	{
	
		platform  = System.getProperty("platform");
		platform = platform.toLowerCase().trim();
		
		if(driver==null){
			
			if(platform.equals("ios")){
		//	CommonUtils.loadIOSConfigProp(IOSloadPropertyFile);
			CommonUtils.setIOSCapabilities();
			driver = CommonUtils.getIOSDriver();
		
	
			}else if (platform.equals("android")){
			CommonUtils.loadAndroidConfigProp(AndroidloadPropertyFile);
			CommonUtils.setAndroidCapabilities();
			driver = CommonUtils.getAndroidDriver();
		} 
		
		}
		
	}
	
	//}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	public static AppiumDriver getDriver()
	{
		return driver;
	}
}
