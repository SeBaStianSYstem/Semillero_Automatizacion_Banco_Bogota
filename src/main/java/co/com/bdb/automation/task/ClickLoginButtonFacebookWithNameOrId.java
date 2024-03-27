package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Button;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickLoginButtonFacebookWithNameOrId implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Button.withNameOrId("login"))
        );
    }
    public static ClickLoginButtonFacebookWithNameOrId clickLoginButtonFacebookWithNameOrId(){
        return instrumented(ClickLoginButtonFacebookWithNameOrId.class);
    }
}
