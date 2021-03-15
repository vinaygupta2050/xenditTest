package com.xendit.calculator;

import com.xendit.pages.CalculatorPage;
import com.xendit.testdata.CalculatorTestData;
import org.jetbrains.annotations.TestOnly;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author in-vinaykumar.gupta on 14/03/21
 * @project IntelliJ IDEA
 */
@Listeners(com.xendit.listeners.InvocationListener.class)
public class CalculatorTest {

    @Test(testName = "verifyArithmaticOperationsOnPositiveNumbers",description = "Verify whether the application is able to perform arithmatic operation on 2 positive numbers",dataProvider ="getDataForArithmeticOperationOfPositiveNumber",dataProviderClass = CalculatorTestData.class)
    public void verifyArithmaticOperationsOnBothPositiveNumbers(String firstNumber,String operator,String secondNumber)
    {
        CalculatorPage calculator = new CalculatorPage();
        calculator.launchApp().pressKey(firstNumber).pressKey(operator).pressKey(secondNumber).pressKey("=");
    }
    @Test(testName = "verifyArithmaticOperationsOnNegativeNumbers",description = "Verify whether the application is able to perform arithmatic operation on 1 negative and 1 positive numbers",dataProvider ="getDataForArithmeticOperationOfPositiveNumber",dataProviderClass = CalculatorTestData.class)
    public void verifyArithmaticOperationsOnNegativeAndPositiveNumber(String firstNumber,String secondNumber,String operator)
    {
        CalculatorPage calculator = new CalculatorPage();
        calculator.launchApp().pressKey("-").pressKey(firstNumber).pressKey(secondNumber).pressKey(operator).pressKey("=");
    }
    @Test(testName = "verifyArithmaticOperationsOnNegativeNumbers",description = "Verify whether the application is able to perform arithmatic operation on 2 negative numbers",dataProvider ="getDataForArithmeticOperationOfPositiveNumber",dataProviderClass = CalculatorTestData.class)
    public void verifyArithmaticOperationsOnBothNegativeNumber(String firstNumber,String secondNumber,String operator)
    {
        CalculatorPage calculator = new CalculatorPage();
        calculator.launchApp().pressKey("-").pressKey(firstNumber).pressKey(operator).pressKey("-").pressKey(secondNumber).pressKey("=");
    }
    @Test(testName = "verifyDivideByZeroOperation",description = "Verify whether the application is able to calculate when 0 is divided with any number")
    public void verifyDivideByZeroOperation()
    {
        CalculatorPage calculator = new CalculatorPage();
        calculator.launchApp().pressKey("0").pressKey("/").pressKey("2").pressKey("=");
    }
    @Test(testName = "verifyNumericValuesAreWorking",description = "Verify whether the user is able to press all the numeric values")
    public void verifyNumericValuesAreWorking()
    {
        CalculatorPage calculator = new CalculatorPage();
        calculator.launchApp().pressKey("0").pressKey("1").pressKey("2").pressKey("3").pressKey("4").pressKey("5").pressKey("6").pressKey("7").pressKey("8").pressKey("9");
    }

    @Test(testName = "verifyArithmaticOperatorAreWorking",description = "Verify whether the application is able to press all the arithmatic operator")
    public void verifyArithmaticOperatorAreWorking()
    {
        CalculatorPage calculator = new CalculatorPage();
        calculator.launchApp().pressKey("+").pressKey("-").pressKey("*").pressKey("/");
    }

    @Test(testName = "verifyMaxNumberUserCanType",description = "Verify whether the application is able to press all the arithmatic operator")
    public void verifyMaxNumberUserCanType()
    {
        CalculatorPage calculator = new CalculatorPage();
        calculator.launchApp().pressKey("0").pressKey("1").pressKey("2").pressKey("3").pressKey("4").pressKey("5").pressKey("6").pressKey("7").pressKey("8").pressKey("9").pressKey("1");
    }
    @Test(testName = "verifyUserIsAbleToClearTheEnteredNumber",description = "Verify whether the user is able to clear the entered number")
    public void verifyUserIsAbleToClearTheEnteredNumber()
    {
        CalculatorPage calculator = new CalculatorPage();
        calculator.launchApp().pressKey("1").pressKey("C");
    }
    @Test(testName = "verifyUserIableToPerformArithmeticOperationOnDecimalNumbers",description = "Verify whether the user is able to perform arithmetic operation on decimal numbers")
    public void verifyUserIableToPerformArithmeticOperationOnDecimalNumbers()
    {
        CalculatorPage calculator = new CalculatorPage();
        calculator.launchApp().pressKey("1").pressKey(".").pressKey("2").pressKey("+").pressKey("1").pressKey(".").pressKey("2").pressKey("=");
    }

}
