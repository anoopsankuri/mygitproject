@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @LoginPage
  Scenario: Login to Bank Home page
    Given The user is in login page
    When The user enter valid login details
    And Click submit button
    And The user navigates home page to Telecome home page
    Then The user should see success message

  @AddCustomer
  Scenario Outline: To Add a new customer in Telecom page
    Given The user Bank home page
    And The user navigate to telecom register page
    When The user enter valid details
    Then The user should see success message after register
