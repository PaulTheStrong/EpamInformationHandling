package by.epam.training.tasks.information.handling.components;

public class Lexeme implements Component {

    public enum Type {
        EXPRESSION, WORD
    }

    private String value;
    private Type type;

    public Lexeme(String value, Type type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }
}
