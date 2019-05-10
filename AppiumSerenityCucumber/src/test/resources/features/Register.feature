Feature: Register app elempleo
  
  as a user of the elempleo app 
  I want to register in the app
  to be create my profile

  Scenario: register app elempleo
    Given I want to register in elempleo
    When put my registration data
      | pestana    | correoElectronico      | tipoDocumento | numeroDocumento | contrasena    | confirmarContrasena | nombres     | primerApellido | segundoApellido | telefono | fechaNacimiento |
      | REGÍSTRATE | qvision@qvision.com.co | Pasaporte     |      7824411032 | 1*Elempleo666 | 1*Elempleo666       | juan carlos | vega           | vela            | 67028999 |            2017 |
    Then I can create my profile
