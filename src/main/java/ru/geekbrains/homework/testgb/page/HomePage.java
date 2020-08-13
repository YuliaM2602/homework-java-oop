package ru.geekbrains.homework.testgb.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
