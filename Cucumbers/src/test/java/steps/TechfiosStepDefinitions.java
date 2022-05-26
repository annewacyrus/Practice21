//package steps;
//
//import org.openqa.selenium.support.PageFactory;
//
////import cucumber.api.PendingException;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//import pages.LoginPage;
//import pages.TestBase;
//
//public class TechfiosStepDefinitions extends TestBase {//extends TestBase, becomes part of step def
//	LoginPage loginPage;
//	
//	@Before
//	public void beforeRun() {
//	initDriver(); //initializing webdriver 
//		loginPage = PageFactory.initElements(driver, LoginPage.class);// page factory loginpg will be defined before being run on each element
//	}
//	
//	
//	//Given User is on techfios login page
//	@Given ("^User is on techfios login page$")
//	public void user_is_on_techfios_login_page() {
//		//System.out.println("Given User is on techfios login page");
//		driver.get("https://techfios.com/billing/?ng=login/");
//	}
//	
//	//When User ("^enters username as "demo@techfios.com"$")
//	@When ("^User enters username as \"([^\"]*)\"$")//requires login page object
//	public void user_enters_username_as(String username) throws InterruptedException{
//		//System.out.println("Given User is on techfios login page");
//		//loginPage = PageFactory.initElements(driver, LoginPage.class);-defined 1st @Before
//		loginPage.enterUserName(username);
////	    try {
//		Thread.sleep(3000);
////	    } catch (Interruptedexception e) {
////	      e.printStackTrace();
////	    }
//	}
//	
//	//When User enters password as "abc123"
//	@When ("^User enters password as \"([^\"]*)\"$")
//	public void user_enters_password_as(String password)  {
//		//System.out.println("When User enters password as \"abc123\"");
//	  loginPage.enterPassword(password);
//	    
//	    }
//	//When ("^User clicks on signin button$")
//	@When ("^User clicks on signin button$")
//	public void user_clicks_on_signin_button()throws Throwable {
//		//System.out.println("When User clicks on signin button");
//		loginPage.clickSignInButton();
//	}
//	
//	@Then ("^User should land on dashboard page$")
//	public void user_should_land_on_dashboard_page() throws Throwable {
//		//System.out.println("Then User should land on dashboard page");
//		Assert.assertEquals("Dashboard- iBilling ", loginPage.getPageTitle());
//	    takeScreenshot(driver);
//	}
//	@Then ("^User should not land on dashboard page$")
//	public void user_should_land_not_on_dashboard_page() throws Throwable {
//		//System.out.println("Then User should land on dashboard page");
//		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
//	}
//	 //When User enters "username" from techfios database
//	@When("^User enters \"([^\"]*)\" from techfios database$")
//	public void user_enters_from_techfios_database(String loginData) throws Throwable {// loginData takes both username and password
//	  
//	switch(loginData) {                      //use of switch and break, based on the login data
//	case "username":
//	     
//		break;
//	case "password":
//			
//	       break;
//	   
//	    default:
//	System.out.println("unable to enter login data from DB!");
//	}
//	
//	}
//	
//	
//	
//	
//	@After
//   public void tearDown() {
//	    driver.close();
//	   driver.quit();
//   }
//}
//	

