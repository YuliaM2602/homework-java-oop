package ru.geekbrains.javaoopat.testgb.page.sections;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.javaoopat.testgb.page.ContentPage;

public class HomePage extends ContentPage {

    public HomePage(WebDriver chromedriver) {
        super(chromedriver);
    }

    @Override
    public HomePage openUrl() {
        super.openUrl("https://geekbrains.ru/");
        return this;
    }
}
