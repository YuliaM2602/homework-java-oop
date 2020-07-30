package ru.geekbrains.assertionsJUnit.all;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertAllTest {
    @Test
    void name() {
        Assertions.assertAll("Пользователь",
        () -> assertEquals("Ivan", "Ivan"),
        () -> assertEquals("Bars", "Leo")
        );
    }
}
