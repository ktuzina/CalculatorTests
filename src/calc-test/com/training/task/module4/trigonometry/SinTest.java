package com.training.task.module4.trigonometry;

import com.epam.tat.module4.Calculator;
import com.training.task.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SinTest extends BaseCalculatorTest {

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test()
    public void sin0() {
        double result = calculator.sin(0);
        Assert.assertEquals(result, 0.0, "Invalid result of operation");
    }

    @Test()
    public void sin90() {
        double result = calculator.sin(Math.PI/2);
        Assert.assertEquals(result, 1.0, "Invalid result of operation");
    }
}
