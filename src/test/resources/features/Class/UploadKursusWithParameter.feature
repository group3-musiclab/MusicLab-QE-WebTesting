@Capstone @class
Feature: class

  Scenario Outline : upload kursus with parameter
     Given click profile button
     And click kursus saya
     And click upload new course
     When user input "<judul kursus>" as judul kursus
     And click tingkatan kursus/ Level
     When user input "<deskripsi khusus>" as deskripsi "<Apa yang dipelajari>" as apa yang dipelajari "<prasyarat khusus>" as prasyarat khusus "<untuk siapa kursus ini>" as untuk siapa kursus ini "<harga kursus>" as harga khusus "<duration>" as duration
     And click upload kursus button
     Then success make a class
    Examples:
      | judul kursus | deskripsi khusus | Apa yang dipelajari | prasyarat khusus | Untuk siapa kursus ini | harga kursus | duration |
      | Drum         | drum             | basic drum          | tidak ada        | semua                  | 500000       | 70       |

  Scenario Outline : upload kursus with invalid parameter
    Given click profile button
    And click kursus saya
    And click upload new course
    When user input "<judul kursus>" as judul kursus
    When user input "<deskripsi khusus>" as deskripsi "<Apa yang dipelajari>" as apa yang dipelajari "<prasyarat khusus>" as prasyarat khusus "<untuk siapa kursus ini>" as untuk siapa kursus ini "<harga kursus>" as harga khusus "<duration>" as duration
    And click upload kursus button
    Then warning Failed Upload Course
    Examples:
      | judul kursus | deskripsi khusus | Apa yang dipelajari | prasyarat khusus | Untuk siapa kursus ini | harga kursus | duration |
      | Drum         | drum             | basic drum          | tidak ada        | semua                  | 500000       | 80       |
