Feature: Login app elempleo
  
  as a user of the eleempleo app 
  I want to login in the app
  to be access my profile

  Scenario: Login app elempleo
    Given that  I select the country colombia
    When put my login data
      | correoUsuario         | contrasena     |
      | camiloducon@gmail.com | Andresducon745 |
    Then I can enter my profile
