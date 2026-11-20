Feature: Implicit and Explicit wait Using Amazon Page
  description: Assignment#1 is done using Junit (refer assignments package) and also using Cucumber

  Background:
    Given User go to page "https://www.amazon.in/"

  Scenario: Search for Toys in Amazon page
    When Searches for "New Toys"
    Then Verifies page displays results and loads completely