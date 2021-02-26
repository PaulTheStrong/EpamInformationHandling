package test.by.epam.training.tasks.information.handling.assembler;

import by.epam.training.tasks.information.handling.components.Composite;
import by.epam.training.tasks.information.handling.components.Lexeme;
import by.epam.training.tasks.information.handling.creators.ParagraphAssembler;
import by.epam.training.tasks.information.handling.creators.SentenceAssembler;
import by.epam.training.tasks.information.handling.creators.TextAssembler;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class TextAssemblerTest {

    private final static String EXPECTED = "Hello world. This is a sentence. Sentence number [1+2].\n" +
            "This is another sentence. In second paragraph.\n" +
            "This is an expression [3+5]. Expression number [1+1].\n" +
            "Bye.";

    private final static Composite TEXT = new Composite(Arrays.asList(
            new Composite(),
            new Composite(),
            new Composite(),
            new Composite()
    ));

    @Test
    public void testTextAssemble() {

        ParagraphAssembler paragraphAssembler = Mockito.mock(ParagraphAssembler.class);
        Mockito.when(paragraphAssembler.assemble(Mockito.any())).thenReturn(
                "Hello world. This is a sentence. Sentence number [1+2].",
                "This is another sentence. In second paragraph.",
                "This is an expression [3+5]. Expression number [1+1].",
                "Bye.");
        TextAssembler textAssembler = new TextAssembler(paragraphAssembler);

        String actual = textAssembler.assemble(TEXT);

        Assert.assertEquals(EXPECTED, actual);
    }

}
