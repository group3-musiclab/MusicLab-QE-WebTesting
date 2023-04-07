@Capstone @class
Feature: class

   Scenario: upload kursus with parameter
     Given click profile
     When click kursus saya
     And click upload new course
     And input "drum" as judul kursus
     And click tingkatan khusus
     And click basic
     And input "kursus drum" as deskripsi
     And input "basic drum" as apa yang dipelajari
     And input "tidak ada" as prasyarat khusus
     And input "semua" as untuk siapa kursus ini
     And input "500000" as harga kursus
     And input "60" as duration
     And click upload kursus button
     Then validate Success notification

     Scenario: upload kursus with invalid parameter
       Given click profile
       When click kursus saya
       And click upload new course
       And input "drum" as judul kursus
       And click tingkatan khusus
       And input "kursus drum" as deskripsi
       And input "basic drum" as apa yang dipelajari
       And input "tidak ada" as prasyarat khusus
       And input "semua" as untuk siapa kursus ini
       And input "500000" as harga kursus
       And input "60" as duration
       And click upload kursus button
       Then warning Failed Upload Course

