package test.by.epam.training.tasks.information.handling.parsers;

import by.epam.training.tasks.information.handling.components.Component;
import by.epam.training.tasks.information.handling.components.Composite;
import by.epam.training.tasks.information.handling.parsers.SentenceParser;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static by.epam.training.tasks.information.handling.components.Lexeme.*;

public class SentenceParserTest {

    private static final String TEST_SENTENCE = "Sentence number [1+2]";

    private static final Component EXPECTED = new Composite(Arrays.asList(
            word("Sentence"),
            word("number"),
            expression("[1+2]")
        )
    );

    @Test
    public void testParse() {
        SentenceParser parser = new SentenceParser(null);

        Component actual = parser.parse(TEST_SENTENCE);

        Assert.assertEquals(EXPECTED, actual);
    }

}
