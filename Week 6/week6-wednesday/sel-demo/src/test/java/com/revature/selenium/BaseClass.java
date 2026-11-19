package com.revature.selenium;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@ExtendWith(ScreenshotOnFailure.class)
public abstract class BaseClass {
    WebDriver driver;

    @BeforeEach
    void startBrowser(){
        driver=new ChromeDriver();
    }
    @AfterEach
    void stopBrowser(){
        driver.quit();
    }
}

