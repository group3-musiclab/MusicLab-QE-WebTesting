@Capstone
Feature: Upload Jadwal

  Scenario Outline : Upload jadwal with valid
    Given Mentor click hari
    When Mentor input jam mulai jam selesai
    Then click save button

    Examples:
      | Hari   | Jam mulai | Jam selesai |
      | Monday | 14:00     | 15:00       |