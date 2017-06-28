Feature: Anthem home page menu

  Scenario: Access the login page through the menu toggle and enter a username
    Given when on the Anthem home page
    When click the menu toggle
    And click the login link
    Then I enter CHICKENS into the userfield
