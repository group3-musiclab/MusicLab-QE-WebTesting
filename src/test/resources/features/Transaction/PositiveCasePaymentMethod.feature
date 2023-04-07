@Capstone @PaymentMethodPositiveCase
Feature: [Positive Case] Payment Method
  This test case is everything about Positive Case Payment Method

  @ClickPaymentButton
  Scenario: Student will make payment transactions without Choose Method Payment
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
    Then Student set date course 20042030
    And Student set pilih hari "Tuesday"
    Then Student click button check available
    And Validate Pop-up message Schedule Mentor
    Then Student click button Continue Payment without select method
    And Validate history belajar page
    Then Click button next page
    And  Validate New Schedule Student

  @PaymentMethodBcaKlik
  Scenario: Student will make payment transactions with BCA Klik Method
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
    Then Student set date course 20042034
    And Student set pilih hari "Tuesday"
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
    And Validate history belajar page
    Then Click button next page
    And  Validate New Schedule Student

#  @PaymentMethodBankTransfer
#  Scenario: Student will make payment transactions with Bank Transfer Method
#    Given User click button login on home page
#    When User input "studentmusiclab@gmail.com" as email "@Qwerty1234" as password and "Student" as role
#    And Click login button
#    Then User already on home page again
#    And Student click button Find Mentor
#    Then Student choose mentors
#    And Validate Mentor Profile page
#    Then Student choose course
#    And Validate Name Course page
#    Then Click button beli kursus
#    And Validate Total Biaya course
#    Then Student set date course 20042125
#    And Student set pilih hari "Wednesday"
#    Then Student click button check available
#    And Validate Pop-up message Schedule Mentor
#    Then Student click button Continue Payment
#    And Validate Payment Page
#    Then Choose Bank Transfer Method
#    And Validate Rekening Number
#    Then Click Button Pay Now
#    And Validate Transaksi Sukses
#    And Validate history belajar page
#    Then Click button next page
#    And  Validate New Schedule Student

#  @PaymentMethodDebit/Credit
#  Scenario: Student will make payment transactions with Bank Transfer Method
#    Given User click button login on home page
#    When User input "studentmusiclab@gmail.com" as email "@Qwerty1234" as password and "Student" as role
#    And Click login button
#    Then User already on home page again
#    And Student click button Find Mentor
#    Then Student choose mentors
#    And Validate Mentor Profile page
#    Then Student choose course
#    And Validate Name Course page
#    Then Click button beli kursus
#    And Validate Total Biaya course
#    Then Student set date course 20042080
#    And Student set pilih hari "Wednesday"
#    Then Student click button check available
#    And Validate Pop-up message Schedule Mentor
#    Then Student click button Continue Payment
#    And Validate Payment Page
#    Then Choose Debit or Credit Card Method
#    And Validate Rekening Number
#    Then Click Button Pay Now
#    And Validate Transaksi Sukses
#    And Validate history belajar page
#    Then Click button next page
#    And  Validate New Schedule Student