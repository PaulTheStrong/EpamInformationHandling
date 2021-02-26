package test.by.epam.training.tasks.information.handling.assembler;

import by.epam.training.tasks.information.handling.components.Composite;
import by.epam.training.tasks.information.handling.components.Lexeme;
import by.epam.training.tasks.information.handling.creators.SentenceAssembler;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SentenceAssemblerTest {

    private final Composite SENTENCE = new Composite(Arrays.asList(
            new Lexeme("Hello", Lexeme.Type.WORD),
            new Lexeme("world", Lexeme.Type.WORD),
            new Lexeme("[1 + 2 * 3]", Lexeme.Type.EXPRESSION)
        )
    );

    public final String EXPECTED = "Hello world [1 + 2 * 3]";

    @Test
    public void testSentenceAssemble() {
        SentenceAssembler sentenceAssembler = new SentenceAssembler(null);

        String actual = sentenceAssembler.assemble(SENTENCE);

        Assert.assertEquals(EXPECTED, actual);
    }

}
