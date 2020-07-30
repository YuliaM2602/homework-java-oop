package ru.geekbrains.annotations.exampleJUnit.BeforeandAfter.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstJunit5Test extends BaseTestExample {
    @Test
    void myFirstTest () {
        assertEquals(10, 5*2);
        System.out.println("myFirstTest");
    }

    @Test
    void myTest2() {
        assertEquals(10, 13-2);
        System.out.println("myTest2");
    }
}
