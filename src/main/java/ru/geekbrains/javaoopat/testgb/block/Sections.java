package ru.geekbrains.javaoopat.testgb.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.javaoopat.testgb.page.*;
import ru.geekbrains.javaoopat.testgb.page.sections.*;


public class Sections extends BasePageObject {

    @FindBy(css = "[class='svg-icon icon-logo']")
    private WebElement icon;

    @FindBy(css = "[id='nav'] [href='/courses']")
    private WebElement buttonCourses;

    @FindBy(css = "[id='nav'] [href='/events']")
    private WebElement buttonEvents;

    @FindBy(css = "[id='nav'] [href='/topics']")
    private WebElement buttonTopics;

    @FindBy(css = "[id='nav'] [href='/posts']")
    private WebElement buttonPosts;

    @FindBy(css = "[id='nav'] [href='/tests']")
    private WebElement buttonTests;

    @FindBy(css = "[id='nav'] [href='/career']")
    private WebElement buttonCareer;


    public Sections (WebDriver chromedriver){
        super(chromedriver);
    }

    @Step("Нажатие на кнопку: {nameButton}")
    public ContentPage clickButton(Button button) {
        ContentPage contentPage = null;

        switch (button) {
            case ICON:
                icon.click();
                contentPage = new HomePage(chromedriver);
                break;
            case COURSES:
                buttonCourses.click();
                contentPage = new CoursePage(chromedriver);
                break;
            case EVENTS:
                buttonEvents.click();

                break;
            case TOPICS:
                buttonTopics.click();

                break;
            case POSTS:
                buttonPosts.click();
                contentPage = new PostPage(chromedriver);
                break;
            case TESTS:
                buttonTests.click();
                contentPage = new TestPage(chromedriver);
                break;
            case CAREER:
                buttonCareer.click();
                contentPage = new CareerPage(chromedriver);
                break;
        }
        if (contentPage == null) {
            contentPage = new HomePage(chromedriver);
        }
        return contentPage;
    }


    public enum Button {
        ICON("Главная"),
        COURSES("Курсы"),
        EVENTS("Вебинары"),
        TOPICS("Форум"),
        POSTS("Блог"),
        TESTS("Тесты"),
        CAREER("Карьера");

        private String text;

        Button(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

}