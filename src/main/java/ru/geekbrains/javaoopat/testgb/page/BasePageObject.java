package ru.geekbrains.javaoopat.testgb.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BasePageObject {
    protected WebDriver chromedriver;
    protected WebDriverWait wait10second;
    protected WebDriverWait wait30second;

    public BasePageObject(WebDriver chromedriver) {
        this.chromedriver = chromedriver;
        this.wait10second = new WebDriverWait(chromedriver, 10);
        this.wait30second = new WebDriverWait(chromedriver, 30);
        PageFactory.initElements(chromedriver, this);
    }

    @Step("Поиск в коллекции WebElement элемент с текстом: {expectedText}")
    protected WebElement findElement(List<WebElement> list, String expectedText) {
        List<String> arrayList = new ArrayList<>();

        for (WebElement webElement : list) {
            String actualText = webElement.getText();
            arrayList.add(actualText);
            if (actualText.toLowerCase().trim().equals(expectedText.toLowerCase().trim())) {
                return webElement;
            }
        }
        throw new RuntimeException("В коллекции элементов: " + arrayList + "\nНе найден элемент с текстом: " + expectedText);
    }

}
