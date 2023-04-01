
Feature:  Sauce user Logout 
 
  Scenario: Logout the User
  
    Given user login to the home page
    When User enter username 
    And  User enter password
    And click on login button
    Then Home page Appear
    Then click on header menu  button
    And click on  logout button
    
  