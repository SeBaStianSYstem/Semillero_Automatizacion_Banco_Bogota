package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.bdb.automation.ui.WebPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RellenarTextbox implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("Sebastian Rodriguez").into(textboxFullName),
                SendKeys.of("Sebastian@hotmail.com").into(emailText),
                Enter.theValue("carrera 76 #56-89").into(currentAddressTextbox),
                Enter.theValue("Av 85 87-34").into(permanentAddressTextbox)

        );
    }
    public static final RellenarTextbox rellenarTextbox(){
        return instrumented(RellenarTextbox.class);
    }
}
