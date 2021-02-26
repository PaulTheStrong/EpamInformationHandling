package test.by.epam.training.tasks.information.handling.read;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class TextReadTest {

    private final String EXPECTED = "Hello world. This is a sentence. Sentence number [1+2].\n" +
            "This is another sentence. In second paragraph.\n" +
            "This is an expression [3+5]. Expression number [1+1].\n" +
            "Bye.";

    private final String VALID_FILENAME = "src/main/resources/text";

    @Test
    public void testReadShouldReturnStringWhenFileExists() throws IOException {
        String actual = String.join("\n", Files.readAllLines(Paths.get(VALID_FILENAME)));

        Assert.assertEquals(EXPECTED, actual);
    }

}
