@Capstone @Event
  Feature: Create event on google calender
    This test case is everything about creating event on google calender

#  Scenario: Create valid event
#    Given User click button login on home page
#    And Click login google
#    When Click choose account
#    Then Process to login with google with "musiclabsejahtera@gmail.com" as email "@Qwerty1234" as password
#    And Click proceed to login button
#    Then User already on home page again
#    And Click profile button
#    And Mentor already on profile page and click jadwal saya button
#    Then Already on history mengajar page
#    And CLick create event button on create your event page
#    And Click see event
#    Then Mentor already success create event on google calender

  Scenario: Create invalid event
    Given User click button login on home page
    And Click login google
    When Click choose account
    Then Process to login with google with "musiclabsejahtera@gmail.com" as email "@Qwerty1234" as password
    And Click proceed to login button
    Then User already on home page again
    And Click profile button
    And Mentor already on profile page and click jadwal saya button
    Then Already on history mengajar page
    And See event button should disabled