
Feature: Filter search results on eBay for cell phones

  Scenario: User filters cell phone search results on eBay
    Given the user is on the eBay homepage
    When the user clicks on Shop by category
    And the user clicks on Electronics
    And the user clicks on Cell Phones & Accessories
    And the user clicks on See all in Cell Phones & Acces
    And the user clicks on Cell Phones & Smartphones
    And the user clicks on All Filters
    And the user clicks on Screen Size
    And the user clicks on SetScreensize
    And the user clicks on Price
    And the user enters "20" into Minimum Value
    And the user enters "30" into Maximum Value
    And the user clicks on Item Location
    And the user clicks on US Only
    And the user clicks on Apply
    Then I should see the filter tags applied
