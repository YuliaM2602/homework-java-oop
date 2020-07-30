package ru.geekbrains.annotations.exampleJUnit.Parameterized;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParameterizedExampleTest<Calculator> {

    @ParameterizedTest
    @MethodSource("Listname")
    void method(String name) {
        Assertions.assertNotNull(name);
    }
    public static Stream<String> Listname(){
        return Stream.of("Kitty", "Bars", "Leo");
    }

    @ParameterizedTest
    @MethodSource("ListnameMulti")
    void method(String name, String color, Integer age) {
        Assertions.assertNotNull(name);
        Assertions.assertNotNull(color);
        Assertions.assertNotNull(age);
    }
    public static Stream<Arguments> ListnameMulti() {
        return Stream.of(
        Arguments.of("Kitty", "white", 3),
        Arguments.of("Leo", "black", 5),
        Arguments.of("Bars",null, 2)
        );
    }


}

