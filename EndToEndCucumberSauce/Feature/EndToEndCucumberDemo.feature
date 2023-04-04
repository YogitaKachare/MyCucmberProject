Feature: Login with authenticated user

Scenario: Valid login 
Given land to saucedemo home page
And give Username
And  give password
And  Click on login button
Then verified user
And I have to add the following items into cart by list
|//button[@id='add-to-cart-sauce-labs-backpack']|//button[@id='add-to-cart-sauce-labs-bike-light']|//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']|//button[@id='add-to-cart-sauce-labs-fleece-jacket']|//button[@id='add-to-cart-sauce-labs-onesie']|//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']|
Then locate my shopping cart
Then Move to check out page
Then continueToShop with check out infomation by list
|Yogita|Kachare|410206|
Then Finish Shopping
Then Click Menu Button To Logout