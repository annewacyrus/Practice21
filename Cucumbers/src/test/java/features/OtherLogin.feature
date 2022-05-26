@OtherLoginFeature @Regression

Feature: Techfios billing other login page functionality Validation

Background:Given User is on other techfios login page

@OtherScenario1
Scenario Outline: Login with incorrect username(other)
When User enters username as "<username>"
When User enters password as "<password>"
And User clicks on signin button
Then User should not land on dashboard page

Examples:
|username|password|
|demo2@techfios.com|abc123|
|demo@techfios.com|abc124|
|demo@techfios.com|abc124|



#@OtherScenario1
#Scenario: Login with incorrect password(other)
#When User enters username as "demo@techfios.com"
#When User enters password as "abc123"
#And User clicks on signin button
#Then User should land on dashboard page
#
#@OtherScenario2 @smoke
#Scenario: Login with incorrect username(other) 
#When User enters username as "demo2@techfios.com"
#When User enters password as "abc123"
#And User clicks on signin button
#Then User should not land on dashboard page
#
#@OtherScenario2 @smoke
#Scenario: Login with incorrect username and password(other) 
#When User enters username as "demo2@techfios.com"
#When User enters password as "abc124"
#And User clicks on signin button
#Then User should not land on dashboard page