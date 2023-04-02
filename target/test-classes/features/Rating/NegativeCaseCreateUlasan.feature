@Capstone @CreateUlasanNegativeCase
Feature: [Negative Case] Validation And Create Ulasan
  This test case is everything about Negative Case Create Ratings

  Scenario: User login with valid parameter
    Given User click button login on home page
    When User input "mafa.alfa75@gmail.com" as email "321" as password and "Student" as role
    And Click login button
    Then User already on home page again