package ru.geekbrains.javaoopat.testgb.page;


import lombok.Getter;
import org.openqa.selenium.WebDriver;
import ru.geekbrains.javaoopat.testgb.block.SearchTab;

public class SearchPage extends ContentPage {

    @Getter

    private SearchTab searchTab;

    public SearchPage(WebDriver chromedriver) {
        super(chromedriver);
        this.searchTab = new SearchTab(chromedriver);
    }

    @Override
    public SearchPage openUrl() {
        super.openUrl("https://geekbrains.ru/search");
        return this;
    }

}

