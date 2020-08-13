package ru.geekbrains.homework;

import org.junit.jupiter.api.DisplayName;
import ru.geekbrains.homework.base.BaseTest;
import ru.geekbrains.homework.authorization.AuthorizationPage;

@DisplayName("Авторизация")
public class Authorization extends BaseTest {


    @DisplayName("Успешная авторизация")
    public void auth(){

        chromedriver.get("https://geekbrains.ru/");
        String login = "rtf57139@eoopy.com";
        String password = "rtf57139";

        new AuthorizationPage(chromedriver)
                .authorization(login,password)
                .checkNamePage("Главная");
    }
}
