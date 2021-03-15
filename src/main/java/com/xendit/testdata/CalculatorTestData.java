package com.xendit.testdata;

import org.testng.annotations.DataProvider;

/**
 * @author in-vinaykumar.gupta on 14/03/21
 * @project IntelliJ IDEA
 */
public class CalculatorTestData {
    @DataProvider(name = "getDataForArithmeticOperationOfPositiveNumber")
    public static Object[][] getDataForArithmeticOperationOfPositiveNumber() {
        return new Object[][]{
                {"1","+","2"},{"4","-","2"},{"4","*","8"},{"4","/","2"}};
    }
}
