Feature: This feature test Trello API

  Scenario: Add new list to test board after title change
    Given The board exists and contains the correct information
    When I change the board title to "New Title"
    And I check the board name was updated to "New Title"
    Then I add a list with title "Example list" to the board
    And I delete the newly created list