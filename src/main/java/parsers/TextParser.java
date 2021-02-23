package parsers;

import components.Component;
import components.Composite;

public class TextParser extends AbstractParser{

    private static final String SPLITTER = "\n";

    public TextParser(AbstractParser successor) {
        super(successor);
    }

    @Override
    public Component parse(String input) {
        Composite root = new Composite();
        String[] paragraphs = input.split(SPLITTER);

        for (String paragraph : paragraphs) {
            root.add(getSuccessor().parse(paragraph));
        }

        return root;
    }
}
