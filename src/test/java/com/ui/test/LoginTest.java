package com.ui.test;

import com.utilities.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        BrowserUtility browserUtility = new BrowserUtility(driver);
        browserUtility.goToWebsite("https://askomdch.com/");
        browserUtility.maximizeWindow();

        browserUtility.clickOnElement(By.cssSelector("li#menu-item-1237 > a"));
        browserUtility.inputText(By.id("username"),"nmkbnyvazzeyothmol@nesopf.com");
        browserUtility.inputText(By.id(" password"),"testing123");
        browserUtility.clickOnElement(By.name("login"));
        driver.quit();
    }
}
