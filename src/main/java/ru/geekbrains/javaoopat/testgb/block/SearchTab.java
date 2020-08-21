package ru.geekbrains.javaoopat.testgb.block;

import io.qameta.allure.Step;
import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.javaoopat.testgb.page.BasePageObject;
import ru.geekbrains.javaoopat.testgb.utils.ButtonNotFoundException;


import static org.hamcrest.MatcherAssert.assertThat;


public class SearchTab extends BasePageObject {

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

    public SearchTab (WebDriver chromedriver){
        super(chromedriver);
    }

    @Step("Нажатие на tab {tab}")
        public void clickTab (Tab tab){
        getTab(tab).click();
    }

        @Step("Проверка {tab} на условие {matcher}")
        public SearchTab checkCount (Tab tab, Matcher< Integer > matcher){
        String actualCount = getTab(tab).findElement(By.cssSelector("span")).getText();
        assertThat(Integer.parseInt(actualCount), matcher);
        return this;
    }
        private WebElement getTab (Tab tab){
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
                throw new ButtonNotFoundException("Неверное значение: " + tab);
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