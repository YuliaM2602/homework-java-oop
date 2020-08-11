package ru.geekbrains.homework.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Search extends PageFactory {


    public Search(WebDriver chromedriver) {
        initElements(chromedriver, this);
    }
}
