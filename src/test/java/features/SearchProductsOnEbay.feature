@abc
Feature: Search for Products on Ebay

  Scenario: Search for a Product and Verify the First Result
    Given the user is on the eBay homepage
    When I type "MacBook" in the search bar
    And I change the search category to "Computers/Tablets & Networking"
    And I click on the search button
    Then the page should load completely
    And the first result name should match with the search string
