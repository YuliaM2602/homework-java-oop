package ru.geekbrains.homework;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.homework.base.BaseTest;
import ru.geekbrains.homework.testgb.page.AuthorizationPage;

@Epic(value = "Авторизация")
@Feature("Проверка авторизации")
@DisplayName("Проверка авторизации")
public class AuthorizationTest extends BaseTest {


    @DisplayName("Авторизация с корректными данными")
    @Test
    @Issue("Bug-100500")
    @TmsLink("TestCase-100")
    public void auth(){

        chromedriver.get("https://geekbrains.ru/");
        String login = "hks47018@eoopy.com";
        String password = "hks47018";

        new AuthorizationPage(chromedriver)
                .authorization(login,password)
                .checkNamePage("Главная");
    }
}
