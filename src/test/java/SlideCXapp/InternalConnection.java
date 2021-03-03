package SlideCXapp;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.Connection;
import pageObjects.AppLogin_Elements;
import resources.baseapp;

public class InternalConnection extends baseapp{
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		


    AndroidDriver<AndroidElement>	driver = Capabilities();
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(1000);
	    
	    

    AppLogin_Elements ape = new AppLogin_Elements(driver);
  
    //Entering user ID
    Thread.sleep(1000);
    ape.UserID().sendKeys("username");
    
    //Entering Password
    Thread.sleep(1000);
    ape.Password().sendKeys("password");
    
    //Tapping on Login Button
    Thread.sleep(1000);
    ape.Login_Button().click();
    
    
   //Internet Connection (Verifying Internet Connection)
   assertEquals(Connection.ALL, driver.getConnection());
   

   //Getting the title of the news page. 
   System.out.println(ape.News_Page().getText());


    //Taking Screenshots
	takeScreenshot("News Page");
    

    //Scroll horizonntally 
	driver.findElement(MobileBy.AndroidUIAutomator("driver().findElementByAndroidUIAutomator(\"new UiScrollable(new UiSelector().scrollable(true).\"\n" + 
			"                + \"resourceId(\\\"<id of scrollable control>\\\"))\"\n" + 
			"                + \".setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\"<text to search for>\"))\"); "));
	     
	
	 //Taking Screenshots
		takeScreenshot("NewsPageScrollImages");
	    
   
    
    
    
	
}
	

    
    
}

public static void takeScreenshot(String fileName) throws IOException {
	
	// Take Screenshot
	File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	// now copy the screen shot to desired location using copy file method
	FileUtils.copyFile(file, new File("/Users/osamazafar/Desktop/Grocer/grocer"+fileName+".jpg"));
				
		
	}

	
	

}