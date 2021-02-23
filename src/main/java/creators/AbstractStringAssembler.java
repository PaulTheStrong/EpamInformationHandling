package creators;

import components.Component;
import components.Composite;

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
