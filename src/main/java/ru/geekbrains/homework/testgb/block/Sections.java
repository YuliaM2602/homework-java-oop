package ru.geekbrains.homework.testgb.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.homework.testgb.page.*;


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
        PageFactory.initElements(chromedriver, this);
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
                contentPage = new HomePage(chromedriver);
                break;
            case TOPICS:
                buttonTopics.click();
                contentPage = new HomePage(chromedriver);
                break;
            case POSTS:
                buttonPosts.click();
                contentPage = new HomePage(chromedriver);
                break;
            case TESTS:
                buttonTests.click();
                contentPage = new TestPage(chromedriver);
                break;
            case CAREER:
                buttonCareer.click();
                contentPage = new HomePage(chromedriver);
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