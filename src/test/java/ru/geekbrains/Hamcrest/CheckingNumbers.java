package ru.geekbrains.Hamcrest;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;


public class CheckingNumbers {

    @Test
    //число больше
    void greaterThanTest() {
        int numberActual = 90;
        int numberExpected = 80;

        MatcherAssert.assertThat(numberActual, greaterThan (numberExpected));
    }

    @Test
    //число меньше или равно
    void lessThanOrEqualToTest () {
        int numberActual = 90;
        int numberExpected = 90;

        MatcherAssert.assertThat(numberActual, lessThanOrEqualTo (numberExpected));
    }

    @Test
    //число равно с погрешностью
    void closeToTest () {
        double numberActual = 90;
        double numberExpected = 87.6;

        MatcherAssert.assertThat(numberActual, closeTo(numberExpected, 3));
    }
}
