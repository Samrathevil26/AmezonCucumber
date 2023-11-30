Feature: Amazon App Automation

  Scenario: Successful Login
    Given I navigate to the Amazon login page
    When I enter valid login credentials
    Then I should be logged in successfully

  Scenario: Successful Registration
    Given I navigate to the Amazon registration page
    When I enter valid registration details
    Then my account should be created successfully

  Scenario: Search for a Product
    Given I am logged in to the Amazon app
    When I search for a product with keyword "laptop"
