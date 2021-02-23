package parsers;

import components.Component;
import components.Composite;

public class ParagraphParser extends AbstractParser {

    private static final String SPLITTER = "\\. ?";

    public ParagraphParser(AbstractParser successor) {
        super(successor);
    }

    @Override
    public Component parse(String input) {
        Composite root = new Composite();
        String[] sentences = input.split(SPLITTER);

        for (String sentence : sentences) {
            root.add(getSuccessor().parse(sentence));
        }

        return root;
    }
}
