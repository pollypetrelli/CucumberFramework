Feature: Terms and Conditions

As a  User when I accept the Terms and Conditions 
I should be able to enter my email address

@appium
Scenario: Accept Terms and Conditions
Given I am on the Terms policy screen
When I accept the Terms of Services
And I click the Continue button
Then I should see the email screen
