@Capstone @CheckAvailMentorNegativeCase
Feature: [Negative Case] Check Schedule Mentors
  This test case is everything about Negative Case Check Mentors Schedule

  Scenario: Student Check Available Schedule Mentors with invalid date (Before Current Date)
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
    Then Student set date course 20012023
    And Student set pilih hari "Monday"
    Then Student click button check available
    And Validate Pop-up message Schedule Mentor
    And Click Button Log Out

  Scenario: Student Check Available Schedule Mentors without input date
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
    And Student set pilih hari "Monday"
    Then Student click button check available
    And Validate Pop-up message Schedule Mentor
    And Click Button Log Out

  Scenario: Student Check Available Schedule Mentors without set pilih hari
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
    Then Student set date course 20042030
    Then Student click button check available
    And Validate Pop-up message Schedule Mentor
    And Click Button Log Out

  Scenario: Student Check Available Schedule Mentors without input date and pilih hari
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
    Then Student click button check available
    And Validate Pop-up message Schedule Mentor
    And Click Button Log Out

  Scenario: Student Check Available Schedule Mentors with exiting Schedule
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
    Then Student set date course 02022023
    And Student set pilih hari "Monday"
    Then Student click button check available
    And Validate Pop-up message Schedule Mentor
    And Click Button Log Out