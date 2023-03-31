@Capstone @Registration
  Feature: Registration
    This test case is everything about registration mentor and student

#  Scenario Outline: Registration with valid data
#    Given User click button login on home page
#    And Click register on login page
#    When User input "<name>" as nama lengkap "<role>" as role "<email>" as email and "<pass>" as password
#    And Click register button
#    Then User already on login page
#    Examples:
#      | name            | role    | email                      | pass |
#      | Alexander Paijo | Mentor  | alexpaijo92@gmail.com      | 123  |
#      | Emilia Lisander | Student | lisanderemilia28@gmail.com | 321  |
#
#    Scenario Outline: Registration with existing parameter
#    Given User click button login on home page
#    And Click register on login page
#    When User input "<name>" as nama lengkap "<role>" as role "<email>" as email and "<pass>" as password
#    And Click register button
#    Then Pop up about error message registration should show up
#    Examples:
#      | name            | role    | email                      | pass |
#      | Alexander Paijo | Mentor  | alexpaijo92@gmail.com      | 123  |
#      | Emilia Lisander | Student | lisanderemilia28@gmail.com | 321  |

    Scenario Outline: Registration with invalid data parameter
    Given User click button login on home page
    And Click register on login page
    When User input "<name>" as nama lengkap "<email>" as email and "<pass>" as password
    And Click register button
    Then Pop up about error message registration should show up
    Examples:
      | name    | email                 | pass |
      | bateman | nolanlexa88@gmail.com | 123  |

    Scenario Outline: Registration with blank data parameter
    Given User click button login on home page
    And Click register on login page
    When User input "<name>" as nama lengkap "<role>" as role "<email>" as email and "<pass>" as password
    And Click register button
    Then Button registration should disabled
    Examples:
      | name         | role    | email                   | pass |
      |              | Mentor  | paijosynder99@gmail.com | 123  |
      | Emilia Clark | Student |                         | 321  |