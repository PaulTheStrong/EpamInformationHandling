package by.epam.training.tasks.information.handling.components;

public abstract class Lexeme implements Component {

    protected String value;

    public Lexeme(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
