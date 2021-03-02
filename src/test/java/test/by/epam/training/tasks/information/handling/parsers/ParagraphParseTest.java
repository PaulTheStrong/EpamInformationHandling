package test.by.epam.training.tasks.information.handling.parsers;

import by.epam.training.tasks.information.handling.components.Component;
import by.epam.training.tasks.information.handling.components.Composite;
import by.epam.training.tasks.information.handling.parsers.ParagraphParser;
import by.epam.training.tasks.information.handling.parsers.SentenceParser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static by.epam.training.tasks.information.handling.components.Lexeme.expression;
import static by.epam.training.tasks.information.handling.components.Lexeme.word;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class ParagraphParseTest {

    private static final String TEST_STRING = "Hello world. Sentence number [1+2].";

    private static final Component FIRST_SENTENCE = new Composite(Arrays.asList(
            word("Hello"),
            word("World")
    ));

    private static final Component SECOND_SENTENCE = new Composite(Arrays.asList(
            word("Sentence"),
            word("number"),
            expression("[1+2]")
    ));

    private static final Component EXPECTED = new Composite(Arrays.asList(
            FIRST_SENTENCE, SECOND_SENTENCE
    ));

    @Test
    public void testParse() {
        SentenceParser sentenceParser = Mockito.mock(SentenceParser.class);
        when(sentenceParser.parse("Hello world")).thenReturn(FIRST_SENTENCE);
        when(sentenceParser.parse("Sentence number [1+2]")).thenReturn(SECOND_SENTENCE);
        ParagraphParser paragraphParser = new ParagraphParser(sentenceParser);

        Component actual = paragraphParser.parse(TEST_STRING);

        Assert.assertEquals(EXPECTED, actual);
    }
}
