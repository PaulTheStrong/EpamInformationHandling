package by.epam.training.tasks.information.handling.parsers;

import by.epam.training.tasks.information.handling.components.Component;
import by.epam.training.tasks.information.handling.components.Composite;

public class TextParser extends AbstractParser{

    public TextParser(AbstractParser successor) {
        super(successor);
    }

    @Override
    protected String getSplitter() {
        return "\n";
    }
}
