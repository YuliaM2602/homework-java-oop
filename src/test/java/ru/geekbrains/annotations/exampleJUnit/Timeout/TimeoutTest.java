package ru.geekbrains.annotations.exampleJUnit.Timeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.lang.Thread.sleep;

public class TimeoutTest {
    @Timeout(value = 7)
    @Test
    void name1() throws InterruptedException {
        sleep(3000);
        }

    @Timeout(value = 2)
    @Test
    void name2() throws InterruptedException {
        sleep(2500);
    }
}



