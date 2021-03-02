package by.epam.training.tasks.information.handling.components;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Lexeme lexeme = (Lexeme) o;
        return value.equals(lexeme.value) && type == lexeme.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type);
    }
}
