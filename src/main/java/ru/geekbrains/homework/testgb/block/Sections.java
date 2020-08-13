package ru.geekbrains.homework.testgb.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Sections extends PageFactory {

    public Sections (WebDriver chromedriver) {

        initElements(chromedriver, this);
    }

    @FindBy(css = "[id=\"nav\"] [href=\"/posts\"]")
    private WebElement buttonPosts;

    @FindBy(css = "[id=\"nav\"] [href=\"/topics\"]")
    private WebElement buttonTopics;

    @FindBy(css = "[id=\"nav\"] [href=\"/events\"]")
    private WebElement buttonEvents;

    @FindBy(css = "[id=\"nav\"] [href=\"/tests\"]")
    private WebElement buttonTests;

    @FindBy(css = "[id=\"nav\"] [href=\"/career\"]")
    private WebElement buttonCareer;

    @FindBy(css = "[id=\"nav\"] [href=\"/courses\"]")
    private WebElement buttonCourses;

    public WebElement getButton(String nameButton) {

        switch (nameButton) {
            case "Курсы": {
                return buttonCourses;
            }
            case "Вебинары": {
                return buttonEvents;
            }
            case "Форум": {
                return buttonTopics;
            }
            case "Блог": {
                return buttonPosts;
            }
            case "Тесты": {
                return buttonTests;
            }
            case "Карьера": {
                return buttonCareer;
            }
        }
        throw new RuntimeException("Кнопки: " + nameButton + " нет на странице!");
    }

}
