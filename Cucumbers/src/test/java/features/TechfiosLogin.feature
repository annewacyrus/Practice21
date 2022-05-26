@LoginFeature @Regression

Feature: Techfios billing login page functionality Validation

Background:Given User is on techfios login page

@Scenario1 @smoke
Scenario: Login with valid credentials
When User enters username as "demo@techfios.com"
When User enters password as "abc123"
And User clicks on signin button
Then User should land on dashboard page

@Scenario2 
Scenario: Login with incorrect username 
When User enters username as "demo2@techfios.com"
When User enters password as "abc123"
And User clicks on signin button
Then User should not land on dashboard page

