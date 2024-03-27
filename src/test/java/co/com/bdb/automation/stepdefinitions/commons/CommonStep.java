package co.com.bdb.automation.stepdefinitions.commons;

import co.com.bdb.automation.questions.CommonQuestions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SetCheckbox;

import java.util.Objects;

import static co.com.bdb.automation.stepdefinitions.commons.Actors.COMMON_ACTOR;
import static co.com.bdb.automation.task.ClickBotonContinue.clickBotonContinue;
import static co.com.bdb.automation.task.ClickBotonCrearCuentaFacebook.clickBotonCrearCuentaFacebook;
import static co.com.bdb.automation.task.ClickCheckboxHomeDemoqa.clickCheckboxHomeDemoqa;
import static co.com.bdb.automation.task.ClickLinkForgotPasswordFacebook.clickLinkForgotPasswordFacebook;
import static co.com.bdb.automation.task.ClickLoginButtonFacebookContainingText.clickLoginButtonFacebookContainingText;
import static co.com.bdb.automation.task.ClickLoginButtonFacebookWithNameOrId.clickLoginButtonFacebookWithNameOrId;
import static co.com.bdb.automation.task.ClickRaddioButtonOneWay.clickRaddioButtonOneWay;
import static co.com.bdb.automation.task.DoubleClickDemoqa.doubleClickDemoqa;
import static co.com.bdb.automation.task.RightClickDemoqa.rightClickDemoqa;
import static co.com.bdb.automation.task.SeleccionarFlightDetails.seleccionarFlightDetails;
import static co.com.bdb.automation.task.RellenarTextbox.rellenarTextbox;
import static co.com.bdb.automation.task.BorrarTextboxAddress.borrarTextboxAddress;
import static co.com.bdb.automation.ui.WebPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class CommonStep {
    private static final String paginaFacebook = "pages.facebook";
    private static final String paginaDemoqa = "pages.demoqa";
    private static final String paginaMercuryTours = "pages.mercuryTours";
    private static final String paginaDemoqaButtons = "pages.paginaDemoqaButtons";

    @Given("que el usuario se encuentre en la pagina inicial de facebook")
    public void queElUsuarioIngreseALaPaginaWeb() {
        COMMON_ACTOR.attemptsTo(
                Open.browserOn().thePageNamed(paginaFacebook)
        );
    }
    /* Scenario Outline: quiero interactuar con el boton Log in utilizando distintos metodos */
    @When("da click en el boton log in utilizando el metodo {string}")
    public void clickBotonLogin(String metodo){
        if(Objects.equals(metodo, "ContainingText")){
            COMMON_ACTOR.attemptsTo(clickLoginButtonFacebookContainingText());
        }
        else if (Objects.equals(metodo,"WithNameOrId")) {
            COMMON_ACTOR.attemptsTo(clickLoginButtonFacebookWithNameOrId());
        }else {
            System.out.println("Metodo no disponible");
        }
    }
    @Then("visualizara la pagina de facebook con el texto {string}")
    public void assertionClickBotonLoginFacebook(String text){
        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals(text, textoEsperadoFacebookLogin)));
    }
    /* Scenario: quiero interactuar con el boton de crear cuenta en Facebook */
    @When("da click en el boton Create new account")
    public void clickBotonCrearCuenta(){
        COMMON_ACTOR.attemptsTo(clickBotonCrearCuentaFacebook());
    }
    @Then("Visualizara una ventana que tiene de titulo {string}")
    public void assertionClickBotonCrearCuentaFacebook(String titulo){
        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals(titulo,textoEsperadoFacebookCrearCuenta)));
    }

    /* Scenario: quiero interactuar con el link de has olvidado tu constraseña en Facebook */
    @When("da click en el link Forgot password?")
    public void daClickEnElLinkForgotPassword() {
        COMMON_ACTOR.attemptsTo(clickLinkForgotPasswordFacebook());
    }
    @Then("visualizara en pantalla el texto {string}")
    public void visualizaraEnPantallaElTexto(String titulo) {
        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals(titulo,textoEsperadoForgotPassword)));
    }

    /* Scenario: quiero interactuar con el checkbox de la pagina Tools QA
      para visualizar un texto en pantalla */
    @Given("que el usuario esta en la pagina de inicio de la pagina demoqa")
    public void queEstoyEnLaPaginaDeInicioDeLaPaginaDemoqa() {
        COMMON_ACTOR.attemptsTo(
                Open.browserOn().thePageNamed(paginaDemoqa)
        );
    }

    @When("da click en la opcion de Checkbox, chequeamos el checkbox home")
    public void doyClickEnElCheckboxHome() {
        COMMON_ACTOR.attemptsTo(clickCheckboxHomeDemoqa());
    }

    @Then("visualizara la pagina demoqa con el texto {string}")
    public void assertCheckbox(String texto){
        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals(texto,textoEsperadoCheckBoxHome)));
        COMMON_ACTOR.attemptsTo(
                SetCheckbox.of("(//*[name()='svg'][@class='rct-icon rct-icon-check'])[1]").toTrue()
        );

    }

    /* Scenario: interactuar con raddioButton, dropDown de la pagina */
    @Given("que el usuario esta en la pagina Mercury Tours")
    public void queElUsuarioEstaEnLaPaginaMercuryTours() {
        COMMON_ACTOR.attemptsTo(Open.browserOn().thePageNamed(paginaMercuryTours));
    }

    @When("seleccione la opcion OneWay")
    public void seleccioneLaOpcionOneWay() {
        COMMON_ACTOR.attemptsTo(
                clickRaddioButtonOneWay()
        );

    }

    @When("seleccione Departing from Sydney On June")
    public void seleccioneDepartingFromOn() {
        COMMON_ACTOR.attemptsTo(
                seleccionarFlightDetails()
        );
    }

    @And("da click en el boton Continue")
    public void daClickEnElBotonContinue() {
        COMMON_ACTOR.attemptsTo(
                clickBotonContinue()
        );
    }
    @Then("visualizara en la pagina Mercury Tours el texto {string}")
    public void visualizaraEnLaPaginaMercuryToursElTexto(String texto) {
        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals(texto,textoEsperadoMercuryTours)));
    }
    /*  Scenario: interactuar con text box para escribir y borrar texto */
    @When("ingresa texto en todos los text box")
    public void ingresaTextoEnTodosLosTextBox() {
        COMMON_ACTOR.attemptsTo(
                rellenarTextbox()
        );
    }

    @And("borra el texto en el texbox Permanent Addres y da click en el boton submit")
    public void borraElTextoEnElTexboxClickSubmit() {
        COMMON_ACTOR.attemptsTo(
                borrarTextboxAddress()
        );
    }

    @Then("visualizara en pantalla los datos que ingreso")
    public void visualizaraEnPantallaLosDatosQueIngreso() {
        String textoEsperado="Name:Sebastian Rodriguez";
        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals(textoEsperado,assertTextdemoqa)));
    }

    /* interactuar con click y doubleclick en la pagina demoqa */
    @Given("que el usuario se encuentra en la pagina demoqa en la seccion de button")
    public void queElUsuarioSeEncuentraEnLaPaginaDemoqaEnLaSeccionDeButton() {
        COMMON_ACTOR.attemptsTo(Open.browserOn().thePageNamed(paginaDemoqaButtons));
    }

    @When("da doble click en Double Click y click derecho en Click me")
    public void daDobleClickEnDoubleClickYClickDerechoEnClickMe() {
        COMMON_ACTOR.attemptsTo(
                doubleClickDemoqa(),
                rightClickDemoqa()
        );
    }

    @Then("visualizara en pantalla los textos {string} {string}")
    public void visualizaraEnPantallaLosTextos(String texto1, String texto2) {
        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals(texto1,assertDoubleClick)));
        COMMON_ACTOR.should(seeThat(CommonQuestions.textEquals(texto2,assertRightClick)));
    }
}