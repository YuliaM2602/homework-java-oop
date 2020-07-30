package ru.geekbrains.Hamcrest;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class CheckingString {
    @Test
    //равно с игнорированием регистра
    void equalToIgnoringCaseTest() {
        String name1 = "Bars";
        String name2 = "BARS";

        MatcherAssert.assertThat(name2, equalToIgnoringCase(name1));
    }

    @Test
    //содержит строку
    void containsStringTest() {
        String name = "Who are you";

        MatcherAssert.assertThat(name, containsString("are"));
    }

    @Test
    //оканчивается на строку
    void endsWithTest() {
        String name = "Who are you";

        MatcherAssert.assertThat(name, endsWith("you"));
    }

    @Test
    //игнорировать пробелы
    void equalToCompressingWhiteSpaceTest () {
        String name = "Who are           you";

        MatcherAssert.assertThat(name, equalToCompressingWhiteSpace("Who are you"));
    }
}
