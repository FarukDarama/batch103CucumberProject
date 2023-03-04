@regression
Feature: arama_feature_2
  Background: googlea_git
    Given kullanici google gider

    Scenario Outline: arama_test
      When kullanici "<product>" için arama yapar
      Then sonuclarin "<product>" icerdigini dogrula
      Then close the application

      Examples: data
        | product |  |
        | iphone  |  |
        | tesla   |  |
        | tv      |  |
        | flower  |  |
        | dog     |  |

