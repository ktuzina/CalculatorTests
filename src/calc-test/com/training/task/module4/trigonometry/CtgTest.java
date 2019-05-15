package com.training.task.module4.trigonometry;

import com.epam.tat.module4.Calculator;
import com.training.task.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CtgTest extends BaseCalculatorTest {

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test()
    public void ctg0() {
        double a = 0;
        double result = calculator.ctg(a);
        double expected = Math.round(cotangent(a));
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }

    @Test()
    public void ctg45() {
        double a = Math.PI/4;
        double result = calculator.ctg(a);
        double expected = Math.round(cotangent(a));
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }

    @Test()
    public void ctg90() {
        double a = Math.PI/2;
        double result = calculator.ctg(a);
        double expected = Math.round(cotangent(a));
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }

    private double cotangent(double a) {
        return (1/Math.tan(a));
    }
}
