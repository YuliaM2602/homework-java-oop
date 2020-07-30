package ru.geekbrains.Hamcrest;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CheckingObjects {

    @Test
    //две ссылки на один объект
    void sameInstanceTest () {
        String name = "Bars";
        Cat cat1 = new Cat (name);
        Cat cat2 = cat1;
        assertThat(cat1, sameInstance(cat2) );
    }

    @Test
    //проверить по методу toString
    void hasToStringTest () {
        String name = "Bars";
        Cat cat1 = new Cat (name);
        assertThat(cat1, hasToString("My name is Bars"));
    }

    @Test
    //класс является подтипом
    void typeCompatibleWithTest() {
        assertThat(Cat.class, typeCompatibleWith(Object.class));
    }

    @Test
    //объект является подтипом
    void instanceOfTest() {
        String name = "Bars";
        Cat cat = new Cat(name);
        assertThat(cat, instanceOf(Object.class));
    }

    @Test
    //проверка проперти
    void hasPropertyTest() {
        Cat cat = new Cat("Bars");
        assertThat(cat, hasProperty("name", equalTo("Bars")));
    }

    @Test
    //проверка объектов по значениям
    void samePropertyValuesAsTest() {
        Cat cat1 = new Cat ("Bars");
        Cat cat2 = new Cat ("Bars");
        MatcherAssert.assertThat(cat1, samePropertyValuesAs(cat2));
    }

}
