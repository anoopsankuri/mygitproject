#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Register New Telecome Customer
  Scenario: To Add new customer in Guru99 Telecome domain 
    Given User need to open Guru99 bank home page with valid credentials
    And Enter Username and Password
    |mngr165127|mytUsUv|
    

    
    When Click Background Check 
    And Fill Billing address form
    |DetailA||DetailB|
		|first name||Vinoth|
		|last name||Kumar|
		|email||vinothkumar@gmail.com|
		|address||Omr Chennai Tamilnadu|
		|mobile no||8688865550|	
	
    
  
    Then After complete form User need to click submit buttons
    

 