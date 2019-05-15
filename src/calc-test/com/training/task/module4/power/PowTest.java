package com.training.task.module4.power;

import com.epam.tat.module4.Calculator;
import com.training.task.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PowTest extends BaseCalculatorTest {

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void zeroPower() {
        double result = calculator.pow(6.0,0.0);
        Assert.assertEquals(result, 1.0);
    }

    @Test
    public void firstPower() {
        double result = calculator.pow(6.0,1.0);
        Assert.assertEquals(result, 6.0);
    }

    @Test
    public void secondPower() {
        double result = calculator.pow(6.0,2.0);
        Assert.assertEquals(result, 36.0);
    }
}
