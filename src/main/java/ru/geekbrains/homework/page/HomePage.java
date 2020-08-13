package ru.geekbrains.homework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.homework.page.ContentPage;

public class HomePage extends ContentPage{

    public HomePage(WebDriver chromedriver) {
        super(chromedriver);
        PageFactory.initElements(chromedriver, this);
    }

    @Override
    public HomePage openUrl() {
        chromedriver.get("https://geekbrains.ru/");
        return this;
    }
}
