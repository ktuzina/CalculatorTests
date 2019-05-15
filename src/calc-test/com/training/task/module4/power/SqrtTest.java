package com.training.task.module4.power;

import com.epam.tat.module4.Calculator;
import com.training.task.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SqrtTest extends BaseCalculatorTest {

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void sqrtFromFour() {
        double result = calculator.sqrt(4.0);
        Assert.assertEquals(result, 2.0);
    }

    @Test
    public void sqrtFromOne() {
        double result = calculator.sqrt(1.0);
        Assert.assertEquals(result, 1.0);
    }

    @Test
    public void sqrtFromNegative() {
        double a = -4;
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, Math.sqrt(a), "Invalid result. Sqrt from negative value doesn't exist in real numbers");
    }

    @Test
    public void sqrtFromZero() {
        double result = calculator.sqrt(0.0);
        Assert.assertEquals(result, 0.0);
    }
}
