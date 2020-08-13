package ru.geekbrains.homework.testgb.page;


import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.homework.testgb.block.SearchTab;

public class SearchPage extends ContentPage {

    private SearchTab searchTab;

    public SearchPage(WebDriver chromedriver) {
        super(chromedriver);
        this.searchTab = new SearchTab(chromedriver);
    }

    @Override
    public SearchPage openUrl() {
        chromedriver.get("https://geekbrains.ru/search");
        return this;
    }

    public SearchTab getSearchTab() {
        return searchTab;
    }
}

