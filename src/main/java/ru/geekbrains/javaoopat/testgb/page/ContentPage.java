package ru.geekbrains.javaoopat.testgb.page;


import io.qameta.allure.Step;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.javaoopat.testgb.block.HeaderBlock;
import ru.geekbrains.javaoopat.testgb.block.Sections;

public abstract class ContentPage extends BasePageObject implements OpenUrl {

    @Getter
    protected Sections sections;
    @Getter
    protected HeaderBlock headerBlock;


    @FindBy(css = "div button svg[class='svg-icon icon-popup-close-button ']")
    private WebElement buttonPopUpClosed;

    public ContentPage(WebDriver chromedriver) {
        super(chromedriver);
        this.headerBlock = new HeaderBlock(chromedriver);
        this.sections = new Sections(chromedriver);
    }

    public ContentPage closedPopUp() {
        wait10second.until(ExpectedConditions.visibilityOf(buttonPopUpClosed));
        if (buttonPopUpClosed.isDisplayed()) {
            this.buttonPopUpClosed.click();
        }
        return this;
    }



    public ContentPage checkNamePage(String exampleNamePage) {
        headerBlock.checkNamePage(exampleNamePage);
        return this;
    }

    @Step("Переход на страницу {url}")
    public BasePageObject openUrl(String url) {
       chromedriver.get(url);
       return this;
    }
}