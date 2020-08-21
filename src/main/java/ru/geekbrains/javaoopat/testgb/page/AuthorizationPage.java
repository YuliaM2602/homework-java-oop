package ru.geekbrains.javaoopat.testgb.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.javaoopat.testgb.page.sections.HomePage;

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
    }

    @Step("Авторизация пользователя c логином: {login} паролем: {password}")
    public HomePage authorization(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSingIn.click();
        return new HomePage(chromedriver);
    }

    @Override
    public AuthorizationPage openUrl() {
        openUrl("https://geekbrains.ru/login");
        return this;
    }

    @Step("Переход на страницу {url}")
    private void openUrl(String url) {
        chromedriver.get(url);
    }
}
