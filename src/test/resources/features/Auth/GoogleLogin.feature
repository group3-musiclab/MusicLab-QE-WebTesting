@Capstone @Google
  Feature: Login with google account
    This test case is everything about login with google

#  Scenario: Mentor login with google account
#    Given User click button login on home page
#    And Click login google
#    When Click choose account
#    Then Process to login with google with "musiclabsejahtera@gmail.com" as email "@Qwerty1234" as password
#    And Click proceed to login button
#    Then User already on home page again

  Scenario: Student login with google account
    Given User click button login on home page
    And Click login google
    When Click choose account
    Then Process to login with google with "studentmusiclab3@gmail.com" as email "@Qwerty1234" as password
    And Click proceed to login button
    Then User already on home page again

  Scenario: Login with google account who have not registered
    Given User click button login on home page
    And Click login google
    When Click choose account
    Then Process to login with google with "studentmusiclab2@gmail.com" as email "@Qwerty1234" as password
    And Click proceed to login button
    Then Pop up about error login should show up
