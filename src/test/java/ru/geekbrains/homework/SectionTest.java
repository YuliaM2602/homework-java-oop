package ru.geekbrains.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.homework.base.BaseTest;
import ru.geekbrains.homework.page.ContentPage;

import java.util.stream.Stream;

public class SectionTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        chromeDriver.get("https://geekbrains.ru/events");
    }

    @AfterEach
    void tearDown() {

        ContentPage contentPage = PageFactory.initElements(chromeDriver, ContentPage.class);
        wait15second.until(ExpectedConditions.visibilityOf(
                contentPage.getHeader()));
        wait15second.until(ExpectedConditions.visibilityOf(
                contentPage.getFooter()));
    }

    @DisplayName("Блог")
    @Test
    public void posts() {
        String namePage = "Блог";
        ContentPage contentPage = new ContentPage(chromeDriver);

        contentPage.getSections().getButton(namePage).click();
        contentPage.getButtonClosePopUp1().click();
        contentPage.getButtonClosePopUp2().click();

        contentPage.checkNameSection(namePage);
    }

    @DisplayName("Работа с навигацией по разделам")
    @ParameterizedTest
    @MethodSource("List")
    public void courses(String nameSection) {
        ContentPage contentPage = new ContentPage(chromeDriver);

        contentPage.getSections().getButton(nameSection).click();

        contentPage.checkNameSection(nameSection);
    }


    public static Stream<Arguments> List() {
        return Stream.of(
//                Arguments.of("Курсы", "courses"),
                Arguments.of("Вебинары"),
                Arguments.of("Форум"),
                Arguments.of("Тесты"),
                Arguments.of("Карьера")
        );

    }
}






