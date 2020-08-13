package ru.geekbrains.homework.page;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.homework.block.HeaderBlock;
import ru.geekbrains.homework.block.Sections;

public abstract class ContentPage extends BasePageObject implements OpenUrl {
    protected Sections sections;
    protected HeaderBlock headerBlock;


    @FindBy(css = "div button svg[class='svg-icon icon-popup-close-button ']")
    private WebElement buttonPopUpClosed;

    public ContentPage(WebDriver chromedriver) {
        super(chromedriver);
        this.headerBlock = new HeaderBlock(chromedriver);
        this.sections = new Sections(chromedriver);
        PageFactory.initElements(chromedriver, this);
    }

    public ContentPage closedPopUp() {
        wait10second.until(ExpectedConditions.visibilityOf(buttonPopUpClosed));
        if (buttonPopUpClosed.isDisplayed()) {
            this.buttonPopUpClosed.click();
        }
        return this;
    }

    public Sections getSections() {
        return sections;
    }

    public HeaderBlock getHeader() {
        return headerBlock;
    }


    public ContentPage checkNamePage(String exampleNamePage) {
        headerBlock.checkNamePage(exampleNamePage);
        return this;
    }
}
