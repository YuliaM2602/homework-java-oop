package ru.geekbrains.homework;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.homework.base.BaseTest;
import static ru.geekbrains.homework.block.Sections.Button;

import ru.geekbrains.homework.block.Sections;
import ru.geekbrains.homework.page.TestPage;


import java.awt.*;
import java.util.stream.Stream;



@DisplayName("Переход на страницы")
public class SectionTest extends BaseTest {
    public static Stream<Button> stringProviderNotPopUp(){
        return Stream.of(
                   Sections.Button.TOPICS,
                   Sections.Button.EVENTS,
                   Sections.Button.TESTS,
                   Sections.Button.CAREER
        );
    }

    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProviderNotPopUp")
    public void checkNavigationNotPopUp(Button button) {
        new TestPage(chromedriver)
                .openUrl()
                .getSections().clickButton(button)
                .getHeader().checkNamePage(button.getText());
    }


    @Test
    @DisplayName("Нажатие на элемент навигации")
    public void checkNavigationPopUp() {
        new TestPage(chromedriver)
                .openUrl()
                .getSections().clickButton(Sections.Button.POSTS)
                .closedPopUp()
                .getHeader().checkNamePage(Sections.Button.POSTS.getText());
    }

}
