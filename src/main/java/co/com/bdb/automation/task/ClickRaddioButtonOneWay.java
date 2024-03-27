package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.RadioButton;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRaddioButtonOneWay implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                    Click.on(RadioButton.locatedBy("(//input[@value='oneway'])[1]"))
        );

    }
    public static final ClickRaddioButtonOneWay clickRaddioButtonOneWay(){
        return instrumented(ClickRaddioButtonOneWay.class);
    }
}
