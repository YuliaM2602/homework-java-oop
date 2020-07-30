package ru.geekbrains.assertionsJUnit.nullTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertNullTest {
    @Test
    void name1() {
        String catname = "Bars";
        Assertions.assertNull(catname);
    }

    @Test
    void name2() {
        String catname = null;
        Assertions.assertNull(catname);
    }
}
