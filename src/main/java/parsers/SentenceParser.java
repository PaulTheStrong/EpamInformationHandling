package parsers;

import components.Component;
import components.Composite;

public class SentenceParser extends AbstractParser{

    private static final String SPLITTER = " |(, )";

    public SentenceParser(AbstractParser successor) {
        super(successor);
    }

    @Override
    public Component parse(String input) {
        Composite root = new Composite();
        String[] words = input.split(SPLITTER);

        for (String word : words) {
            root.add(getSuccessor().parse(word));
        }

        return root;
    }
}
