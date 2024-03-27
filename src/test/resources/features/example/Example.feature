#language:en

  Feature: Conocer, aprender, interactuar con diferentes elementos
    de paginas de prueba.
  @ClickBotonLoginFacebook @Facebook
  Scenario Outline: interactuar con el boton Log in utilizando distintos metodos
    Given que el usuario se encuentre en la pagina inicial de facebook
    When da click en el boton log in utilizando el metodo "<metodo>"
    Then visualizara la pagina de facebook con el texto "Find your account and log in."
    Examples:
      |     metodo     |
      |ContainingText|
      |WithNameOrId|

    @ClickBotonCrearCuentaFacebook @Facebook
    Scenario: interactuar con el boton de crear cuenta en Facebook
      Given que el usuario se encuentre en la pagina inicial de facebook
      When da click en el boton Create new account
      Then visualizara una ventana que tiene de titulo "Sign Up"

    @ClickLinkHasOlvidadoClaveFacebook @Facebook
    Scenario: quiero interactuar con el link de has olvidado tu constraseña en Facebook
      Given que el usuario se encuentre en la pagina inicial de facebook
      When  da click en el link Forgot password?
      Then visualizara en pantalla el texto "Find your account"

    @CheckBoxPaginaToolsQa
    Scenario: quiero interactuar con el checkbox de la pagina Tools QA
      para visualizar un texto en pantalla
      Given que el usuario esta en la pagina de inicio de la pagina demoqa
      When da click en la opcion de Checkbox, chequeamos el checkbox home
      Then visualizara la pagina demoqa con el texto "You have selected :"

    @TestCase3MercuryTours
    Scenario: interactuar con raddioButton, dropDown de la pagina
      Given que el usuario esta en la pagina Mercury Tours
      When seleccione la opcion OneWay
      When seleccione Departing from Sydney On June
      And da click en el boton Continue
      Then visualizara en la pagina Mercury Tours el texto "After flight finder - No Seats Avaialble  "

    @TestCaseSendKeys
    Scenario: interactuar con text box para escribir y borrar texto
      Given que el usuario esta en la pagina de inicio de la pagina demoqa
      When ingresa texto en todos los text box
      And borra el texto en el texbox Permanent Addres y da click en el boton submit
      Then visualizara en pantalla los datos que ingreso

    @TestCaseDoubleClick
    Scenario: interactuar con click y doubleclick en la pagina demoqa
      Given que el usuario se encuentra en la pagina demoqa en la seccion de button
      When da doble click en Double Click y click derecho en Click me
      Then visualizara en pantalla los textos "You have done a double click" "You have done a right click"