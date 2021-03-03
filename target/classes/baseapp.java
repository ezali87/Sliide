package resources;

import static resources.baseapp.driver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseapp {

	protected static AndroidDriver<AndroidElement>  driver;

	 
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException{
		File f = new File("src/test/java");
		File fs = new File(f, "Staging.apk");
		
		

	//	File fs = new File(f, "Rider Staging 1.2.1.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		
	//	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3");
		
		//Real Device
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
		cap.setCapability(MobileCapabilityType.VERSION, "8.0");
		cap.setCapability("noReset", "true");
		cap.setCapability("fullReset", "false");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability("unicodeKeyboard", "true");                                     
		cap.setCapability("resetKeyboard", "true");



		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		 // turn on all (data and wi-fi)
	     driver.setConnection(Connection.ALL);
	     
	     // turn off all (data and wi-fi)
	     driver.setConnection(Connection.NONE);


		
		

		return driver;

		
				
		

		
		
	}

}
