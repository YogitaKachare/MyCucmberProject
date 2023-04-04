Feature: Login with authenticated user

Scenario: Multiple User valid login 
Given User is on Home Page
When User Navigate to LogIn Page
And User enters Credentials to LogIn	
		| Username   		| Password		 |
    | standard_user | secret_sauce |
    | Yogita | Yogita123 |
    |	problem_user	|	secret_sauce	|
Then Message displayed Login Successfully