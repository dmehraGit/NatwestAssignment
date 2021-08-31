Feature: Order Workflow
  In order for items to be purchased
  As product owner,
  I require a customer ordering work flow

  Scenario: Customer is able to order an T-shirt and verify the order in order history
    Given User has signed in
    And User has added a t-shirt to shopping cart
    When User confirms payment for the order
    Then the purchase should be successful
    And the item should be displayed in order history