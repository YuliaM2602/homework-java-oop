package ru.geekbrains.javaoopat;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.javaoopat.base.BaseTest;
import ru.geekbrains.javaoopat.testgb.block.SearchTab;
import ru.geekbrains.javaoopat.testgb.page.sections.TestPage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.*;

@Feature("Поиск")
@Story("Проверка отображения блоков")
@Execution(ExecutionMode.CONCURRENT)
public class SearchTabTest extends BaseTest {

        @BeforeEach
        void beforeSearchTest() {
            chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }


        @DisplayName("Проверка количества контента")
        @Test
        void searchTest() {
            new TestPage(chromedriver)
                    .openUrl()
                    .getHeaderBlock()
                    .searchText("java")
                    .getSearchTab()
                    .checkCount(SearchTab.Tab.PROFESSIONS, greaterThanOrEqualTo(2))
                    .checkCount(SearchTab.Tab.COURSES, greaterThan(15))
                    .checkCount(SearchTab.Tab.EVENTS, allOf(greaterThan(180), lessThan(300)))
                    .checkCount(SearchTab.Tab.BLOGS, greaterThan(300))
                    .checkCount(SearchTab.Tab.FORUMS, not(350))
                    .checkCount(SearchTab.Tab.TESTS, not(0));
        }
    }