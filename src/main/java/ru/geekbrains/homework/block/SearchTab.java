package ru.geekbrains.homework.block;

import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;


public class SearchTab extends PageFactory {
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

    public SearchTab(WebDriver chromedriver) {
        PageFactory.initElements(chromedriver, this);
    }
    public void clickTab(Tab tab) {
        getTab(tab).click();
    }

    public SearchTab checkCount(Tab tab, Matcher<Integer> matcher) {
        String actualCount = getTab(tab).findElement(By.cssSelector("span")).getText();
        assertThat(Integer.parseInt(actualCount), matcher);
        return this;
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