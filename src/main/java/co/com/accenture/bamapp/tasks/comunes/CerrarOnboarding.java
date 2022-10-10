package co.com.accenture.bamapp.tasks.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.accenture.bamapp.userinterface.iniciosesion.InicioSesionUserinterface.CERRAR_ONBOARDING;

public class CerrarOnboarding implements Task {

    public static CerrarOnboarding cerrar() {
        return Tasks.instrumented(CerrarOnboarding.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CERRAR_ONBOARDING, WebElementStateMatchers.isVisible()),
                Click.on(CERRAR_ONBOARDING)
        );
    }
}
