package ru.geekbrains.homework.page;


import org.openqa.selenium.WebDriver;
import ru.geekbrains.homework.block.SearchTab;


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
