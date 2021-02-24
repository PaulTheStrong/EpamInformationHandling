package by.epam.training.tasks.information.handling.parsers;

import by.epam.training.tasks.information.handling.components.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser extends AbstractParser{

    private static final String WORD_PATTERN = "(\\S+)";
    private static final String EXPR_PATTERN = "(\\[.*])";

    private static final String ANY = EXPR_PATTERN + "|"  + WORD_PATTERN;
    private static final Pattern PATTERN = Pattern.compile(ANY);

    public SentenceParser(AbstractParser successor) {
        super(successor);
    }

    protected String getSplitter() {
        return "";
    }

    @Override
    public Component parse(String input) {
        Composite sentence = new Composite();
        Matcher matcher = PATTERN.matcher(input);
        while (matcher.find()) {
            String lexeme = matcher.group();
            if (lexeme.matches(EXPR_PATTERN)) {
                sentence.add(new Expression(lexeme));
            } else {
                sentence.add(new Word(lexeme));
            }
        }
        return sentence;
    }

}
