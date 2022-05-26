package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {     
   WebDriver driver;   //this driver has to be called in order to interact with webElements
   
   public LoginPage(WebDriver driver) {    // public login is a constructor to connect driver to webdriver
	   this.driver = driver;
   }
   //Element Library
   @FindBy(how = How.XPATH, using = "//input[@id='username']")
   WebElement UserName;
   @FindBy(how = How.XPATH, using = "//input[@id= 'password']")
   WebElement Password;
   @FindBy(how = How.XPATH, using = "//button[@name='login']")
   WebElement SignInButton;
   
   //Methods to interact with the elements
   public void enterUserName(String username) {
	   UserName.sendKeys(username);//variable and webName username
	   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		  e.printStackTrace();
		}
   }
	   public void enterPassword(String password) {
	    Password.sendKeys(password);
	    try {
			Thread.sleep(3000);
		   } catch (InterruptedException e) {
			e.printStackTrace();
		   }
	}
	    public void clickSignInButton() {
		   SignInButton.click();
        try {
		Thread.sleep(3000);
	   } catch (InterruptedException e) {
		e.printStackTrace();
	 	}	
	 }	
       
         //public void login(String userName, String password) {  Method has both userName and password
//	   	  UserName.sendKeys(userName);
//		  Password.sendKeys(password);
//	  }
	   
   public String getPageTitle() {  //gets title of the page
	   return driver.getTitle();
     
   }
   
}
