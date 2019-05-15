package com.training.task.module4.simpleoperations;

import com.epam.tat.module4.Calculator;
import com.training.task.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultLongTest extends BaseCalculatorTest {

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "multLongDp")
    public void multOneWithAnother(long a, long b, long expected) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "multLongDp")
    public static Object[][] numbersForMultDp() {
        return new Object[][]{
                {0, 13, 0},
                {-2, -5, 10},
                {-10, 6, -60},
                {7, 8, 56}
        };
    }

    @Test(dataProvider = "multLongStringsDp")
    public void multOneWithAnother(String a, String b, String expected) {
        long result = calculator.mult(Integer.parseInt(a), Integer.parseInt(b));
        Assert.assertEquals(result, Integer.parseInt(expected));
    }

    @DataProvider(name = "multLongStringsDp")
    public static Object[][] stringsForMultDp() {
        return new Object[][]{
                {"0", "13", "0"},
                {"-2", "-5", "10"},
                {"-10", "6", "-60"},
                {"7", "8", "56"}
        };
    }

}
