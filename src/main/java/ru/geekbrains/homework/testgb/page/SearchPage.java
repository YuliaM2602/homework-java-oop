package ru.geekbrains.homework.testgb.page;


import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class SearchPage extends PageFactory {

    @FindBy(css = "\"[class='show-search-form'] [class='svg-icon icon-search ']\"")
    private WebElement buttonSearch;

    @FindBy(css = "[class=\"search-panel__search-field\"]")
    private WebElement inputSearch;

    public SearchPage(ChromeDriver chromeDriver) {
        initElements(chromeDriver, this);
    }


}
