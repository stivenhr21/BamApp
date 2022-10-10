package co.com.accenture.bamapp.stepdefinitions.iniciosesion;

import co.com.accenture.bamapp.tasks.comunes.CerrarOnboarding;
import co.com.accenture.bamapp.tasks.iniciosesion.InicioSesion;
import co.com.accenture.bamapp.utils.transversal.CargarDatos;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioSesionStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario se encuentra en pantalla de inicio de sesion$")
    public void queElUsuarioSeEncuentraEnPantallaDeInicioDeSesion() {
        OnStage.theActorCalled("El actor").wasAbleTo(
                CerrarOnboarding.cerrar()
        );
    }

    @Cuando("^el usuario inicia sesion con sus datos$")
    public void elUsuarioIniciaSesionConSusDatos(List<Map<String, Object>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                CargarDatos.conLaSiguiente(informacion),
                InicioSesion.usuario()
        );
    }

    @Entonces("^el usuario visualizara la pagina de inicio$")
    public void elUsuarioVisualizaraLaPaginaDeInicio() {
    }
}
