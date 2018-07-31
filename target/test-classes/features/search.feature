Feature: Search verification
  Scenario Outline: The search results correspond to the specified parameters
    Given The user on AutoRia page
    When The user enters the "<car brand>","<region>" in the search form
    And The user clicks on search button
    Then The user sees that results of search match the specified search parameters "<region>"
    Examples:
    |car brand|region  |
    |Audi     |Киев    |
    |BMW      |Винница |