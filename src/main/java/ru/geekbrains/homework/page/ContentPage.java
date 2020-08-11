package ru.geekbrains.homework.page;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.homework.block.Sections;

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

    public Sections getSections() {
        return sections;
    }

    public void checkNameSection (String expectedNameSection){
        Assertions.assertEquals(expectedNameSection, nameSection.getText());
    }

    public WebElement getHeader() {
        return header;
    }

    public WebElement getFooter() {
        return footer;
    }


    public WebElement getButtonClosePopUp1() {
        return buttonClosePopUp1;
    }

    public WebElement getButtonClosePopUp2() {
        return buttonClosePopUp2;
    }


}
