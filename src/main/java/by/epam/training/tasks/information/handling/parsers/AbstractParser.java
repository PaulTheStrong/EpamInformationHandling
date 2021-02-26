package by.epam.training.tasks.information.handling.parsers;

import by.epam.training.tasks.information.handling.components.Component;
import by.epam.training.tasks.information.handling.components.Composite;

import java.util.Arrays;

public abstract class AbstractParser {

    private final AbstractParser successor;

    public AbstractParser(AbstractParser successor) {
        this.successor = successor;
    }

    public AbstractParser getSuccessor() {
        return successor;
    }

    protected abstract String getSplitter();

    public Component parse(String input) {

        String splitter = getSplitter();

        Composite root = new Composite();
        AbstractParser successor = getSuccessor();
        Arrays.stream(input.split(splitter)).forEach(sentence -> root.add(successor.parse(sentence)));

        return root;
    }

}
