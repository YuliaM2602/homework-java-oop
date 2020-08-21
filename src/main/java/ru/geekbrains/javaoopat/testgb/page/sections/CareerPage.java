package ru.geekbrains.javaoopat.testgb.page.sections;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.javaoopat.testgb.page.ContentPage;

public class CareerPage extends ContentPage {
    public CareerPage(WebDriver chromedriver) {
        super(chromedriver);
    }

    @Override
    public CareerPage openUrl() {
        super.openUrl("https://geekbrains.ru/");
        return this;
    }
}
