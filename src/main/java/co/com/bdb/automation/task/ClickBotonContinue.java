package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bdb.automation.ui.WebPage.botonContinue;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickBotonContinue implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(botonContinue)
        );

    }
    public static final ClickBotonContinue clickBotonContinue(){
        return instrumented(ClickBotonContinue.class);
    }
}
