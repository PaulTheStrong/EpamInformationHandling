package components;

public abstract class Lexeme implements Component {

    protected String value;

    public Lexeme(String value) {
        this.value = value;
    }
}
