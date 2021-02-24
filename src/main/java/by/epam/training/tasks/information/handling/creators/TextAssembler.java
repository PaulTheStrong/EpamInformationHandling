package by.epam.training.tasks.information.handling.creators;

import by.epam.training.tasks.information.handling.components.Composite;

import java.util.stream.Collectors;

public class TextAssembler extends AbstractStringAssembler {

    private static final String DELIMITER = "\n";

    public TextAssembler(AbstractStringAssembler successor) {
        super(successor);
    }

    @Override
    public String assemble(Composite text) {
        AbstractStringAssembler successor = getSuccessor();
        return text.getComponents()
                .stream()
                .map(currentParagraph -> successor.assemble((Composite) currentParagraph))
                .collect(Collectors.joining("\n"));
    }
}
