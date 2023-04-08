@Capstone @CreateUlasanNegativeCase
Feature: [Negative Case] Validation And Create Ulasan
  This test case is everything about Negative Case Create Ratings

  Scenario: Validate Field Comments with Over Character
    Given User click button login on home page
    When User input "studentmusiclab@gmail.com" as email "@Qwerty1234" as password and "Student" as role
    And Click login button
    Then User already on home page again
    And Student click button profile
    And Student click button jadwal
    And Validate history belajar page -Beri Ulasan
    And Click button next page
    Then Student click button beri ulasan
    And Student input comments "Sejarah Perang Baratayudha (Perang Pandawa dan Kurawa) written by Devita Retno Perang keluarga Bharata atau Baratayudha adalah puncak dari perseteruan yang terjadi antara Pandawa dan Kurawa. Semua ini bermula karena pihak Kurawa yang berambisi untuk menguasai Astinapura secara penuh kemudian melakukan segala cara untuk menyingkirkan Pandawa yang sebenarnya merupakan saudara mereka."
    And Validate comments field with 300 character
    And Click Button Log Out

  Scenario: Student Do Not Fill In The Field Comment
    Given User click button login on home page
    When User input "studentmusiclab@gmail.com" as email "@Qwerty1234" as password and "Student" as role
    And Click login button
    Then User already on home page again
    And Student click button profile
    And Student click button jadwal
    And Validate history belajar page -Beri Ulasan
    Then Student click button beri ulasan
    And Student give ratings 5 stars
    Then Click submit ulasan
    And Validate Pop-up message failed give ratings
    And Click Button Log Out

  Scenario: Student Not Give Stars Rating
    Given User click button login on home page
    When User input "studentmusiclab@gmail.com" as email "@Qwerty1234" as password and "Student" as role
    And Click login button
    Then User already on home page again
    And Student click button profile
    And Student click button jadwal
    And Validate history belajar page -Beri Ulasan
    And Click button next page
    Then Student click button beri ulasan
    And Student input comments "Kursus yang sangat mantap"
    Then Click submit ulasan
    And Validate Pop-up message success give ratings
    And Click Button Log Out

  Scenario: Student Create Ulasan with blank content
    Given User click button login on home page
    When User input "studentmusiclab@gmail.com" as email "@Qwerty1234" as password and "Student" as role
    And Click login button
    Then User already on home page again
    And Student click button profile
    And Student click button jadwal
    And Validate history belajar page -Beri Ulasan
    And Click button next page
    Then Student click button beri ulasan
    Then Click submit ulasan
    And Validate Pop-up message failed give ratings
    And Click Button Log Out