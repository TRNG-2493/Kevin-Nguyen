package com.revature.selenium;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsTest extends BaseClass{

    @Test
    void hoverShowsTheCaption() {
        driver.get("https://the-internet.herokuapp.com/hovers");
        WebElement firstPicture = driver.findElements(By.cssSelector(".figure")).get(0);
        WebElement caption = firstPicture.findElement(By.cssSelector(".figcaption"));
        assertFalse(caption.isDisplayed());
        
        new Actions(driver).moveToElement(firstPicture).perform();

        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(caption));
        assertEquals("name: user1", caption.findElement(By.tagName("h5")).getText());
    }

    @Test
    void testTabInTheTextBox(){
        driver.get("https://the-internet.herokuapp.com/key_presses");
        WebElement box = driver.findElement(By.id("target"));
        new Actions(driver).click(box).sendKeys(Keys.TAB).perform();
        assertEquals("You entered: TAB", driver.findElement(By.id("result")).getText());
    }

    @Test
    void dragAOntoB() {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement boxA = driver.findElement(By.id("column-a"));
        WebElement boxB = driver.findElement(By.id("column-b"));
        assertEquals("A", boxA.getText());

        new Actions(driver).dragAndDrop(boxA, boxB).perform();

        assertEquals("B", driver.findElement(By.id("column-a")).getText());
    }
    
}
