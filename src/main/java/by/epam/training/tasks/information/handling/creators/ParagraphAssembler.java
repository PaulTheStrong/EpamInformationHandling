package by.epam.training.tasks.information.handling.creators;

import by.epam.training.tasks.information.handling.components.Component;
import by.epam.training.tasks.information.handling.components.Composite;

import java.util.List;
import java.util.stream.Collectors;

public class ParagraphAssembler extends AbstractStringAssembler {

    private static final String DELIMITER = ". ";

    public ParagraphAssembler(AbstractStringAssembler successor) {
        super(successor);
    }

    @Override
    public String assemble(Composite paragraph) {
        AbstractStringAssembler successor = getSuccessor();
        return paragraph.getComponents()
                .stream()
                .map(currentSentence -> successor.assemble((Composite) currentSentence))
                .collect(Collectors.joining(DELIMITER)) + ".";
    }
}
