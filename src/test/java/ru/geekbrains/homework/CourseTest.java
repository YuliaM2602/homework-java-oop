package ru.geekbrains.homework;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.homework.base.BaseTest;
import ru.geekbrains.homework.testgb.block.ContentNavigationCourseBlock;
import ru.geekbrains.homework.testgb.block.Sections;
import ru.geekbrains.homework.testgb.page.CoursePage;

@Feature("Поиск")
@Story("Проверка отображения блоков")
@DisplayName("Страница Курсы")
public class CourseTest extends BaseTest {

    @DisplayName("Проверка работы фильтров")
    @Test
    void checkSingInValidLogin() {
        CoursePage coursePage = ((CoursePage)
                new CoursePage(chromedriver)
                        .openUrl()
                        .closedPopUp()
                        .getSections()
                        .clickButton(Sections.Button.COURSES)
        );


        coursePage.getContentNavigationCourseBlock().clickTab(ContentNavigationCourseBlock.Tab.COURSES)
                .configFilter("Бесплатные", "Тестирование")
                .checkingDisplayedCourses(
                        "Тестирование ПО. Уровень 1",
                        "Тестирование ПО. Уровень 2"
                )
        ;

    }
}