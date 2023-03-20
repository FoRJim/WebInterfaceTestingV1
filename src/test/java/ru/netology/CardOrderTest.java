package ru.netology;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CardOrderTest {
    private WebDriver driver;


    @BeforeAll
    static void setUpAll(){
        System.setProperty("webdriver.chrome.driver", "./Driver/Win/chromedriver.exe");
    }
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown(){
        driver.quit();
        driver = null;
    }

    @Test
     void shouldTestSomething(){
        driver.get("http://localhost:9999");
    }


}
