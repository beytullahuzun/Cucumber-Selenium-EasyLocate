@eShop @Usability
Feature: Search functionality on eShop module

  Scenario: user can search for desired clothing using search bar
    Given user is at main page
    When user enters "shoes" in search bar
    And user clicks search button
    Then only items with keyword "shirt" should be filtered out

  Scenario: user can search for desired clothing using search bar's suggestions
    Given user is at main page
    When user enters "shir" in search bar
    Then suggestion containing word "shoes" should be displayed
    When user chooses the suggestion
    Then product page is opened with word "shir" in it's name

  Scenario: No items are returned if user enters search term with no matches
    Given user is at main page
    When user enters "trousers" in search bar
    And user pushes search button
    Then no items are found for search term "trousers"

  Scenario: Invalid characters in search term are ignored 
    Given user is at main page
    When user enters "shoes" in search bar
    And user pushes search button
    Then only items with keyword "shoes" should be filtered out
  Scenario: No items are returned if user enters too long string
    Given user is at main page
    When user enters 300 characters long string in search bar
    And user pushes search button
    Then no items are found
