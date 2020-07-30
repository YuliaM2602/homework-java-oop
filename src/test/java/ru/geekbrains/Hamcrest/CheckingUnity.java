package ru.geekbrains.Hamcrest;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CheckingUnity {

    @Test
    void allOfTest() {
        String word = "development";
        String start = "deve";
        String end = "lopment";
        assertThat(word, allOf(startsWith(start), endsWith(end)));
    }

    @Test
    void anyOfTest() {
        String word = "development";
        String start = "deve";
        String end = "go";
        assertThat(word, anyOf(startsWith(start), endsWith(end)));
    }

    @Test
    void notOfTest() {
        String word = "development";
        String start = "go";
        assertThat(word, not(startsWith(start)));
    }


}
