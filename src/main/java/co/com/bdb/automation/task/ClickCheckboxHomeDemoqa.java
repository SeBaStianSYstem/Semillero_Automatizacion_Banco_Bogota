package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SetCheckbox;
import net.serenitybdd.screenplay.ui.Checkbox;

import static co.com.bdb.automation.ui.WebPage.checkboxHomeDemoqa;
import static co.com.bdb.automation.ui.WebPage.opcionCheckBox;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickCheckboxHomeDemoqa implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(opcionCheckBox),
                Click.on(checkboxHomeDemoqa)
        );
    }
    public static ClickCheckboxHomeDemoqa clickCheckboxHomeDemoqa(){
        return instrumented(ClickCheckboxHomeDemoqa.class);
    }
}
