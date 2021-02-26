package by.epam.training.tasks.information.handling.parsers;

import by.epam.training.tasks.information.handling.TextLogic;
import by.epam.training.tasks.information.handling.components.Composite;
import by.epam.training.tasks.information.handling.creators.*;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world. This is a sentence. Sentence number [1 + 2 + 3].\n" +
                "This is another sentence. In second paragraph.\n" +
                "This is an expression [3 + 5]. Expression number [1 + 1].\n" +
                "Bye.";

        AbstractParser rootParser = new ParserBuilder().build();

        Composite composite = (Composite) rootParser.parse(text);

        AbstractStringAssembler assembler = new AssemblerBuilder().build();
        String assembledText = assembler.assemble(composite);
        System.out.println(assembledText);
        System.out.println(assembledText.equals(text));
        TextLogic logic = new TextLogic();

        logic.sortWordInSentencesByLength(composite);
        assembledText = assembler.assemble(composite);
        System.out.println(assembledText);
    }
}
