package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends Utility {
    By productsText = By.className("title");
    By productList = By.xpath("//div[@class='inventory_item']");

    public String verifyText(){
        return getTextFromElement(productsText);
    }

    public int verifyProductList(){
        List<WebElement> number = driver.findElements(productList);
        return number.size();
    }
}
