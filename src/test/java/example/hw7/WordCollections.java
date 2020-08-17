package example.hw7;

import java.util.*;

public class WordCollections {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("Cat");
        wordList.add("Dog");
        wordList.add("Dog");
        wordList.add("Dog");
        wordList.add("Animals");
        wordList.add("Horse");
        wordList.add("Cat");
        wordList.add("Bird");
        wordList.add("Pig");
        wordList.add("Cow");

        Set<String> unique = new HashSet<>(wordList);

        System.out.println("Уникальные слова: " + unique.toString());

        System.out.println("Частота встречаемости слов: ");
        for (String key: unique) {
            System.out.println(key + ": " + Collections.frequency(wordList, key));
        }


    }


}
