package com.revature.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NavigationTest extends BaseClass {

    String HOME="https://herokuapp.com";
    String LOGIN = "https://the-internet.herokuapp.com/";

    @Test
    void getOpenPages(){
        driver.get(HOME);
        assertEquals(HOME, driver.getCurrentUrl());
        assertEquals("The Internet", driver.getTitle());

    }

    @Test
    void backAndForward(){
        driver.get(HOME);
        driver.navigate().to(LOGIN);
        //TO - DO ASSERT HERE

        driver.navigate().back();
        //TO - DO ASSERT HERE

        driver.navigate().forward();
        //TO - DO ASSERT HERE

        driver.navigate().refresh();
        //TO - DO ASSERT HERE
        

    }
}

