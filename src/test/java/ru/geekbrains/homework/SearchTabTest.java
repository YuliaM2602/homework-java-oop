package ru.geekbrains.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.homework.base.BaseTest;
import ru.geekbrains.homework.block.SearchTab;
import ru.geekbrains.homework.page.SearchPage;
import ru.geekbrains.homework.page.TestPage;


import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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
                .getHeader()
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
