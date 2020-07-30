package ru.geekbrains.annotations.exampleJUnit.Repeated;

import org.junit.jupiter.api.Test;

public class RepeatedTest {

    @org.junit.jupiter.api.RepeatedTest(value = 3)
    @Test
    void name() {
        System.out.println("Проверка");
    }
}
