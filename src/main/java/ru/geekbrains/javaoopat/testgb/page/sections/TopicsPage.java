package ru.geekbrains.javaoopat.testgb.page.sections;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.javaoopat.testgb.page.ContentPage;

public class TopicsPage extends ContentPage {
    public TopicsPage(WebDriver chromedriver) {
        super(chromedriver);
    }
    @Override
    public TopicsPage openUrl() {
        super.openUrl("https://geekbrains.ru/");
        return this;
    }
}
