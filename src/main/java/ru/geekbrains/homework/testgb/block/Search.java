package ru.geekbrains.homework.testgb.block;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.tools.jconsole.Tab;


public class Search extends PageFactory {

    @FindBy(css = "[id=\"professions\"] h2")
    private WebElement tabProfessions;
    @FindBy(css = ".//header/h2[text()='Курсы']")
    private WebElement tabCourses;
    @FindBy(css = ".//header/h2[text()='Вебинары']")
    private WebElement tabEvents;
    @FindBy(css = ".//header/h2[text()='Блоги']")
    private WebElement tabBlogs;
    @FindBy(css = ".//header/h2[text()='Форум']")
    private WebElement tabForum;
    @FindBy(css = ".//header/h2[text()='Тесты']")
    private WebElement tabTests;
    @FindBy(css = "//header/h2[text()='Проекты и компании']")
    private WebElement tabProjectAndCompany;

    public Search(WebDriver chromedriver) {
        PageFactory.initElements(chromedriver, this);
    }

    private WebElement getTab(Tab tab) {
        switch (tab) {
            case PROFESSIONS:
                return tabProfessions;
            case COURSES:
                return tabCourses;
            case EVENTS:
                return tabEvents;
            case BLOGS:
                return tabBlogs;
            case FORUMS:
                return tabForum;
            case TESTS:
                return tabTests;
            case PROJECTANDCOMPANIES:
                return tabProjectAndCompany;
            default:
                throw new IllegalStateException("Неверное значение: " + tab);
        }
    }
    public enum Tab {
        PROFESSIONS("Профессии"),
        COURSES("Курсы"),
        EVENTS("Вебинары"),
        BLOGS("Блоги"),
        FORUMS("Форумы"),
        TESTS("Тесты"),
        PROJECTANDCOMPANIES("Компании");

        private String text;

        Tab(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}


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
