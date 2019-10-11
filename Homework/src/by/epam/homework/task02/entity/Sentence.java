package by.epam.homework.task02.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {

    public List<Word> wordList = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(wordList, sentence.wordList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordList);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "wordList=" + wordList +
                '}';
    }
}
