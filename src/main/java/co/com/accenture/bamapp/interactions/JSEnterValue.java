package co.com.accenture.bamapp.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class JSEnterValue implements Interaction {

    private final Target target;
    private final String name;

    public JSEnterValue(Target target, String name) {
        this.target = target;
        this.name = name;
    }

    public static Interaction into(Target target, String name) {
        return instrumented(JSEnterValue.class, target, name);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElement element = target.resolveFor(actor);
        BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].value = '';", element);

        as(actor).sendKeys(element, name).perform();

    }

    private Actions as(Actor actor) {
        return new Actions(BrowseTheWeb.as(actor).getDriver());
    }
}

