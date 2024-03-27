package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.bdb.automation.ui.WebPage.permanentAddressTextbox;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BorrarTextboxAddress implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(permanentAddressTextbox),
                Scroll.to("#submit"),
                Click.on("#submit")
        );
    }
    public static final BorrarTextboxAddress borrarTextboxAddress(){
        return instrumented(BorrarTextboxAddress.class);
    }
}
