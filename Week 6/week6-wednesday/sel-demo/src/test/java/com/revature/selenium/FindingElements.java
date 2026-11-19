package com.revature.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindingElements extends BaseClass{

    static final String TABLE="https://the-internet.herokuapp.com/tables";

    @Test 
    void findElementReturnsOne(){
        driver.get(TABLE);
        WebElement heading = driver.findElement(By.tagName("h3"));
        // TO-DO Assert
        assertEquals("Data Tables", heading.getText());
    }

    @Test 
    void findElementsReturnAll(){
        driver.get(TABLE);
        List<WebElement> rows = driver.findElements(By.cssSelector("#table1 tbody tr"));
        assertEquals(4, rows.size());
    }

    @Test
    void findElementInElement(){
        driver.get(TABLE);
        WebElement firstrow=driver.findElements(By.cssSelector("#table1 tbody tr")).get(0);
        List<WebElement> cells=firstrow.findElements(By.tagName("td"));
        String lastName=cells.get(0).getText();
        String firstName=cells.get(1).getText();
        // to do assert
        assertEquals(lastName, firstName);
    }

    @Test 
    void nothingFound(){
        driver.get(TABLE);
        By missing=By.id("does-not-exist");
        assertThrows(NoSuchElementException.class, ()->driver.findElement(missing));
        
    }
    
}
