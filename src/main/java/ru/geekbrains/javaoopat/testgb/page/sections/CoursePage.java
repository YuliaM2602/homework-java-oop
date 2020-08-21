package ru.geekbrains.javaoopat.testgb.page.sections;

import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.javaoopat.testgb.block.ContentNavigationCourseBlock;
import ru.geekbrains.javaoopat.testgb.page.ContentPage;

import java.util.List;

public class CoursePage extends ContentPage {

    @Getter

    private ContentNavigationCourseBlock contentNavigationCourseBlock;

    @FindBy(xpath = "//form/ul//label")
    private List<WebElement> filterList;

    @FindBy(xpath = "//a/div/div/span")
    private List<WebElement> courseList;

    public CoursePage(WebDriver chromedriver) {
        super(chromedriver);
        this.contentNavigationCourseBlock = new ContentNavigationCourseBlock(chromedriver);
    }

    @Step("Настройка фильтра курсов: {args}")
    public CoursePage configFilter(String... args) {
        for (String text : args) {
            WebElement element = findElement(filterList, text);
            element.click();
        }
        return this;
    }

    @Step("Проверка отображения курсов: {args}")
    public CoursePage checkingDisplayedCourses(String... args) {
        for (String text : args) {
            WebElement element = findElement(courseList, text);
            wait10second.until(ExpectedConditions.visibilityOf(element));
        }
        return this;
    }

    @Override
    public CoursePage openUrl() {
        super.openUrl("https://geekbrains.ru/courses");
        return this;
    }
}
