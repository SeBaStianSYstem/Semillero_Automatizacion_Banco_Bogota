package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bdb.automation.ui.WebPage.botonCrearCuentaFacebook;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickBotonCrearCuentaFacebook implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(botonCrearCuentaFacebook)
        );
    }
    public static ClickBotonCrearCuentaFacebook clickBotonCrearCuentaFacebook(){
        return instrumented(ClickBotonCrearCuentaFacebook.class);
    }
}
