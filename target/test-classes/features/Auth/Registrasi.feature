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
#      | name            | role    | email                       | pass     |
#      | Alexander Paijo | Mentor  | alexpaijo300@gmail.com      | 12345678 |
#      | Emilia Lisander | Student | lisanderemilia100@gmail.com | 87654321 |
#
#  Scenario Outline: Registration with existing parameter
#    Given User click button login on home page
#    And Click register on login page
#    When User input "<name>" as nama lengkap "<role>" as role "<email>" as email and "<pass>" as password
#    And Click register button
#    Then Pop up about error message registration should show up
#    Examples:
#      | name            | role    | email                      | pass     |
#      | Alexander Paijo | Mentor  | alexpaijo99@gmail.com      | 12345678 |
#      | Emilia Lisander | Student | lisanderemilia22@gmail.com | 87654321 |

  Scenario Outline: Registration with blank data parameter
    Given User click button login on home page
    And Click register on login page
    When User input "<name>" as nama lengkap "<role>" as role "<email>" as email and "<pass>" as password
    And Click register button
    Then Button registration should disabled
    Examples:
      | name         | role    | email                   | pass     |
      |              | Mentor  | paijosynder99@gmail.com | 12345678 |
      | Emilia Clark | Student |                         | 87654321 |