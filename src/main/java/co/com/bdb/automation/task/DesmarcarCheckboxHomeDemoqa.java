package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SetCheckbox;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DesmarcarCheckboxHomeDemoqa implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(SetCheckbox.of(checkboxHomeDemoqaMarcado).toFalse());

    }
    public static DesmarcarCheckboxHomeDemoqa desmarcarCheckboxHomeDemoqa(){
        return instrumented(DesmarcarCheckboxHomeDemoqa.class);
    }
}
