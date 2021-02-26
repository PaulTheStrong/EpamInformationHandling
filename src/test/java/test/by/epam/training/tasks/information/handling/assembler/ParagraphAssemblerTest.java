package test.by.epam.training.tasks.information.handling.assembler;

import by.epam.training.tasks.information.handling.components.Composite;
import by.epam.training.tasks.information.handling.creators.ParagraphAssembler;
import by.epam.training.tasks.information.handling.creators.SentenceAssembler;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;

public class ParagraphAssemblerTest {

    private final static String EXPECTED = "Hello world. This is a sentence. Sentence number [1+2].";

    private final static Composite PARAGRAPH = new Composite(Arrays.asList(
            new Composite(),
            new Composite(),
            new Composite()
    ));

    @Test
    public void testParagraphAssemble() {

        SentenceAssembler sentenceAssembler = Mockito.mock(SentenceAssembler.class);
        Mockito.when(sentenceAssembler.assemble(Mockito.any())).thenReturn("Hello world", "This is a sentence", "Sentence number [1+2]");
        ParagraphAssembler paragraphAssembler = new ParagraphAssembler(sentenceAssembler);

        String actual = paragraphAssembler.assemble(PARAGRAPH);

        Assert.assertEquals(EXPECTED, actual);
    }

}
