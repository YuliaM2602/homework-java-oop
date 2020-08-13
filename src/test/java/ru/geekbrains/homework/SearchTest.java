package ru.geekbrains.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.homework.base.BaseTest;
import ru.geekbrains.homework.testgb.page.SearchPage;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        chromeDriver.get("https://geekbrains.ru/events");
    }

    @DisplayName("Поиск элементов")
    @Test
    void search() {
        SearchPage searchPage = new SearchPage(chromeDriver);
        searchPage.getButtonSearch().click();
        searchPage.getInputSearch().sendKeys("java");

        WebElement professions = chromeDriver.findElement(By.cssSelector("[id=\"professions\"] h2"));
        WebElement courses = chromeDriver.findElement(By.xpath(".//header/h2[text()='Курсы']"));
        WebElement events = chromeDriver.findElement(By.xpath(".//header/h2[text()='Вебинары']"));
        WebElement blogs = chromeDriver.findElement(By.xpath(".//header/h2[text()='Блоги']"));
        WebElement forum = chromeDriver.findElement(By.xpath(".//header/h2[text()='Форум']"));
        WebElement tests = chromeDriver.findElement(By.xpath(".//header/h2[text()='Тесты']"));
        WebElement projectAndCompany = chromeDriver.findElement(By.xpath("//header/h2[text()='Проекты и компании']"));

        WebElement professionsCount = chromeDriver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='professions']/span"));
        WebElement coursesCount = chromeDriver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='courses']/span"));
        WebElement eventsCount = chromeDriver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='webinars']/span"));
        WebElement blogsCount = chromeDriver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='blogs']/span"));
        WebElement forumsCount = chromeDriver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='forums']/span"));
        WebElement testsCount = chromeDriver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='tests']/span"));

        WebElement gbCompany = chromeDriver.findElement(By.xpath("//div[@class='company-items']//h3/a[contains(text(),'GeekBrains')]"));
        WebElement firstWebinarInList = chromeDriver.findElement(By.xpath("//a[@class='event__title h3 search_text']"));

        wait15second.until(ExpectedConditions.textToBePresentInElement(professions, "Профессии"));
        wait15second.until(ExpectedConditions.textToBePresentInElement(courses, "Курсы"));
        wait15second.until(ExpectedConditions.textToBePresentInElement(events, "Вебинары"));
        wait15second.until(ExpectedConditions.textToBePresentInElement(blogs, "Блоги"));
        wait15second.until(ExpectedConditions.textToBePresentInElement(forum, "Форум"));
        wait15second.until(ExpectedConditions.textToBePresentInElement(tests, "Тесты"));
        wait15second.until(ExpectedConditions.textToBePresentInElement(projectAndCompany, "Проекты и компании"));




        assertThat((Integer.parseInt(professionsCount.getText())), greaterThanOrEqualTo(2));
        assertThat((Integer.parseInt(coursesCount.getText())), greaterThan(15));
        assertThat((Integer.parseInt(eventsCount.getText())), allOf(greaterThan(180), lessThan(300)));
        assertThat((Integer.parseInt(blogsCount.getText())), greaterThan(300));
        assertThat((Integer.parseInt(forumsCount.getText())), allOf(not(350)));
        assertThat((Integer.parseInt(testsCount.getText())), allOf(not(0)));
        assertThat(firstWebinarInList.getText(), equalTo("Java Junior. Что нужно знать для успешного собеседования?"));

        Assertions.assertNotNull(gbCompany, "В Проектах и компаниях не отображается GeekBrains");

    }
}
