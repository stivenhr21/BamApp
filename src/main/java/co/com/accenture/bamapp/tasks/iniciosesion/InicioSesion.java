package co.com.accenture.bamapp.tasks.iniciosesion;

import co.com.accenture.bamapp.interactions.Write;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.accenture.bamapp.userinterface.iniciosesion.InicioSesionUserinterface.INPUT_USUARIO;

public class InicioSesion implements Task {
    public static InicioSesion usuario() {
        return Tasks.instrumented(InicioSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                /*Click.on(INPUT_USUARIO)
                WaitUntil.the(INPUT_USUARIO, WebElementStateMatchers.isEnabled()),
                JSEnterValue.into(INPUT_USUARIO, obtener("usuario")),
                //Enter.keyValues(obtener("usuario")).into(INPUT_USUARIO),
                Click.on(BUTTON_CONTINUAR),
                Enter.theValue(obtener("clave")).into(INPUT_CLAVE),
                Click.on(BUTTON_INGRESAR)*/
        );

        actor.attemptsTo(
                //DoubleClick.on(INPUT_USUARIO),
                Click.on(INPUT_USUARIO),
                Write.theText("prueba").in(INPUT_USUARIO)
                //JSEnterValue.into(INPUT_USUARIO, "cliente_qa21")
                //Enter.keyValues("cliente_qa21").into(INPUT_USUARIO)
        );
    }
}
