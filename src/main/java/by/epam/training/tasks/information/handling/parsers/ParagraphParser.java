package by.epam.training.tasks.information.handling.parsers;

import by.epam.training.tasks.information.handling.components.Component;
import by.epam.training.tasks.information.handling.components.Composite;

import java.util.Arrays;

public class ParagraphParser extends AbstractParser {

    public ParagraphParser(AbstractParser successor) {
        super(successor);
    }

    @Override
    protected String getSplitter() {
        return "\\. ?";
    }

}
