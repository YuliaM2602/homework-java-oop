package ru.geekbrains.homework.authorization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.homework.page.BasePageObject;
import ru.geekbrains.homework.page.ContentPage;
import ru.geekbrains.homework.page.HomePage;
import ru.geekbrains.homework.page.OpenUrl;

public class AuthorizationPage extends BasePageObject implements OpenUrl {
    @FindBy(
            css = "[placeholder=\"Email\"]")
    private WebElement inputLogin;

    @FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;

    @FindBy(css = "[id=\"registration-form-button\"]")

    private WebElement buttonSingIn;


    public AuthorizationPage(WebDriver chromeDriver) {
        super(chromeDriver);
        PageFactory.initElements(chromeDriver, this);
    }

    public HomePage authorization(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSingIn.click();
        return new HomePage(chromedriver);
    }

    @Override
    public AuthorizationPage openUrl() {
        chromedriver.get("https://geekbrains.ru/login");
        return this;
    }
}
