@Capstone @CheckAvailMentorNegativeCase
Feature: [Negative Case] Check Schedule Mentors
  This test case is everything about Negative Case Check Mentors Schedule

  Scenario: Student Check Available Schedule Mentors with invalid date
    Given User click button login on home page
    When User input "mafa.alfa75@gmail.com" as email "321" as password and "Student" as role
    And Click login button
    Then User already on home page again
    And Student click button Find Mentor
    Then Student choose mentors
    And Validate Mentor Profile page
    Then Student choose course
    And Validate Name Course page
    Then Click button beli kursus
    And Validate Total Biaya course
    Then Student set date course 20042022
    And Student set pilih hari "Friday"
    Then Student click button check available
    And Validate Pop-up message Schedule Mentor

  Scenario: Student Check Available Schedule Mentors without input date
    Given User click button login on home page
    When User input "mafa.alfa75@gmail.com" as email "321" as password and "Student" as role
    And Click login button
    Then User already on home page again
    And Student click button Find Mentor
    Then Student choose mentors
    And Validate Mentor Profile page
    Then Student choose course
    And Validate Name Course page
    Then Click button beli kursus
    And Validate Total Biaya course
    And Student set pilih hari "Friday"
    Then Student click button check available
    And Validate Pop-up message Schedule Mentor

  Scenario: Student Check Available Schedule Mentors without input hari
    Given User click button login on home page
    When User input "mafa.alfa75@gmail.com" as email "321" as password and "Student" as role
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

  Scenario: Student Check Available Schedule Mentors without input date and pilih hari
    Given User click button login on home page
    When User input "mafa.alfa75@gmail.com" as email "321" as password and "Student" as role
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

  Scenario: Student Check Available Schedule Mentors with exiting Schedule
    Given User click button login on home page
    When User input "mafa.alfa75@gmail.com" as email "321" as password and "Student" as role
    And Click login button
    Then User already on home page again
    And Student click button Find Mentor
    Then Student choose mentors
    And Validate Mentor Profile page
    Then Student choose course
    And Validate Name Course page
    Then Click button beli kursus
    And Validate Total Biaya course
    Then Student set date course 02062023
    And Student set pilih hari "Friday"
    Then Student click button check available
    And Validate Pop-up message Schedule Mentor