package co.com.accenture.bamapp.models;

public enum Keyboard {

    //numbers
    NUMBER_0("0"),
    NUMBER_1("1"),
    NUMBER_2("2"),
    NUMBER_3("3"),
    NUMBER_4("4"),
    NUMBER_5("5"),
    NUMBER_6("6"),
    NUMBER_7("7"),
    NUMBER_8("8"),
    NUMBER_9("9"),

    //letters
    LETTER_Q("q"),
    LETTER_W("w"),
    LETTER_E("e"),
    LETTER_R("r"),
    LETTER_T("t"),
    LETTER_Y("y"),
    LETTER_U("u"),
    LETTER_I("i"),
    LETTER_O("o"),
    LETTER_P("p"),
    LETTER_A("a"),
    LETTER_S("s"),
    LETTER_D("d"),
    LETTER_F("f"),
    LETTER_G("g"),
    LETTER_H("h"),
    LETTER_J("j"),
    LETTER_K("k"),
    LETTER_L("l"),
    LETTER_N_TILDE("N, tilde"),
    LETTER_Z("z"),
    LETTER_X("x"),
    LETTER_C("c"),
    LETTER_V("v"),
    LETTER_B("b"),
    LETTER_N("n"),
    LETTER_M("m"),
    LETTER_SPACE("Espacio"),
    SHIFT_KEY("//*[@contentDescription='Shift']");

    private final String letter;

    Keyboard(String letter) {
        this.letter = letter;
    }


    public String getLetter() {
        return this.letter;
    }

}