Feature: Login with authenticated user

Scenario: Valid login 
Given land to home page
And provide Username
And  provide password
And  Proceed to login button
Then authenticate user
Then Click Main Menu Button To Logout