package ru.geekbrains.assertionsJUnit.nullTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertNotNullTest {
    @Test
    void name1() {
        String catname = "Bars";
        Assertions.assertNotNull(catname);
    }

    @Test
    void name2() {
        String catname = null;
        Assertions.assertNotNull(catname);
    }
}
