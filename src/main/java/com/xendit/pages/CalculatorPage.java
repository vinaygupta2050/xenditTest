package com.xendit.pages;

import com.xendit.driver.WebDriverFactory;
import com.xendit.util.CalculatorKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.Connection;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.network.Network;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @author in-vinaykumar.gupta on 14/03/21
 * @project IntelliJ IDEA
 */

public class CalculatorPage {

    public CalculatorPage()
    {
        PageFactory.initElements(WebDriverFactory.getDriver(),this);
    }
    public WebElement canvas;

    public CalculatorPage launchApp()
    {
        WebDriverFactory.getDriver().get("https://www.online-calculator.com/full-screen-calculator/");
        new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
        canvas = new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
        return this;
    }
    public CalculatorPage pressKey(String key){
        int xoffsets = CalculatorKey.getKeysOffsets().get(key).get(0);
        int yoffsets = CalculatorKey.getKeysOffsets().get(key).get(1);
        new Actions(WebDriverFactory.getDriver()).moveToElement(canvas, 0, 0).moveByOffset(xoffsets,yoffsets).click().build().perform();
        return this;
    }
}
