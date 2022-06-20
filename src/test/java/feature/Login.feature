Feature: Login feature
  Scenario: Login with right data
    Given Go to home page
    When Write valid username
    And Write valid password
    And Click on login button
    Then I should see my profile