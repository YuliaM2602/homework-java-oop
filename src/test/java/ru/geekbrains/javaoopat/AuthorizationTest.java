package ru.geekbrains.javaoopat;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.javaoopat.base.BaseTest;
import ru.geekbrains.javaoopat.testgb.page.AuthorizationPage;

@Epic(value = "Авторизация")
@Feature("Проверка авторизации")
@DisplayName("Проверка авторизации")
@Execution(ExecutionMode.CONCURRENT)
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
