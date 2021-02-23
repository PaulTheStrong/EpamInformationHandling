package parsers;

import components.Component;

public abstract class AbstractParser {

    private final AbstractParser successor;

    public AbstractParser(AbstractParser successor) {
        this.successor = successor;
    }

    public AbstractParser getSuccessor() {
        return successor;
    }

    public abstract Component parse(String input);

}
