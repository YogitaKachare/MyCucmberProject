Feature: Validating the authentic user
  
Background:
Given      open the landing page


  
  Scenario: Valid User
    
    When   username as "standard_user" in usernamefield
    And    password as "secrete_sauce" in passwordfield
    And    click on login button
    Then   homepage should appear
 
  
   Scenario:  Invalid User Valid password
    
    When   username as "standard" in usernamefield
    And    password as "secrete_sauce" in passwordfield
    And    click on login button
    Then   User should Stay on login Page
 
   Scenario: Invalid User Invalid password
    
    When   username as "standard" in usernamefield
    And    password as "secrete" in passwordfield
    And    click on login button
    Then   User should Stay on login Page
 
   Scenario: Valid User Invalid password
    
    When   username as "standard_user" in usernamefield
    And    password as "secrete" in passwordfield
    And    click on login button
    Then   User should Stay on login Page
    
 
  