package ru.geekbrains.homework;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.homework.base.BaseTest;
import ru.geekbrains.homework.testgb.page.AuthorizationPage;

@Epic(value = "Проверка авторизации")
@Feature("Авторизация")
@Story("Пользователь преподаватель")
@DisplayName("Авторизация")
public class AuthorizationTest extends BaseTest {


    @DisplayName("Успешная авторизация1")
    @Description("Проверяем, что доступен блок Преподаватель")
    @Test
    @Issue("Bug-100500")
    @TmsLink("Test-100")
    public void auth(){

        chromeDriver.get("https://geekbrains.ru/");
        String login = "hks47018@eoopy.com";
        String password = "hks47018";

        new AuthorizationPage(chromeDriver)
                .authorization(login,password)
                .checkNameSection("Главная");
    }
}
