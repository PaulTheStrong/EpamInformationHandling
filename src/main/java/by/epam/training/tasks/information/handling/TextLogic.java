package by.epam.training.tasks.information.handling;

import by.epam.training.tasks.information.handling.components.Component;
import by.epam.training.tasks.information.handling.components.Composite;
import by.epam.training.tasks.information.handling.components.Lexeme;

import java.util.Comparator;
import java.util.List;

public class TextLogic {

    public void sortParagraphsBySentenceCount(Composite text) {
        List<Component> paragraphs = text.getComponents();
        paragraphs.sort(Comparator.comparingInt(paragraph -> ((Composite) paragraph).getComponents().size()));
    }

    public void sortWordInSentencesByLength(Composite text) {
        List<Component> paragraphs = text.getComponents();
        for (Component paragraph : paragraphs) {
            List<Component> sentences = ((Composite)paragraph).getComponents();
            for (Component sentence : sentences) {
                List<Component> words = ((Composite)sentence).getComponents();
                words.sort(Comparator.comparingInt(word -> ((Lexeme) word).getValue().length()));
            }
        }
    }

}
