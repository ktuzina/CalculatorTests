package com.training.task.module4.simpleoperations;

import com.epam.tat.module4.Calculator;
import com.training.task.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseCalculatorTest {

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(groups = "sum")
    public void oneValuePlusAnotherNumbers() {
        double result = calculator.sum(1.0, 5.0);
        Assert.assertEquals(result, 6.0);
    }

    @Test(groups = "sum")
    public void oneValuePlusAnotherDoubleStrings() {
        double result = calculator.sum(Double.parseDouble("1.0"), Double.parseDouble("2.0"));
        Assert.assertEquals(result, Double.parseDouble("3.0"));
    }
}
