package SlideCXapp;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;
import pageObjects.AppLogin_Elements;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import resources.baseapp;

public class Login extends baseapp {


	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub



	    AndroidDriver<AndroidElement>	driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Thread.sleep(1000);
	    
	    

	      AppLogin_Elements ape = new AppLogin_Elements(driver);
	      
	      
	      
	      //Case 1 "As a user I want to log in to the app"
	      
	       String LoginText = ape.Login_Text().getText();
	       String PassText = ape.Password_Text().getText();
	       
	       //Validating the text on the login screen when the user is logged off
	       Assert.assertEquals(LoginText, "Username");
	       Assert.assertEquals(LoginText, "Password");

	       
		  //Scenario 2 - user login failed & Scenario 3 - user login succeed (credentials provided below)

	      
	      //News Page Title
	      String news_page = "News";
	      
	      File src= new File("C://Users//ibrahim.zafar//Desktop//Excel//Logincreds.xlsx");

	      FileInputStream fis = new FileInputStream(src);
	      XSSFWorkbook wb = new XSSFWorkbook(fis);
	      XSSFSheet sheet1 = wb.getSheetAt(0);
	      int rowcount= sheet1.getLastRowNum();

	      System.out.println("Total rows" +rowcount);
	      sheet1.getRow(0).createCell(0).setCellValue("username");
	      sheet1.getRow(0).createCell(1).setCellValue("password");
	   
	      
	      for (int i=1; i<=rowcount; i++) {
	    	  
	     //Getting First user name from Excel 
		  String username=sheet1.getRow(i).getCell(0).getStringCellValue();
		  System.out.println(username);
	      
		 //Getting First user name from Excel 
		  String password=sheet1.getRow(i).getCell(1).getStringCellValue();
		  System.out.println(password);
			      
	      
	      // Tapping on Login
	      Thread.sleep(1000);
	      ape.Login().click();
	      
	      //Entering user ID
	      Thread.sleep(1000);
	      ape.UserID().sendKeys(username);
	      
	      //Entering Password
	      Thread.sleep(1000);
	      ape.Password().sendKeys(password);
	      
	      //Tapping on Login Button
	      Thread.sleep(1000);
	      ape.Login_Button().click();
	      
	      //Getting User Title
	      Thread.sleep(1000);
	      String UserTitle = ape.Get_Title().getText();
	      
	      if (UserTitle.contains("Ibrahim")) {

	    	  Assert.assertEquals(news_page , UserTitle);
	    	  System.out.println("User is Logged In and re-directed to next page");
	    	
	    	  break;

	      }

	      else {
	    	  
	    	  System.out.println("Username and Password is not correct");
	    	  
	      }
	      
	     }
	      
	    
	    driver.quit();
	    
	      }
	    
	  
	}
		
		
		
	
	