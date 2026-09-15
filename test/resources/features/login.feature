Feature: feature to test login functionality

  Scenario: check login is success with Valid scenerio
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user should be redirected to the homepage