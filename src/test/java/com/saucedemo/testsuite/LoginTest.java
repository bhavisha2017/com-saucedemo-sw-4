package com.saucedemo.testsuite;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage = new HomePage();
    ProductsPage products = new ProductsPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.enterUserName("standard_user");
        homePage.enterpassword("secret_sauce");
        homePage.clickOnLoginButton();
        String actualMessage = products.verifyText();
        String expectedMessage = "Products";
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        homePage.enterUserName("standard_user");
        homePage.enterpassword("secret_sauce");
        homePage.clickOnLoginButton();
        int actualNumber = products.verifyProductList();
        int expectedNumber = 6;
        Assert.assertEquals(actualNumber,expectedNumber);
    }
}
