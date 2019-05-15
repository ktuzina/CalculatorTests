package com.training.task.module4.simpleoperations;

import com.epam.tat.module4.Calculator;
import com.training.task.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultDoubleTest extends BaseCalculatorTest {

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void multOneWithAnotherNumbers() {
        double result = calculator.mult(1.0, 5.0);
        Assert.assertEquals(result, 5.0);
    }

    @Test
    public void multOneWithAnotherStrings() {
        double result = calculator.mult(Double.parseDouble("2.0"), Double.parseDouble("-1.0"));
        Assert.assertEquals(result, Double.parseDouble("-2.0"));
    }
}
