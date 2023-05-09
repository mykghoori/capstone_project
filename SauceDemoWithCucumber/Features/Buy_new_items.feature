Feature: Buy new items 

Scenario: A user should be able to add two items and buy it successfully
Given User is in the login page of SauceDemo 
When he enters username to login box 
And he enters password to pasword boc 
And he clicks on th login button
And User is on new page of products 
And he add the first product to the cart
And he add the second product to the cart
And he clicks on the cart button
And he clicks on the checkout button
And he enters his first name
And he enters his last name
And he enters the postal code
And he clicks on the contiue button
And he clicks on the finish button
Then User should see the last Message "Your order has been dispatched, and will arrive just as fast as the pony can get there!"