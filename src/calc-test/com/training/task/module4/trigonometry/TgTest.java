package com.training.task.module4.trigonometry;

import com.epam.tat.module4.Calculator;
import com.training.task.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TgTest extends BaseCalculatorTest {

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test()
    public void tg0() {
        double result = calculator.tg(0);
        Assert.assertEquals(result, 0.0, "Invalid result of operation");
    }

    @Test()
    public void tg45() {
        double a = Math.PI/4;
        double result = calculator.tg(a);
        double expected = Math.round(Math.tan(a));
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }

    @Test()
    public void tg90() {
        double a = Math.PI/2;
        double result = calculator.tg(a);
        double expected = Math.round(Math.tan(a));
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }


}
