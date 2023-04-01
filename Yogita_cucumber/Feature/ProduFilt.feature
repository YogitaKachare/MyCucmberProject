Feature: Verify ll filter option
@funcional
 Scenario Outline: filter options by name
 
 
 Given  Open product page
 When   Apply filter by <name> of the filter
 
 
 Examples: 
 |name                |
 |Name (A to Z)       |
 |Name (Z to A)       |
 |Price (low to high) |
 |Price (high to low) |
  

 
 
 
 
 