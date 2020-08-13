package ru.geekbrains.homework.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.homework.page.BasePageObject;
import ru.geekbrains.homework.page.CoursePage;

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
        PageFactory.initElements(chromedriver, this);
    }

    //TODO Step
    public CoursePage clickTab(Tab tab) {
        switch (tab) {
            case PROFESSIONS: {
                tabProfessions.click();
                //TODO нужно реализовать для данного блока
            }
            case FREE_INTENSIVE: {
                tabFreeIntensive.click();
                //TODO нужно реализовать для данного блока
            }
            case COURSES: {
                tabCourses.click();

            }
            case COMPANIES: {
                tabCompanies.click();
                //TODO нужно реализовать для данного блока
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
