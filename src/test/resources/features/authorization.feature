Feature: Check invalid authorization

  Background:
    Given The user on AutoRia page

  Scenario: The user can't authorization with invalid data #1
    Given The user click on Login in link
    And The user enter in invalid telephone = "032679" number
    Then The error message is displayed on the authorization page