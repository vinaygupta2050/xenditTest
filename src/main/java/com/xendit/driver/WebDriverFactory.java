package com.xendit.driver;

import com.xendit.util.CalculatorKey;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * @author in-vinaykumar.gupta on 14/03/21
 * @project IntelliJ IDEA
 */
public class WebDriverFactory {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver() throws MalformedURLException {
        CalculatorKey.setKeysOffsets();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
