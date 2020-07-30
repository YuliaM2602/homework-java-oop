package ru.geekbrains.assertionsJUnit.equals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertEqualsTest {

    @Test
    void test1 () {
        assertEquals(10, 5*2);
    }

    @Test
    void test2 () {
        assertEquals("Leo", "Leo");
    }
}
