Feature: Sort Items on Price

Scenario: User should be able to verify the last name Error Msg
Given User is in the Log in page of SauceDemo
When he Enters the username 
And he enters the password 
And he clicks on the log in button
And he adds the fisrt product to cart
And he clicks on the cart icon
And he click on the checkout button
And he enters the the first name 
And he enters the last name
And he enters the postal code
And he clicks on the continue button
Then User should be able to see last name error message 
