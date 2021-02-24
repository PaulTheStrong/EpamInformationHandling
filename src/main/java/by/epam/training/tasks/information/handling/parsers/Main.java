package by.epam.training.tasks.information.handling.parsers;

import by.epam.training.tasks.information.handling.TextLogic;
import by.epam.training.tasks.information.handling.components.Composite;
import by.epam.training.tasks.information.handling.creators.AbstractStringAssembler;
import by.epam.training.tasks.information.handling.creators.ParagraphAssembler;
import by.epam.training.tasks.information.handling.creators.SentenceAssembler;
import by.epam.training.tasks.information.handling.creators.TextAssembler;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world. This is a sentence. Sentence number [1 + 2 + 3].\n" +
                "This is another sentence. In second paragraph.\n" +
                "This is an expression [3+5]. Expression number [1+1].\n" +
                "Bye.";

        AbstractParser rootParser = new TextParser(new ParagraphParser(new SentenceParser(null)));

        Composite composite = (Composite) rootParser.parse(text);

        AbstractStringAssembler assembler = new TextAssembler(new ParagraphAssembler(new SentenceAssembler(null)));
        String assembledText = assembler.assemble(composite);
        System.out.println(assembledText);
        System.out.println(assembledText.equals(text));
        TextLogic logic = new TextLogic();

        logic.sortWordInSentencesByLength(composite);
        assembledText = assembler.assemble(composite);
        System.out.println(assembledText);
    }
}
