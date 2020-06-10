package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
		
		
		public class CommonUtils {
			public static Properties prop = new Properties();
			public static String appiumURL;
			public static String platformName;
			public static String platformVersion;
			public static String deviceName;
			public static String appPath;
			public static String automationName;
			private static String appium_port;
			private static DesiredCapabilities capabilities = new DesiredCapabilities();
			private static URL serverUrl;
			private static AppiumDriver driver;

		//	public static void loadIOSConfigProp(String propertyFileName) throws IOException {
		//   FileInputStream fis = new FileInputStream(System.getProperty("/Users/polly.petrelli/Desktop/CucumberSkeleton/cucumber/src/main/java/resources/IOS_App.properties"));
		 //   prop.load(fis);
		//	appPath = prop.getProperty("appPath");
		//	platformName = prop.getProperty("platformName");
		//	deviceName =prop.getProperty("deviceName");
		//	appium_port = prop.getProperty("appium.server.port");
		//	platformVersion=prop.getProperty("platformVersion");
			
		// }
		
			public static void setIOSCapabilities() {
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
					//	CommonUtils.platformName);
						"IOS");
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
					//	CommonUtils.deviceName);
						"iPhone X");
				capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,
					//	CommonUtils.automationName);
						" XCUITest");
				capabilities.setCapability(MobileCapabilityType.APP,
						//CommonUtils.appPath);
						"/Users/polly.petrelli/Library/Developer/Xcode/DerivedData/Akkroo-dupxixfvxtbavycoioarhtwyyosf/Build/Products/Debug-iphonesimulator/Akkroo.app");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
						//CommonUtils.platformVersion);
						"13.3");
			}
				
						
			
			
			public static void loadAndroidConfigProp(String propertyFileName) throws IOException
			 {
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/resources/"+propertyFileName);
				
				System.out.println(fis);
				prop.load(fis);
				//automationName = prop.getProperty("android_automationName");
				//appPath = prop.getProperty("appPath");
				platformName = prop.getProperty("platformName");
				//deviceName =prop.getProperty("deviceName");
				//appium_port = prop.getProperty("appium.server.port");						
	}
			
			public static void setAndroidCapabilities() {
				
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
				CommonUtils.platformName);
				//		"Android");
				//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
				//CommonUtils.deviceName);
					//	"Pixel 2 XL API 28");
				//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,
				//CommonUtils.automationName);
						//"UiAutomator2");
				//capabilities.setCapability(MobileCapabilityType.APP, 
					//	CommonUtils.appPath);
					//	System.getProperty("user.dir")+"//App//ApiDemos.apk");
			//	capabilities.setCapability("appActivity","com.swaglabsmobileapp.SplashActivity");
			//	capabilities.setCapability("appWaitActivity", "com.swaglabsmobileapp.SplashActivity");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
				capabilities.setCapability("appiumVersion", "1.15.1");
				capabilities.setCapability("testobject_api_key","63AAFEBA1225410E8EF5D2BA808546D8");
				capabilities.setCapability("deviceOrientation", "portrait"); 
				capabilities.setCapability("testobject_app_id","1"); 
			}

			public static AppiumDriver getAndroidDriver() throws MalformedURLException {
				//serverUrl = new URL("http://127.0.0.1:4723/wd/hub");
				serverUrl = new URL("https://appium.testobject.com/wd/hub");
			//+ appium_port + "/wd/hub");		
				driver = new AndroidDriver(serverUrl, capabilities);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				return driver;
			}

			public static AppiumDriver getIOSDriver() throws MalformedURLException {
				serverUrl = new URL("http://127.0.0.1:4723/wd/hub");
			//+ appium_port + "/wd/hub");		
				driver = new IOSDriver(serverUrl, capabilities);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				return driver;
			}

		}

				
		

//}
