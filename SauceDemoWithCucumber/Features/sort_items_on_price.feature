Feature: Sort Items On low to high price

Scenario: User Shoud Be able to sort items on low to high price 
Given User is in the log in Page of SauceDemo
When he enters the username in the username box
And he enters the password to pasword box
And he clicks on the log In button
And he sort the items from low to high price
And he add  the first product to the cart
And he click on the cart button
And he click on the Checkout button
And he enters the First name
And he enters the Last name 
And he enters the Postal code 
And he clicks on the Continue button
And he click on the finish button
Then User should see the last success message 'Thank you for your order!'
