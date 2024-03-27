package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ui.Dropdown;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarFlightDetails implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("Sydney").from("(//select[@name='fromPort'])[1]"),
                SelectFromOptions.byVisibleText("June").from("(//select[@name='fromMonth'])[1]")
        );
    }
    public static final SeleccionarFlightDetails seleccionarFlightDetails(){
        return instrumented(SeleccionarFlightDetails.class);
    }
}
