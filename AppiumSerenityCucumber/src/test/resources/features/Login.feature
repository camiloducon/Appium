Feature: Login app elempleo
  
  as a user of the eleempleo app 
  I want to login in the app
  to be access my profile

  Scenario Outline: Login app elempleo
    Given that  I select the country colombia <row>
      | PathExcel                               | Sheet |
      | src/test/resources/data/DatosEEapp.xlsx | Login |
    When put my login data
    Then I can enter my profile

    Examples: 
      | row |
      |   1 |
