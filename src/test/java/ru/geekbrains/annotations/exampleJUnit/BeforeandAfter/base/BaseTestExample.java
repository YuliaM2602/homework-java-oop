package ru.geekbrains.annotations.exampleJUnit.BeforeandAfter.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTestExample {
    @BeforeAll
    static void beforeAll() {
        System.out.println("BaseTest BeforeAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("BaseTest BeforeEach");
    }

    @AfterEach
    void tearDown() {
        System.out.println("BaseTest AfterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("BaseTest AfterAll");
    }
}
