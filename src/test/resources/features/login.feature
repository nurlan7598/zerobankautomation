Feature: Online Banking Login Feature
  Agile Story: Authorized users should be able to login so that they can do online oder
@wip
  Scenario: Only authorized users should be able to login to the application
    Given the user is on the login page
    And user logins with username "username" and password "password"
    Then the "Account Summery" should be displayed