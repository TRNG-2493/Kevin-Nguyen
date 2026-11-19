package com.revature.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginInteractionTest extends BaseClass{
    static final String LOGIN = "https://the-internet.herokuapp.com/login";

    @BeforeEach
    void openPage(){
        driver.get(LOGIN);
    }

    @Test
    void testValidLogin(){
        WebElement userName=  driver.findElement(By.id("username"));
        userName.sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        //driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);

        assertEquals("https://the-internet.herokuapp.com/secure", driver.getCurrentUrl());
        String message=driver.findElement(By.id("flash")).getText();
        assertTrue(message.contains("You logged into a secure area!"));
    }

    @Test
    void testInvalidLogin(){
        WebElement userName=  driver.findElement(By.id("username"));
        userName.sendKeys("wrongUsername");
        driver.findElement(By.id("password")).sendKeys("WrongPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        assertEquals("https://the-internet.herokuapp.com/login", driver.getCurrentUrl());
        String message=driver.findElement(By.id("flash")).getText();
        assertTrue(message.contains("Your username is invalid!"));
    }

    
}
