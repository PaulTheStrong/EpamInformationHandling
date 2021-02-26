package by.epam.training.tasks.information.handling.creators;

public class AssemblerBuilder {

    public AbstractStringAssembler build() {
        return new TextAssembler(new ParagraphAssembler(new SentenceAssembler(null)));
    }
}
