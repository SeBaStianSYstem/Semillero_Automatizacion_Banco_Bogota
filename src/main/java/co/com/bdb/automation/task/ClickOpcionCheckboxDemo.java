package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Checkbox;
import org.openqa.selenium.By;

import static co.com.bdb.automation.ui.WebPage.opcionCheckBox;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOpcionCheckboxDemo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(opcionCheckBox),
                Click.on(Checkbox.located(By.className("rct-checkbox")))
        );
    }
    public static ClickOpcionCheckboxDemo clickOpcionCheckboxDemo(){
        return instrumented(ClickOpcionCheckboxDemo.class);
    }
}
