@Capstone @Search
  Feature: Search Feature

    Scenario Outline: Search
      Given User click button login on home page
      When User input "mafa.alfa75@gmail.com" as email "321" as password and "Student" as role
      And Click login button
      Then User already on home page again
      And Click find mentor
      Then Input mentor name in search field "<name>"
      Examples:
        | name        |
        | fikri       |
        | Aisyah Dewi |
        | ariq        |
        | Michael Abb |