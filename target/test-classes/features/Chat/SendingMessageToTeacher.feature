Feature: Sending Message to Teacher

#  1
  @Capstone @SendChatToTeacher @PositiveScenario @Chat @1
  Scenario Outline: User login with valid parameter
    Given User click button login on home page
    When User input "<email>" as email "<pass>" as password and "<role>" as role
    And Click login button
    Then User already on home page again
    And User click Find Mentor button
    And Student choose and click one of registered teacher
    And Student click LIHAT CHAT button
    And Student input text "qwerty"
    Then Student click Send button
    And Validate sent messages
    Examples:
      | email              | pass      | role    |
      | bauriski@gmail.com | project23 | Student |

#  2
  @Capstone @SendChatToTeacher @PositiveScenario @Chat @2
  Scenario Outline: students start sending messages to the teacher using number typing
    Given User click button login on home page
    When User input "<email>" as email "<pass>" as password and "<role>" as role
    And Click login button
    Then User already on home page again
    And User click Find Mentor button
    And Student choose and click one of registered teacher
    And Student click LIHAT CHAT button
    And Student input text "12345"
    Then Student click Send button
    And Validate sent messages
    Examples:
      | email              | pass      | role    |
      | bauriski@gmail.com | project23 | Student |

#   3
  @Capstone @SendChatToTeacher @PositiveScenario @Chat @3
  Scenario Outline: students start sending messages to the teacher using special character typing
    Given User click button login on home page
    When User input "<email>" as email "<pass>" as password and "<role>" as role
    And Click login button
    Then User already on home page again
    And User click Find Mentor button
    And Student choose and click one of registered teacher
    And Student click LIHAT CHAT button
    And Student input text "!@#$%"
    Then Student click Send button
    And Validate sent messages
    Examples:
      | email              | pass      | role    |
      | bauriski@gmail.com | project23 | Student |
#    4
  @Capstone @SendChatToTeacher @PositiveScenario @Chat @4
  Scenario Outline: Students start sending messages to the teacher using a combination of alphabets, numbers, and special characters
    Given User click button login on home page
    When User input "<email>" as email "<pass>" as password and "<role>" as role
    And Click login button
    Then User already on home page again
    And User click Find Mentor button
    And Student choose and click one of registered teacher
    And Student click LIHAT CHAT button
    And Student input text "qwerty 12345 !@#$%"
    Then Student click Send button
    And Validate sent messages
    Examples:
      | email              | pass      | role    |
      | bauriski@gmail.com | project23 | Student |

#    5
  @Capstone @SendChatToTeacher @PositiveScenario @Chat @5
  Scenario: Students start sending messages to the teacher using keyboard enter button
    Given User click button login on home page
    When User input "<email>" as email "<pass>" as password and "<role>" as role
    And Click login button
    Then User already on home page again
    And User click Find Mentor button
    And Student choose and click one of registered teacher
    And Student click LIHAT CHAT button
    And Student input text "adadfs23322"
    Then Student press Enter button on keyboard
    And Validate sent messages
    Examples:
      | email              | pass      | role    |
      | bauriski@gmail.com | project23 | Student |
#
##    6
#  @Capstone @SendChatToTeacher @NegativeScenario @Chat
#  Scenario: Students start sending messages to the teacher with blank or empty message (spaces only)
#    Given User already on landing page
#    When User input "rasyid@gmail.com" as email and ""123456"" as password
#    And User click login button
#    Then User already login
#    And User click "Find Mentor" button
#    And Student choose and click one of registered teacher
#    And Student click "LIHAT CHAT" button
#    And Student input text
#    Then Student click "Send" button
#    And Validate sent messages
#
##    7
#  @Capstone @SendChatToTeacher @NegativeScenario @Chat
#  Scenario: Students start sending messages to the teacher using keyboard enter button
#    Given User already on landing page
#    When User input "rasyid@gmail.com" as email and ""123456"" as password
#    And User click login button
#    Then User already login
#    And User click "Find Mentor" button
#    And Student choose and click one of registered teacher
#    And Student click "LIHAT CHAT" button
#    And Student input text
#    Then Student click "Send" button
#    And Validate sent messages