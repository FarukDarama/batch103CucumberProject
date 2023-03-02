@data_tables
  Feature: data_tables
    Scenario: TC01_musteri_giris_testi
      Given kullanici "https://www.bluerentalcars.com/login" gider
      # | |--> datatable olusturmak icin kullanılır.Data tables scenario outline ile de kullanılabilir.
      When kullanici emaili ve sifresini girer
        | email                         | sifre     |
        | sam.walker@bluerentalcars.com | c!fas_art |