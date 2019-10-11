package by.epam.homework.task02.service;

import by.epam.homework.task02.entity.Sentence;
import by.epam.homework.task02.entity.Text;
import by.epam.homework.task02.entity.Word;

import java.util.List;
import java.util.stream.Collectors;

public class TextService {

    public String takeFullText(Text text) {
        StringBuilder sb = new StringBuilder();
        text.sentences
                .forEach(sentence -> {
                    sentence.wordList
                            .forEach(word -> sb.append(word.getContent()).append(" "));
                    sb.replace(sb.length()-1, sb.length()-1,".");
                });
        return sb.toString();
    }

    public void addWord(Text text, Word word) {
        Sentence lastSentence = text.sentences.get(text.sentences.size()-1);
        lastSentence.wordList.add(word);
    }

}
