package ru.geekbrains.javaoopat.testgb.page.sections;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.javaoopat.testgb.page.ContentPage;

public class TestPage extends ContentPage {

    public TestPage(WebDriver chromedriver) {
        super(chromedriver);
    }

    @Override
    public TestPage openUrl() {
        super.openUrl("https://geekbrains.ru/tests");
        return this;
    }
}
