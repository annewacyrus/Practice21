package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class TechfiosBankStepsDefinition extends TestBase{
	LoginPage loginpage;
	
	
	
	//initDriver(); //initializing webdriver 
//	driver.get("https://techfios.com/billing/?ng=login/");
	// page factory loginpg will be defined before being run on each element
	
	
		
	//when user enters a valid username and password
@Given("^user enters valid username and password$")
public void user_enters_valid_username_and_password()  {
	loginpage = PageFactory.initElements(driver, LoginPage.class);
	loginpage.enterUserName("demo@techfios.com");	
	loginpage.enterPassword("abc123");
	loginpage.clickSignInButton();
}	   


//When user navigates to new account page
@When("^user navigates to new account page$")
public void user_navigates_to_new_account_page()  {
    
}
//Then new account page will be displayed
@Then("^new account page will be displayed$")
public void new_account_page_will_be_displayed() throws Throwable {
    
}
//When user creates a new account using title "A&N account" 
@When("^user creates a new account using title \"([^\"]*)\"$")
public void user_creates_a_new_account_using_title_something(String strArg1) throws Throwable {
    
}
//And user enters description "savings" 
@And("^user enters description \"([^\"]*)\"$")
public void user_enters_description_something(String strArg1) throws Throwable {
    }
//And user adds initial balance "$500" 
@And("^user adds initial balance \"([^\"]*)\" $")
public void user_adds_initial_balance_something(String strArg1) throws Throwable {
    
}
//And user provides account number "78002"
@And("^user provides account number \"([^\"]*)\"$")
public void user_provides_account_number_something(String strArg1) throws Throwable {
    
}
//And user enter contact person "Nganga" 
@And("^user enter contact person \"([^\"]*)\" $")
public void user_enter_contact_person_something(String strArg1) throws Throwable {
   
}
//And user will add phone number "9872311234"
@And("^user will add phone number \"([^\"]*)\"$")
public void user_will_add_phone_number_something(String strArg1) throws Throwable {
    
}
//And user will provide internet banking URL "MDIslam@techfios.com"
@And("^user will provide internet banking URL \"([^\"]*)\"$")
public void user_will_provide_internet_banking_url_something(String strArg1) throws Throwable {
    
}
//Then user clicks the submit button
@Then("^user clicks the submit button$")
public void user_clicks_the_submit_button() throws Throwable {
    
}
//Then user should be able to validate account created successfully
@Then("^user should be able to validate account created successfully$")
public void user_should_be_able_to_validate_account_created_successfully() throws Throwable {
    
}

}







