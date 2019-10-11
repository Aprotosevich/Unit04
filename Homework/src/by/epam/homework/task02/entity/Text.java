package by.epam.homework.task02.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {

    private String header;
    public List<Sentence> sentences = new ArrayList<>();

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(header, text.header) &&
                Objects.equals(sentences, text.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, sentences);
    }

    @Override
    public String toString() {
        return "Text{" +
                "header='" + header + '\'' +
                ", sentences=" + sentences +
                '}';
    }
}
