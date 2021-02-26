package by.epam.training.tasks.information.handling.parsers;

import by.epam.training.tasks.information.handling.creators.ParagraphAssembler;
import by.epam.training.tasks.information.handling.creators.SentenceAssembler;
import by.epam.training.tasks.information.handling.creators.TextAssembler;

public class ParserBuilder {

    public AbstractParser build() {
        return new TextParser(new ParagraphParser(new SentenceParser(null)));
    }

}
