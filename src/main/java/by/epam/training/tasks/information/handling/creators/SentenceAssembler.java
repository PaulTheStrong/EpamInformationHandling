package by.epam.training.tasks.information.handling.creators;

import by.epam.training.tasks.information.handling.components.Component;
import by.epam.training.tasks.information.handling.components.Composite;
import by.epam.training.tasks.information.handling.components.Lexeme;

import java.util.stream.Collectors;

public class SentenceAssembler extends AbstractStringAssembler {

    private static final String DELIMITER = " ";

    public SentenceAssembler(AbstractStringAssembler successor) {
        super(successor);
    }

    @Override
    public String assemble(Composite sentence) {
        return sentence.getComponents()
                .stream()
                .map(currentLexeme -> ((Lexeme)currentLexeme).getValue())
                .collect(Collectors.joining(DELIMITER));
    }
}
