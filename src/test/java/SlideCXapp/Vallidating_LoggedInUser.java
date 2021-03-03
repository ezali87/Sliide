package SlideCXapp;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.AppLogin_Elements;
import pageObjects.Login_Elements;
import pageObjects.Misc_elements;
import pageObjects.SignUp_Elements;
import resources.base;
import resources.baseapp;

public class Vallidating_LoggedInUser extends baseapp {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub



	    AndroidDriver<AndroidElement>	driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Thread.sleep(1000);
	    
	    
	     AppLogin_Elements ape = new AppLogin_Elements(driver);
	      
	    //Logged In in the previous testcase so it will get logged in 
	    //Scenario 4 - user opens app next time (when previously logged in)
	     
	     
	     //Getting the title of the news page. 
	    System.out.println(ape.News_Page().getText());
	    
	    // Taking Screenshots
		takeScreenshot("News page");
	     

	    
	    
	}
	
	public static void takeScreenshot(String fileName) throws IOException {
		
		// Take Screenshot
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// now copy the screen shot to desired location using copy file method
		FileUtils.copyFile(file, new File("/Users/osamazafar/Desktop/Grocer/grocer"+fileName+".jpg"));
					
			
		}

}