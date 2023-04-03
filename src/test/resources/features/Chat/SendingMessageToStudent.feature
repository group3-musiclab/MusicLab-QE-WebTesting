Feature: Sending Message to Teacher

  Scenario: Students start sending messages to the teacher using alphabet typing
    Given User already on landing page
    When User input "rasyidmentor@gmail.com" as email and ""123457"" as password
    And User click login button
    Then User already login
    And User click "Find Mentor" button
    And Student choose and click one of registered teacher
    And Student click "LIHAT CHAT" button
    And Student click chat field
    And Student input random alphabet text
    Then Student click "Send" button
    And Validate sent messages




