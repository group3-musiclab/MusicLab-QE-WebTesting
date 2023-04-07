@Capstone @EditProfileStudent
  Feature: Edit Profile Mentor

  Scenario Outline: Mentor Edit Profile with all valid parameter
    Given User click button login on home page
    When User input "icadr@gmail.com" as email "123" as password and "Mentor" as role
    And Click login button
    Then User already on home page again
    And Click mentor profile button
    And Click edit mentor profile
    When Mentor input nama lengkap "<nama lengkap>" deskripsi "<deskripsi>" jenis kelamin "<jenis kelamin>" no. HP "<no.HP>" email "<email>" instagram account link "<instagram>"and alamat "<alamat>"
    And Mentor input image profile mentor
    Then click Update Mentor button
    And validate Pop Up notification text "success update mentor profile"
    Examples:
      | nama lengkap  | deskripsi                         | jenis kelamin | no.HP       | email           | instagram | alamat |
      | Aisyah Dewi r | specialized in any kind of Guitar | Female        | 08190828103 | icadr@gmail.com | @icaadr   | komp. BPPT |


    Scenario Outline: Mentor Edit Profile with invalid parameter
      Given User click button login on home page
      When User input "icadr@gmail.com" as email "123" as password and "Mentor" as role
      And Click login button
      Then User already on home page again
      And Click mentor profile button
      And Click edit mentor profile
      When Mentor input nama lengkap "<nama lengkap>" deskripsi "<deskripsi>" jenis kelamin "<jenis kelamin>" no. HP "<no.HP>" email "<email>" instagram account link "<instagram>"and alamat "<alamat>"
      And Mentor input image profile mentor
      Then click Update Mentor button
      And validate Pop Up notification
      Examples:
        | nama lengkap | deskripsi | jenis kelamin | no.HP | email           | instagram | alamat |
        |              |           | Femmal        |       | icadr@gmail.com |           |        |
        |              |           |               | abc   | icadr@gmail.com |           |        |

    Scenario Outline: Mentor Edit Password with valid parameter
      Given User click button login on home page
      When User input "<email>" as email "<password>" as password and "<role>" as role
      And Click login button
      Then User already on home page again
      And Click mentor profile button
      And Click edit mentor profile
      When Mentor input old password "<old password>" new password "<new password>" and confirmation password "<confirmation password>"
      Then click Update Password mentor button
      And validate Pop Up notification text "success update mentor password"
      Examples:
        | email           | password | role   | old password | new password | confirmation password |
        | icadr@gmail.com | 123      | Mentor | 123          | 321          | 321                   |
        | icadr@gmail.com | 321      | Mentor | 321          | 123          | 123                   |


    Scenario Outline: Mentor Edit Password with invalid parameter
      Given User click button login on home page
      When User input "<email>" as email "<password>" as password and "<role>" as role
      And Click login button
      Then User already on home page again
      And Click mentor profile button
      And Click edit mentor profile
      When Mentor input old password "<old password>" new password "<new password>" and confirmation password "<confirmation password>"
      Then click Update Password mentor button
      And validate Pop Up notification text "<errorMessage>"
      Examples:
        | email           | password | role   | old password | new password | confirmation password | errorMessage                                        |
        | icadr@gmail.com | 123      | Mentor | 123          | 321          | 322                   | new password and confirmation password is not equal |
        | icadr@gmail.com | 123      | Mentor | 321          | 123          | 321                   | new password and confirmation password is not equal |
        | icadr@gmail.com | 123      | Mentor |              |              | 321                   | old password, new password and confirmation password field cannot be empty  |


    Scenario: Mentor Edit Certificate with valid parameter
      Given User click button login on home page
      When User input "icadr@gmail.com" as email "123" as password and "Mentor" as role
      And Click login button
      Then User already on home page again
      And Click mentor profile button
      And Click edit mentor profile
      When Mentor input type certificate "Nasional" and certificate name "Pianist Academy Awards"
      And Mentor input photo in certificate photo
      Then Click Update Certificate Mentor button
      And validate Pop Up notification text "success add mentor credential"

    Scenario Outline: Mentor Edit Certificate with invalid parameter
      Given User click button login on home page
      When User input "icadr@gmail.com" as email "123" as password and "Mentor" as role
      And Click login button
      Then User already on home page again
      And Click mentor profile button
      And Click edit mentor profile
      And Click mentor profile button
      And Click edit mentor profile
      When Mentor input type certificate "<tipe sertifikat>" and certificate name "<nama sertifikat>"
      And Mentor input photo in certificate photo
      Then Click Update Certificate Mentor button
      Examples:
        | tipe sertifikat | nama sertifikat |
        | internasional   |                 |
        | Nasional        | 123             |

    Scenario: Mentor Edit Instrument with valid parameter
      Given User click button login on home page
      When User input "icadr@gmail.com" as email "123" as password and "Mentor" as role
      And Click login button
      Then User already on home page again
      And Click mentor profile button
      And Click edit mentor profile
      When Mentor input instrument they want to teach "Guitar"
      Then Click Update Instrument Mentor button
      And validate Pop Up notification text "success add mentor instrument"

    Scenario: Mentor Edit Genre with valid parameter
      Given User click button login on home page
      When User input "icadr@gmail.com" as email "123" as password and "Mentor" as role
      And Click login button
      Then User already on home page again
      And Click mentor profile button
      And Click edit mentor profile
      When Mentor input genre "Jazz"
      Then Click Update Genre Mentor button
      And validate Pop Up notification text "success add mentor genre"

    Scenario: Delete Mentor Profile
      Given User click button login on home page
      When User input "ariq@gmail.com" as email "12345678" as password and "Mentor" as role
      And Click login button
      Then User already on home page again
      And Click mentor profile button
      And Click delete mentor profile
      And validate Pop Up notification