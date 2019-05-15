package com.training.task.module4.trigonometry;

import com.epam.tat.module4.Calculator;
import com.training.task.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CosTest extends BaseCalculatorTest {

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test()
    public void cos0() {
        double result = calculator.cos(0);
        Assert.assertEquals(result, 1, "Invalid result of operation");
    }

    @Test()
    public void cos90() {
        double result = calculator.cos(Math.PI/2);
        Assert.assertEquals(result, 0, "Invalid result of operation");
    }
}
