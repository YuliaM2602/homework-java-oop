package ru.geekbrains.homework.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.homework.block.Search;


public class SearchPage extends PageFactory {

    @FindBy(css = "\"[class='show-search-form'] [class='svg-icon icon-search ']\"")
    private WebElement buttonSearch;

    @FindBy(css = "[class=\"search-panel__search-field\"]")
    private WebElement inputSearch;

    public SearchPage(ChromeDriver chromeDriver) {
        initElements(chromeDriver, this);
    }


    public WebElement getButtonSearch() {
        return buttonSearch;
    }

    public WebElement getInputSearch() {
        return inputSearch;
    }
}
