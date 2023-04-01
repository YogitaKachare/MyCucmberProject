Feature: select single product

Background: 
Given User login to application

@Group1
Scenario: Select with product Name
When click on product with Name as"Sauce Labs Backpack"
Then Product page should open
And Add to cart
And back to product

@Group1
Scenario: Select with Image of product
When Click on image of product
And add to basket