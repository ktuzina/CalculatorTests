package com.training.task.module4.simpleoperations;

import com.epam.tat.module4.Calculator;
import com.training.task.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DivDoubleTest extends BaseCalculatorTest {

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void divOneValueByAnotherNumbers() {
        double result = calculator.div(6.0, 2.0);
        Assert.assertEquals(result, 3.0);
    }

    @Test
    public void divOneValueByAnotherStrings() {
        double result = calculator.div(Double.parseDouble("6.0"),Double.parseDouble("2.0"));
        Assert.assertEquals(result, Double.parseDouble("3.0"));
    }

    @Test (expectedExceptions = NumberFormatException.class)
    public void divideByZeroThrowsException() {
        double result = calculator.div(6.0, 0.0);
    }
}
