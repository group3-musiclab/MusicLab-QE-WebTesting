@Capstone @Class
Feature: Upload Jadwal

  Scenario Outline : Upload jadwal with valid
    Given User click button login on home page
    When User input "mafa.alfa13@gmail.com" as email "123" as password and "Mentor" as role
    And Click login button
    Then User already on home page again
    And Mentor click hari
    And Mentor input jam mulai jam selesai
    Then click save button

    Examples:
      | Hari   | Jam mulai | Jam selesai |
      | Monday | 14:00     | 15:00       |