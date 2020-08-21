package ru.geekbrains.javaoopat.testgb.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.javaoopat.testgb.page.BasePageObject;
import ru.geekbrains.javaoopat.testgb.page.sections.CoursePage;

public class ContentNavigationCourseBlock extends BasePageObject {

    @FindBy(css = "[class*='nav nav-tabs'] [id='prof-link']")
    private WebElement tabProfessions;

    @FindBy(css = "[class*='nav nav-tabs'] [id='free-link']")
    private WebElement tabFreeIntensive;

    @FindBy(css = "[class*='nav nav-tabs'] [id='cour-link']")
    private WebElement tabCourses;

    @FindBy(css = "[class*='nav nav-tabs'] [href*='https://forbusiness']")
    private WebElement tabCompanies;

    public ContentNavigationCourseBlock(WebDriver chromedriver) {
        super(chromedriver);
    }

@Step("Нажатие на tab: {tab}")
    public CoursePage clickTab(Tab tab) {
        switch (tab) {
            case PROFESSIONS: {
                tabProfessions.click();
            }
            case FREE_INTENSIVE: {
                tabFreeIntensive.click();
            }
            case COURSES: {
                tabCourses.click();
            }
            case COMPANIES: {
                tabCompanies.click();
            }
        }
        return new CoursePage(chromedriver);
    }


    public enum Tab {
        PROFESSIONS,
        FREE_INTENSIVE,
        COURSES,
        COMPANIES;
    }
}
