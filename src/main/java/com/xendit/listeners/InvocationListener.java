package com.xendit.listeners;

import com.xendit.driver.WebDriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.*;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;

/**
 * @author in-vinaykumar.gupta on 14/03/21
 * @project IntelliJ IDEA
 */
public class InvocationListener implements ITestListener{

    @Override
    public void onStart(ITestContext context) {
        try {
            WebDriverFactory.setDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        WebDriverFactory.getDriver().quit();
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        File screenSot= ((TakesScreenshot)WebDriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
        Date date = new Date();
        ITestNGMethod method = result.getMethod();
        try {
            FileUtils.copyFile(screenSot, new File(System.getProperty("user.dir") + "/screenshots/"+result.getInstanceName()+"."+method.getMethodName()+"."+date.getTime()+".png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
