package ru.geekbrains.homework.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.homework.page.BasePageObject;
import ru.geekbrains.homework.page.SearchPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToCompressingWhiteSpace;

public class HeaderBlock extends BasePageObject {
    @FindBy(css = "[class='gb-header__title']")
    protected WebElement headerTitlePage;

    @FindBy(css = "[id='top-menu'] [class='show-search-form'] svg")
    protected WebElement buttonSearch;

    @FindBy(css = "input[class='search-panel__search-field']")
    protected WebElement inputSearch;





    @FindBy(css = "[href='/login']")
    private WebElement singIn;

    @FindBy(css = "href='/register'")
    private WebElement registration;





    @FindBy(css = "header [class='schedule-opener js-schedule-opener']")
    private WebElement buttonCalendar;

    @FindBy(css = "[class='js-notices-link']")
    private WebElement buttonNotify;

    @FindBy(css = "header [href='/thanks']")
    private WebElement buttonLike;

    @FindBy(css = "[id='menu-messages']")
    private WebElement buttonMessages;

    @FindBy(css = "[class='gb-top-menu__item dropdown']")
    private WebElement buttonAvatar;



    public HeaderBlock(WebDriver chromedriver) {
        super(chromedriver);
        PageFactory.initElements(chromedriver, this);
    }

    public HeaderBlock checkNamePage(String exampleNamePage) {
        wait10second.until(ExpectedConditions.textToBePresentInElement(headerTitlePage, exampleNamePage));

        String headerPageText = headerTitlePage.getText();
        assertThat(headerPageText, equalToCompressingWhiteSpace(exampleNamePage));
        return this;
    }

    public SearchPage searchText(String exampleNamePage) {
        buttonSearch.click();
        inputSearch.sendKeys(exampleNamePage);
        return new SearchPage(chromedriver);
    }
}
