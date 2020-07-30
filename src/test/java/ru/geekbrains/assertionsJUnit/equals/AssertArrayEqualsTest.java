package ru.geekbrains.assertionsJUnit.equals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class AssertArrayEqualsTest {
    @Test
    void mytest () {
        int a [] = {1, 4, 6, 8};
        int b [] = {1, 4, 6, 4};

        assertArrayEquals(a, b, "Выявлено несоответствие");
    }
}
