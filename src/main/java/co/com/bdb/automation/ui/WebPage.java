package co.com.bdb.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;
import org.apache.commons.compress.archivers.tar.TarFile;

public class WebPage {
    private WebPage(){}


    public static final Target opcionCheckBox=Target.the("Opcion de checkbox en la pagina demoqa")
            .located(By.id("item-1"));

    public static final Target textoEsperadoFacebookLogin =Target.the("Texto esperado de facebook")
            .located(By.cssSelector("a[href='https://facebook.com/login/identify/']"));
    public static final Target botonCrearCuentaFacebook=Target.the("Boton verde para crear cuenta en facebook")
            .located(By.partialLinkText("Create new account"));
    public static final Target textoEsperadoFacebookCrearCuenta=Target.the("Texto esperado de la venta Sign Up")
            .located(By.cssSelector(".mbs._52lq.fsl.fwb.fcb"));
    public static final Target linkForgotPasswordFacebook=Target.the("Link de olvido de contraseña facebook")
            .located(By.linkText("Forgot password?"));
    public static final Target textoEsperadoForgotPassword=Target.the("Texto esperado de la ventana olvido de contraseña")
            .located(By.xpath("//h2[@class='uiHeaderTitle']"));


    public static final Target checkboxHomeDemoqa=Target.the("Checkbox Home que aparece en la pagina demoqa")
            .located(By.xpath("//*[name()='svg'][@class='rct-icon rct-icon-uncheck'])[1]"));

    public static final Target checkboxHomeDemoqaMarcado=Target.the("checkbox marcado demoqa")
            .located(By.className("rct-icon.rc-check"));

    public static final Target textoEsperadoCheckBoxHome=Target.the("Texto despues de clickear el checkbox home")
            .locatedBy("//span[normalize-space()='You have selected :']");

    public static final Target botonContinue=Target.the("boton Continue Mercury Tours")
            .locatedBy("(//input[@name='findFlights'])[1]");
    public static final Target textoEsperadoMercuryTours=Target.the("Texto que aparece despues de click en Continue")
            .locatedBy("//tbody/tr[@valign='top']/td/p[@align='left']/font[@face='Arial, Helvetica, sans-serif']/b/font[1]");
    public static final Target textboxFullName= Target.the("Textbox full name demoqa")
            .locatedBy("#userName");
    public static final Target emailText= Target.the("Textbox email demoqa")
            .locatedBy("#userEmail");
    public static final Target currentAddressTextbox= Target.the("Textbox currentAddress demoqa")
            .locatedBy("#currentAddress");
    public static final Target permanentAddressTextbox= Target.the("Textbox permanentAddress demoqa")
            .locatedBy("#permanentAddress");
    public static final Target assertTextdemoqa= Target.the("Texto esperado despues de click submit")
            .locatedBy("#name");
    public static final Target doubleclickButton=Target.the("Boton para realizar doble click demoqa")
            .locatedBy("#doubleClickBtn");
    public static final Target rightclickButton=Target.the("Boton para realizar click derecho demoqa")
            .locatedBy("#rightClickBtn");
    public static final Target assertDoubleClick=Target.the("Texto que esperamos despues de dar doble click")
            .locatedBy("#doubleClickMessage");
    public static final Target assertRightClick=Target.the("Texto que esperamos despues de dar click derecho")
            .locatedBy("#rightClickMessage");
}
