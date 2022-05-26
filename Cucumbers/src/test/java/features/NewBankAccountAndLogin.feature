Feature: Techfios bank and cash New Account Functionality

Scenario Outline: Login with valid credentials and open new account
Given user enters valid username and password
When user navigates to new account page
Then new account page will be displayed
When user creates a new account using title "A&N account" 
And user enters description "savings" 
And user adds initial balance "$500" 
And user provides account number "78002"
And user enter contact person "Nganga" 
And user will add phone number "9872311234"
And user will provide internet banking URL "MDIslam@techfios.com"
Then user clicks the submit button
Then user will be able to validate account created successfully
