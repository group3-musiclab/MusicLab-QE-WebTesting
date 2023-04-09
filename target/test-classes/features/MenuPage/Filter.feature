@Capstone @Filter
  Feature: Filter dropdown

    Scenario Outline: Filter instrument
      Given User click button login on home page
      When User input "mafa.alfa75@gmail.com" as email "321" as password and "Student" as role
      And Click login button
      Then User already on home page again
      And Click find mentor
      Then Click "<ins>" as filter instrument
      Examples:
        | ins       |
        | Vocal     |
        | Piano     |
        | Guitar    |
        | Drum      |
        | Bass      |
        | Harmonika |
        | Trombon   |
        | Violin    |

    Scenario Outline: Filter Rating
      Given User click button login on home page
      When User input "mafa.alfa75@gmail.com" as email "321" as password and "Student" as role
      And Click login button
      Then User already on home page again
      And Click find mentor
      Then Click "<rating>" as filter rating
      Examples:
        | rating |
        | 1      |
        | 2      |
        | 3      |
        | 4      |
        | 5      |
