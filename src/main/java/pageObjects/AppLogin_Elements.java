package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class AppLogin_Elements {

public WebDriver driver;
	
	//Grocer Login
	    
	    By login =  By.id("com.xxx.shop.dev:id/llGotoLogin");
	    By userid = By.id("com.xxx.shop.dev:id/etEmailSignup");
	    By pass  =  By.id("com.xxx.shop.dev:id/etPassword");
	    By LoginBtn = By.id("com.xxx.shop.dev:id/login");
	    By getUserTitle = By.id("com.xxx.shop.dev:id/title");
	    
	    By login_text  =  By.id("com.xxx.shop.dev:id/etPassword");
	    By password_text = By.id("com.xxx.shop.dev:id/login");

	    By News_Page = By.id("com.xxx.shop.dev:id/newspage");
	    
	    
	    
	    //Redirection of Image link
	    
	    By img_link = By.id("com.xxx.shop.dev:id/imglink");




	    
	    

		 public AppLogin_Elements (WebDriver driver) {
				// TODO Auto-generated constructor stub
				 
				 this.driver=driver;
				 
			}


	    
	    
	    
		public WebElement Login() {
			 
			 
			 return driver.findElement(login);
			 
		 }
	

	public WebElement UserID() {
		 
		 
		 return driver.findElement(userid);
		 
	 }
	

	public WebElement Password() {
		 
		 
		 return driver.findElement(pass);
		 
	 }
	
	public WebElement Login_Button() {
		 
		 
		 return driver.findElement(LoginBtn);
		 
	 }
	
	
	
	public WebElement Get_Title() {
		 
		 
		 return driver.findElement(getUserTitle);
		 
	 }
	

	    
		public WebElement Login_Text() {
			 
			 
			 return driver.findElement(login_text);
			 
		 }
		
		public WebElement Password_Text() {
			 
			 
			 return driver.findElement(password_text);
			 
		 }
		
		public WebElement News_Page() {
			 
			 
			 return driver.findElement(News_Page);
			 
		 }
		

		public WebElement ImageLink() {
			 
			 
			 return driver.findElement(img_link);
			 
		 }

	
}
