Feature: Purchasing process

  Scenario: Buy a Product and checkout
    Given I am logged in with username "test@test.com" and password "Automation_123"
    When I buy a product
    And I check out
    Then The process is completed