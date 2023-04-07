@Capstone @EditProfileStudent
  Feature: Edit Profile Student

  Scenario: Student Edit Profile valid parameters
    Given User click button login on home page
    When User input "icaaisyahdewi@gmail.com" as email "123" as password and "Student" as role
    And Click login button
    Then User already on home page again
    And Click student profile button
    And Click edit student profile
    When Student input nama lengkap "Aisyah Dewi" jenis kelamin "Female" no. HP "081908281037" email "icaaisyahdewi@gmail.com" and alamat "komp. bppt i9 b23"
    And Student input photo in profile photo
    Then click Update Student button
    And validate Pop Up notification text "success update student profile"


  Scenario Outline: Student Edit Profile with one or more parameter
    Given User click button login on home page
    When User input "icaaisyahdewi@gmail.com" as email "123" as password and "Student" as role
    And Click login button
    Then User already on home page again
    And Click student profile button
    And Click edit student profile
    When Student input nama lengkap "<nama>" jenis kelamin "<gender>" no. HP "<nohp>" email "<emails>" and alamat "<alamat>"
    Then click Update Student button
    And validate Pop Up notification text "success update student profile"
    Examples:
      | nama        | gender | nohp         | emails                  | alamat |
      | ica         | Female |              | icaaisyahdewi@gmail.com | bppt   |
      |             |        | 081908281036 | icaaisyahdewi@gmail.com |        |
      | Aisyah Dewi |        |              | icaaisyahdewi@gmail.com |        |


    Scenario Outline: Student Edit Profile with invalid parameter
    Given User click button login on home page
    When User input "icaaisyahdewi@gmail.com" as email "123" as password and "Student" as role
    And Click login button
    Then User already on home page again
    And Click student profile button
    And Click edit student profile
    When Student input nama lengkap "<nama>" jenis kelamin "<gender>" no. HP "<nohp>" email "<emails>" and alamat "<alamat>"
    Then click Update Student button
    And validate Pop Up notification
    Examples:
      | nama            | gender | nohp | emails                  | alamat |
      | icaaaaaaaaaaaaa |        |      | icaaisyahdewi@gmail.com |        |
      |                 | fml    |      | icaaisyahdewi@gmail.com |        |
      |                 |        | abc  | icaaisyahdewi@gmail.com |        |
      |                 |        |      |                         |        |
#
    Scenario Outline: Student Edit Password with valid parameter
      Given User click button login on home page
      When User input "<email>" as email "<password>" as password and "<role>" as role
      And Click login button
      Then User already on home page again
      And Click student profile button
      And Click edit student profile
      When Student input old password "<old password>" new password "<new password>" and confirmation password "<confirmation password>"
      Then click Update Password student button
      And validate Pop Up notification text "success update student password"
      Examples:
        | email                   | password | role    | old password | new password | confirmation password |
        | icaaisyahdewi@gmail.com | 123      | Student | 123          | 321          | 321                   |
        | icaaisyahdewi@gmail.com | 321      | Student | 321          | 123          | 123                   |


    Scenario Outline: Student Edit Password with invalid parameter
      Given User click button login on home page
      When User input "<email>" as email "<password>" as password and "<role>" as role
      And Click login button
      Then User already on home page again
      And Click student profile button
      And Click edit student profile
      When Student input old password "<old password>" new password "<new password>" and confirmation password "<confirmation password>"
      Then click Update Password student button
      And validate Pop Up notification
      Examples:
        | email                   | password | role    | old password | new password | confirmation password |
        | icaaisyahdewi@gmail.com | 123      | Student | 123          | 321          | 123                   |
        | icaaisyahdewi@gmail.com | 123      | Student | 321          | 123          | 123                   |
        | icaaisyahdewi@gmail.com | 123      | Student |              | 123          | 123                   |
        | icaaisyahdewi@gmail.com | 123      | Student | 321          | 123          |                       |
        | icaaisyahdewi@gmail.com | 123      | Student |              |              |                       |
        | icaaisyahdewi@gmail.com | 123      | Student |              | 123          | 123                   |

    Scenario: Student Delete Profile Student
      Given User click button login on home page
      When User input "ariqn@gmail.com" as email "12345678" as password and "Student" as role
      And Click login button
      Then User already on home page again
      And Click student profile button
      And Click delete student profile
      And validate Pop Up notification
