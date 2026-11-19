package com.revature.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class PageObjectTest extends BaseClass{

    @Test
    void standardUserSeesProducts() {
        InventoryPage inventory = new LoginPage(driver).open().loginAs("standard_user", "secret_sauce");
        assertEquals("Products", inventory.title());
    }

    @Test
    void addingTheBackpackShowsOneInTheCart() {
        InventoryPage inventory = new LoginPage(driver).open().loginAs("standard_user", "secret_sauce");
        assertEquals("Products", inventory.title());

        inventory.addToCart("add-to-cart-sauce-labs-backpack");
        assertEquals(1, inventory.cartCount());
    }

    @Test
    void lockedOutUserSeesAnError() {
        LoginPage login = new LoginPage(driver).open().loginExpectingError("locked_out_user", "secret_sauce");
        assertEquals("Epic sadface: Sorry, this user has been locked out.", login.errorMessage());
    }

    @Test
    void pageFactoryLoginWorksTheSame() {
        InventoryPage inventory = new LoginPageFactory(driver).open().loginAs("standard_user", "secret_sauce");
        assertEquals("Products", inventory.title());
    }
}
