@Capstone @NextPrev
  Feature: Button next previous

    Scenario: Button next
      Given User click button login on home page
      When User input "mafa.alfa75@gmail.com" as email "321" as password and "Student" as role
      And Click login button
      Then User already on home page again
      And Click find mentor
      Then Click button next
      And Click button prev