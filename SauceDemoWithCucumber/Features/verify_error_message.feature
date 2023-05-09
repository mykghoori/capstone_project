Feature: Verify Error Message

Scenario: A User should be able to see Error message.
Given user is the login page of SauceDemo web
When he Enters username to login box 
And he Enters password to password box 
And he clicks on the login button
Then user should see the error message "‘Epic sadface: Sorry, this user has been locked out."

