@google_search
Feature:ilk feature file
  Background: Google_sayfasina_git
    Given kullanıcı google'a gider

  @iphone
  Scenario:TC01_google_iphone_arama

  When kullanıcı iphone icin arama yapar
  Then sonuclarin "iphone" icerdigini dogrula
  And  close the application

  @tesla
  Scenario: TC02_google_tesla_arama
  When kullanıcı tesla için arama yapar
  Then sonuclarda tesla oldugunu dogrular
  Then close the application





  #  1. Her feature file, Feature: kelimesi ile başlamak zorundadır
  #  2. Her vir file da, yalnız bir Feature: kullanılabilir
  #  3. Senaryo(TEST CASE) oluşturmak için Scenerio: kelimesi kullanılır
  #  4. Birden fazla Scenerio: kullanılabilir
  #  5. Her bir adım Given, When, And, Then, But, * kelimelerinden biriyle başlamalıdır.
  #  6. Given -> Genelde ilk satırlarda, pre condition stepleri için kullanılır.
  #  7. Then -> Genelde son satırlarda, verification stepleri için kullanılır.
  #  8. And, When -> Genelde ara adımlarda bağlaç olarak kullanılır.
  #  NOTE: Teknik olarak istenilen kelime istenilen stepte kullanılabilir,
  #        ama anlam karmaşası olmaması için bu adımlar takip edilir.
  #  9. Belirli Scenerio ları çalıştırmak için cucumber tags ler kullanılır
  #  tag ler Feature, Scenario, Scerio Outline, Examples kelimeleri ile birlikte kullanilabilir
  #  10. Background: Her bir senaryo kelimesinden önce tek bir sefer çalışır
  #  11. dryRun=false -> dryRun yokmus gibi normal sekilde calisir. Yani tum adimlari tek tetk browserda acar.
  #      dryRun=true  -> Yeni bir STEP(adim) eklendiginde sadece tanimlanmamis step definitions lari olusturmak icin kullanilir
  #      kullanilma sebebi zamandan tasarrufdur.


 # #  1: jedes feature file, muss mit der "Feature" (Wort) anfangen
## 2: bei jedes einzelne fail kann nur ein Feature verwendet werden
## 3: um eine (Test Case) zu erstellen muss das Wort Scenario angewendet
## 4: kann mehr als eine Sceanario : verwendet werden
## 5: jeder einzelne schritt muss mit When,And, Then, But anfangen
## ---- When: wenn, Then: dann, And: und, But: Aber
## 6: Given wird meinstens bei erste absatz bei pre conditation stepts angewendet
## 7: Then wird meistens am ende der Satz,bei verification steps verwendet
## 8: and, whan wird meistens bei konbinierung der zwischen schritten verwendet
##  Note: theoretisch kann gewünschte begriff und
# gewünschte steps verwendet werden aber um Kopmlexe zu vermeiden sollte all nach schritten nachfolgen