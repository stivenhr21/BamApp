package co.com.accenture.bamapp.userinterface.iniciosesion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesionUserinterface {

    public static final Target CERRAR_ONBOARDING = Target.the("Boton para cerrar el onboarding").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
    public static final Target INPUT_USUARIO = Target.the("Input para el ingreso del usuario").located(By.xpath("//*[@class = 'android.widget.EditText' and contains(@text, 'Ingresa el usuario')]"));
    //public static final Target INPUT_USUARIO = Target.the("Input para el ingreso del usuario").locatedBy("//*[@text='Ingresa el usuario']");
    public static final Target INPUT_CLAVE = Target.the("Input para el ingreso de la clave").located(By.xpath("//*[@text='Contraseña']"));
    public static final Target BUTTON_CONTINUAR = Target.the("Boton para continuar a ingresar la clave").located(By.xpath("//*[@content-desc='CONTINUAR']"));
    public static final Target BUTTON_INGRESAR = Target.the("Boton para ingresar").located(By.xpath("//*[@content-desc='INGRESAR']"));

}
