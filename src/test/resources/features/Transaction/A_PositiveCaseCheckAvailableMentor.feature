@Capstone @CheckAvailMentorPositiveCase
Feature: [Positive Case] Check Schedule Mentors
  This test case is everything about Positive Case Check Mentors Schedule

  Scenario: Student Check Available Schedule Mentors
    Given User click button login on home page
    When User input "bilal123@gmail.com" as email "1234567890" as password and "Student" as role
    And Click login button
    Then User already on home page again
    And Student click button Find Mentor
    Then Student choose mentors
    And Validate Mentor Profile page
    Then Student choose course
    And Validate Name Course page
    Then Click button beli kursus
    And Validate Total Biaya course
    Then Student set date course 20042025
    And Student set pilih hari "Wednesday"
    Then Student click button check available
    And Validate Pop-up message Schedule Mentor
    And Click Button Log Out