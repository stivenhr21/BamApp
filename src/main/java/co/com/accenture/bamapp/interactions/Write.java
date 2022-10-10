package co.com.accenture.bamapp.interactions;

import co.com.accenture.bamapp.models.Keyboard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Write implements Interaction {


    private static String text;
    private static Target target;

    {
    }

    @SuppressWarnings("static-access")
    public Write(String text, Target target) {
        this.text = text;
        this.target = target;
    }

    public static Write theText(String text) {
        return Tasks.instrumented(Write.class, text, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        char letter;

        actor.attemptsTo(Click.on(target),
                Click.on(Keyboard.SHIFT_KEY.getLetter()));

        for (int i = 0; i < text.length(); i++) {

            letter = text.charAt(i);

            actor.attemptsTo(Click.on(Target.the("letter or number").locatedBy(letter(letter))));
        }
    }

    @SuppressWarnings("static-access")
    public Write in(Target target) {
        this.target = target;
        return this;
    }

    private String letter(char a) {

        String letter = "LETTER_";

        if (a == ' ') {
            letter += "SPACE";
        } else {
            letter += String.valueOf(a).toUpperCase();
        }


        return "//*[@contentDescription='" + Keyboard.valueOf(letter).getLetter() + "']";
    }
}
