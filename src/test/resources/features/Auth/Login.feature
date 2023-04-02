@Capstone @Login
  Feature: Login
    This test case is everything about login mentor and student

  Scenario Outline: User login with valid parameter
    Given User click button login on home page
    When User input "<email>" as email "<pass>" as password and "<role>" as role
    And Click login button
    Then User already on home page again
    Examples:
      | email                 | pass | role    |
      | mafa.alfa1@gmail.com  | 321  | Mentor  |
      | mafa.alfa75@gmail.com | 321  | Student |

    Scenario Outline: User login with invalid parameter
    Given User click button login on home page
    When User input "<email>" as email "<pass>" as password and "<role>" as role
    And Click login button
    Then Pop up about error message login should show up
    Examples:
      | email                         | pass  | role    |
      | alifmuhamadhafidz23@gmail.com | 23124 | Mentor  |
      | dfvwefqwffw123@gmail.com      | 321   | Student |

  Scenario Outline: User login with blank parameter
    Given User click button login on home page
    When User input "<email>" as email "<pass>" as password and "<role>" as role
    And Click login button
    Then Button login should disabled
    Examples:
      | email                    | pass  | role    |
      |                          | 23124 | Mentor  |
      | dfvwefqwffw123@gmail.com |       | Student |