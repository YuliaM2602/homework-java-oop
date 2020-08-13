package ru.geekbrains.homework.testgb.page;


import io.qameta.allure.Step;

import lombok.Getter;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.homework.testgb.block.Sections;

@Getter
public class ContentPage extends PageFactory {

    @FindBy (css = "[class*='gb-header__content']")
    private WebElement header;

    @FindBy (css = "[class='site-footer__content']")
    private WebElement footer;

    @FindBy (css = "[id=\"top-menu\"] h2")
    private WebElement nameSection;

    @FindBy (css = "[class=\"gb-empopup-close\"]")
    private WebElement buttonClosePopUp1;

    @FindBy (css = "button [class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonClosePopUp2;

    private Sections sections;

    public ContentPage(WebDriver chromedriver){
        initElements(chromedriver, this);
        sections = new Sections(chromedriver);
    }

    @Step("Проверка названия страницы: {expectedNameSection}")
    public void checkNameSection (String expectedNameSection){
        Assertions.assertEquals(expectedNameSection, nameSection.getText());
    }



}
