package by.epam.homework.task02;

/* Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
        консоль текст, заголовок текста. */

import by.epam.homework.task02.entity.Sentence;
import by.epam.homework.task02.entity.Text;
import by.epam.homework.task02.entity.Word;
import by.epam.homework.task02.service.TextService;

public class Main {
    public static void main(String[] args) {
        Text textExample = createText();
        System.out.println(textExample.getHeader()); // заголовок текста
        TextService textService = new TextService();

        System.out.println(textService.takeFullText(textExample)); // вывести на консоль текст
        Word word = new Word("Last_WORD");
        textService.addWord(textExample, word);
        System.out.println(textService.takeFullText(textExample));
    }

    private static Text createText() {
        Text text = new Text();
        text.setHeader("Text header");

        Sentence sentence = new Sentence();
        Sentence sentence1 = new Sentence();

        sentence.wordList.add(new Word("Hello"));
        sentence.wordList.add(new Word("World"));
        sentence1.wordList.add(new Word("Another"));
        sentence1.wordList.add(new Word("Sentence"));
        sentence1.wordList.add(new Word("Done"));
        text.sentences.add(sentence);
        text.sentences.add(sentence1);

        return text;
    }
}
