package ru.geekbrains.homework.testgb.page;

import org.openqa.selenium.WebDriver;

public class TestPage extends ContentPage {

    public TestPage(WebDriver chromedriver) {
        super(chromedriver);
    }

    @Override
    public ru.geekbrains.homework.testgb.page.TestPage openUrl() {
        chromedriver.get("https://geekbrains.ru/tests");
        return this;
    }
}
