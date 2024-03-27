package co.com.bdb.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bdb.automation.ui.WebPage.linkForgotPasswordFacebook;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickLinkForgotPasswordFacebook implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(linkForgotPasswordFacebook)
        );
    }
    public static ClickLinkForgotPasswordFacebook clickLinkForgotPasswordFacebook(){
        return instrumented(ClickLinkForgotPasswordFacebook.class);
    }
}
