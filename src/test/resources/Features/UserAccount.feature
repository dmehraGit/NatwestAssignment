Feature: My Account
  In order to update personal information
  As a customer,
  I require a my account section

  Scenario: Customer is able to change their first name
    Given User has signed in
    And User is on the the personal information page
    When User updates the first name to "Natwest"
    Then the personal information should be updated successfully