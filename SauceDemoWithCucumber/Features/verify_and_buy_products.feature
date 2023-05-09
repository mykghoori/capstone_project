Feature: Verify and Buy Products

Scenario: User Should be able to buy product and verify the success msg
Given User is in the Log in Page of SauceDemo 
When he enters username to username box 
And he enters password to password box
And he clicks on th log in button
And he add the First product to the cart
And he add the third product to the cart
And he rmoves the first product from cart
And he clicks on the Cart button
And User shoud be able to see the cart Msg 'Your Cart'
And he clicks the Continue shopping button
And he sorts the items from high to low price
And he adds the most expensive items to the cart
And he clicks on the Cart icon
And he should be able to see two items on the Cart icon
And he clicks on the Checkout button
And he enters the First Name
And he enters his Last Name
And he enters the Postal Code
And he clicks on the Contiue Button
And he clicks on the Finish Button
Then User should see the Last Message "Thank you for your order!"