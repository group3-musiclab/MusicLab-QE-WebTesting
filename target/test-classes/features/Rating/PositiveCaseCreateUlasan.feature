@Capstone @CreateUlasanPositiveCase
Feature: [Positive Case] Validation And Create Ulasan
  This test case is everything about Positive Case Create Ratings

  Scenario: Student Create Ulasan
    Given User click button login on home page
    When User input "studentmusiclab@gmail.com" as email "@Qwerty1234" as password and "Student" as role
    And Click login button
    Then User already on home page again
    And Student click button profile
    And Student click button jadwal
    And Validate history belajar page
    And Click button next page
    Then Student click button beri ulasan
    And Student input comments "Good Course for everyone"
    And Student give ratings 5 stars
    Then Click submit ulasan
    And Validate Pop-up message success give ratings