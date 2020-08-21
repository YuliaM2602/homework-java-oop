package ru.geekbrains.javaoopat.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

    public abstract class BaseTest {
        public WebDriver chromedriver;


        @BeforeEach
        public void baseTestBeforeAll() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-popup-blocked");
            options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
            chromedriver = new ChromeDriver(options);
            chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            chromedriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            chromedriver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

            chromedriver.manage().window().maximize();
        }

        @AfterEach
        public void BaseTestAfterAll() {
            chromedriver.quit();
        }
    }

