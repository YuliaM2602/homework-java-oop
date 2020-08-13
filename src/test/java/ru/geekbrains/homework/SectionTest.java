package ru.geekbrains.homework;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.homework.base.BaseTest;
import ru.geekbrains.homework.testgb.block.Sections;
import ru.geekbrains.homework.testgb.page.TestPage;

import java.util.stream.Stream;

@Epic(value = "Проверка перехода по разделам")
@Feature("Навигация")
@Story("Переход на страницы")
@DisplayName("Переход на страницы")
public class SectionTest extends BaseTest {
    public static Stream<Sections.Button> stringProviderNotPopUp(){
        return Stream.of(
                Sections.Button.TOPICS,
                Sections.Button.EVENTS,
                Sections.Button.TESTS,
                Sections.Button.CAREER
        );
    }
    @Description("Тесты, которые проверяют функционал без Pop-UP")
    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProviderNotPopUp")
    public void checkNavigationNotPopUp(Sections.Button button) {
        new TestPage(chromedriver)
                .openUrl()
                .getSections().clickButton(button)
                .getHeader().checkNamePage(button.getText());
    }


    @Test
    @Description("Проверка с закрытием Pop-UP")
    public void checkNavigationPopUp() {
        new TestPage(chromedriver)
                .openUrl()
                .getSections().clickButton(Sections.Button.POSTS)
                .closedPopUp()
                .getHeader().checkNamePage(Sections.Button.POSTS.getText());
    }

}




