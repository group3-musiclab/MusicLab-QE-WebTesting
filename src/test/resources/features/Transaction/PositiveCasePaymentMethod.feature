@Capstone @PaymentMethodPositiveCase
Feature: [Positive Case] Payment Method
  This test case is everything about Positive Case Payment Method

  Scenario: Student will make payment transactions
    Given User click button login on home page
    When User input "studentmusiclab@gmail.com" as email "@Qwerty1234" as password and "Student" as role
    And Click login button
    Then User already on home page again
    And Student click button Find Mentor
    Then Student choose mentors
    And Validate Mentor Profile page
    Then Student choose course
    And Validate Name Course page
    Then Click button beli kursus
    And Validate Total Biaya course
    Then Student set date course 20042080
    And Student set pilih hari "Wednesday"
    Then Student click button check available
    And Validate Pop-up message Schedule Mentor
    Then Student click button Continue Payment
    And Validate Payment Page
    Then Choose BCA Klik Pay Method
    And Validate Order ID
    Then Click Button Pay Now
    And Validate Transaction Number
    Then Click button Bayar
    And Validate Transaksi Sukses