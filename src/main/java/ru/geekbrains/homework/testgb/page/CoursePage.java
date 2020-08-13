package ru.geekbrains.homework.testgb.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.homework.testgb.block.ContentNavigationCourseBlock;

import java.util.List;

public class CoursePage extends ContentPage {

    private ContentNavigationCourseBlock contentNavigationCourseBlock;

    @FindBy(xpath = "//form/ul//label")
    private List<WebElement> filterList;

    @FindBy(xpath = "//a/div/div/span")
    private List<WebElement> courseList;

    public CoursePage(WebDriver chromedriver) {
        super(chromedriver);
        this.contentNavigationCourseBlock = new ContentNavigationCourseBlock(chromedriver);
        PageFactory.initElements(chromedriver, this);
    }

    public ru.geekbrains.homework.testgb.page.CoursePage configFilter(String... args) {
        for (String test : args) {
            WebElement element = findElement(filterList, test);
            element.click();
        }
        return this;
    }

    //TODO Step
    public ru.geekbrains.homework.testgb.page.CoursePage checkingDisplayedCourses(String... args) {
        for (String test : args) {
            WebElement element = findElement(courseList, test);
            wait10second.until(ExpectedConditions.visibilityOf(element));
        }
        return this;
    }

    public ContentNavigationCourseBlock getContentNavigationCourseBlock() {
        return contentNavigationCourseBlock;
    }

    @Override
    public ru.geekbrains.homework.testgb.page.CoursePage openUrl() {
        chromedriver.get("https://geekbrains.ru/courses");
        return this;
    }
}
