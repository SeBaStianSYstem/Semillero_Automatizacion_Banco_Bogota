package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.RightClick;

import static co.com.bdb.automation.ui.WebPage.doubleclickButton;
import static co.com.bdb.automation.ui.WebPage.rightclickButton;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RightClickDemoqa implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                RightClick.on(rightclickButton)
        );
    }
    public static final RightClickDemoqa rightClickDemoqa(){
        return instrumented(RightClickDemoqa.class);
    }
}
