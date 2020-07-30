package ru.geekbrains.assertionsJUnit.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertFailTest {
    @Test
    void name() {
        Assertions.fail("Тест упадет");
    }
}
