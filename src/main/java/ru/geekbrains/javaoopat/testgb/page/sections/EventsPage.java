package ru.geekbrains.javaoopat.testgb.page.sections;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.javaoopat.testgb.page.ContentPage;

public class EventsPage extends ContentPage {
    public EventsPage(WebDriver chromedriver) {
        super(chromedriver);
    }
    @Override
    public EventsPage openUrl() {
        super.openUrl("https://geekbrains.ru/");
        return this;
    }
}
