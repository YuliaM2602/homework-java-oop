package ru.geekbrains.homework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    }

    protected WebElement findElement(List<WebElement> list, String expectedText) {
        List<Object> arrayList = new ArrayList<>();
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
