package com.ui.pages;

import com.utilities.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BrowserUtility {
    static final By ACCOUNT_NAV_BUTTON = By.cssSelector("li#menu-item-1237 > a");

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
