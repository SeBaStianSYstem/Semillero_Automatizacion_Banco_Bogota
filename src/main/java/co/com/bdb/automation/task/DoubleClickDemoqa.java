package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.DoubleClick;

import static co.com.bdb.automation.ui.WebPage.doubleclickButton;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoubleClickDemoqa implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                DoubleClick.on(doubleclickButton)
        );
    }
    public static final DoubleClickDemoqa doubleClickDemoqa(){
        return instrumented(DoubleClickDemoqa.class);
    }
}
