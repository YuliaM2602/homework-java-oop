package ru.geekbrains.javaoopat;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.javaoopat.base.BaseTest;
import ru.geekbrains.javaoopat.testgb.block.ContentNavigationCourseBlock;
import ru.geekbrains.javaoopat.testgb.block.Sections;
import ru.geekbrains.javaoopat.testgb.page.sections.CoursePage;

@Feature("Поиск")
@Story("Проверка отображения блоков")
@DisplayName("Страница Курсы")
@Execution(ExecutionMode.CONCURRENT)
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