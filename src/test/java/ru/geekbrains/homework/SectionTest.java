package ru.geekbrains.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.stream.Stream;

public class SectionTest extends BaseTest {

    @AfterEach
    void tearDown() {
        WebElement header = chromeDriver.findElementByCssSelector("[class*=\"gb-header__content\"]");
        WebElement footer = chromeDriver.findElementByCssSelector("[class=\"site-footer__content\"]");

        wait15second.until(ExpectedConditions.visibilityOf(
                header));
        wait15second.until(ExpectedConditions.visibilityOf(
                footer));
    }

    @DisplayName("Работа с навигацией по разделам")
    @ParameterizedTest
    @MethodSource("List")
    public void method(String nameSection, String href) {

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/" + href + "\"]")).click();

        Assertions.assertEquals(
                nameSection,
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }

    public static Stream<Arguments> List() {
        return Stream.of(
                Arguments.of("Курсы", "courses"),
                Arguments.of("Форум", "topics"),
                Arguments.of("Блог", "posts"),
                Arguments.of("Тесты", "tests"),
                Arguments.of("Карьера", "career")
        );

    }
}
//    Работает и без закрытия попапа, оставила себе для примера)
//    @Test
//    public void posts() {
//        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();
//        chromeDriver.findElement(By.cssSelector("[class=\"gb-empopup-close\"]")).click();
//        chromeDriver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();
//        Assertions.assertEquals(
//                "Блог",
//                chromeDriver.findElement(By.cssSelector("id=\"top-menu\"] h2")).getText()
//        );
//    }




