@US_014
Feature:Register Page
  User story:

  As a user, I should be able to see the functionality of the register page
  and check valid/invalid name, surname and email.

  Acceptance criteria:

  Name, Surname, Email, Password fields must be visible.
  Name, Surname, Email, Password fields must be functional.
  Name, Surname, Email, Password fields should not be left blank.
  A warning should appear if no valid email has been entered: Please enter a valid email

  Background:User should be on register page as a client
    Given user is on home page
    When user hovers over sign up button
    And user selects client from opened menu
    Then user on client register page

  @US_014-TC001

  Scenario: Name, Surname, Email, Password fields must be visible.
    Then assert Name field is displayed
    Then assert Surname field is displayed
    Then assert Email field is displayed
    Then assert Password field is displayed

  @US_014-TC002

  Scenario: Name, Surname, Email, Password fields must be functional.





