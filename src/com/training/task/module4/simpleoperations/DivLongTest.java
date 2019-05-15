package com.training.task.module4.simpleoperations;

import com.epam.tat.module4.Calculator;
import com.training.task.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DivLongTest extends BaseCalculatorTest {

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void divOneValueByAnotherNumbers() {
        long result = calculator.div(6,2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void divOneValueByAnotherStrings() {
        long result = calculator.div(Integer.parseInt("6"),Integer.parseInt("2"));
        Assert.assertEquals(result, Integer.parseInt("3"));
    }

    @Test (expectedExceptions = NumberFormatException.class)
    public void divideByZeroThrowsException() {
        long result = calculator.div(6, 0);
    }
}
