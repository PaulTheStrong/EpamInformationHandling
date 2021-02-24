package by.epam.training.tasks.information.handling.creators;

import by.epam.training.tasks.information.handling.components.Composite;

public abstract class AbstractStringAssembler {

    private final AbstractStringAssembler successor;

    public AbstractStringAssembler(AbstractStringAssembler successor) {
        this.successor = successor;
    }


    public AbstractStringAssembler getSuccessor() {
        return successor;
    }

    public abstract String assemble(Composite component);
}
