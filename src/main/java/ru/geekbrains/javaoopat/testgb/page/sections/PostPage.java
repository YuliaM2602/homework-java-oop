package ru.geekbrains.javaoopat.testgb.page.sections;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.javaoopat.testgb.page.ContentPage;

public class PostPage extends ContentPage {
    public PostPage(WebDriver chromedriver) {
        super(chromedriver);
    }

    @Override
    public PostPage openUrl() {
        super.openUrl("https://geekbrains.ru/");
        return this;
    }
}
