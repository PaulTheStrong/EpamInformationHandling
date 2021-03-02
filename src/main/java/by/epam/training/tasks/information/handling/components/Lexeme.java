package by.epam.training.tasks.information.handling.components;

public class Lexeme implements Component {

    public enum Type {
        EXPRESSION, WORD
    }

    private String value;
    private Type type;

    private Lexeme(String value, Type type) {
        this.value = value;
        this.type = type;
    }

    public static Lexeme word(String value) {
        return new Lexeme(value, Type.WORD);
    }

    public static Lexeme expression(String value) {
        return new Lexeme(value, Type.EXPRESSION);
    }

    public String getValue() {
        return value;
    }
}
