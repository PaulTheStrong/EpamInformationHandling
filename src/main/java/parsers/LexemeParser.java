package parsers;

import components.Component;
import components.Composite;
import components.Expression;
import components.Word;
import creators.AbstractStringAssembler;
import creators.ParagraphAssembler;
import creators.SentenceAssembler;
import creators.TextAssembler;

public class LexemeParser extends AbstractParser {

    private static final String EXPRESSION_PATTER = "\\[.*]";

    public LexemeParser(AbstractParser successor) {
        super(successor);
    }

    @Override
    public Component parse(String input) {
        if (input.matches(EXPRESSION_PATTER)) {
            return new Expression(input);
        } else {
            return new Word(input);
        }
    }

    public static void main(String[] args) {
        String text = "Hello world. This is a sentence.\n" +
                "This is another sentence. In second paragraph.\n" +
                "This is an expression [3 + 5]. Expression number [1 + 1].";

        AbstractParser rootParser = new TextParser(new ParagraphParser(new SentenceParser(new LexemeParser(null))));

        Composite composite = (Composite) rootParser.parse(text);

        AbstractStringAssembler assembler = new TextAssembler(new ParagraphAssembler(new SentenceAssembler(null)));
        String assembledText = assembler.assemble(composite);
        System.out.println(assembledText);
        System.out.println(assembledText.equals(text));
    }
}
