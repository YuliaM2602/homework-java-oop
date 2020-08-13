package ru.geekbrains.homework.testgb.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {
    @FindBy(
            css = "[placeholder=\"Email\"]")
    private WebElement inputLogin;

    @FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;

    @FindBy(css = "[id=\"registration-form-button\"]")
    private WebElement buttonSingIn;

    private WebDriver chromeDriver;

    public AuthorizationPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
        PageFactory.initElements(chromeDriver, this);
    }

    @Step("Авторизация пользователем с логином: {login} паролем: {password} ")
    public ContentPage authorization(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);

        buttonSingIn.click();

        return new ContentPage(chromeDriver);
    }

}
