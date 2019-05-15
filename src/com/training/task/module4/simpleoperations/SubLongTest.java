package com.training.task.module4.simpleoperations;

import com.epam.tat.module4.Calculator;
import com.training.task.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubLongTest extends BaseCalculatorTest {

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "subLongDp")
    public void oneValueMinusAnother(long a, long b, long expected) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "subLongDp")
    public static Object[][] numbersForSubDp() {
        return new Object[][]{
                {2, 13, -11},
                {5, 2, 3},
                {-10, -6, -4},
                {0, 0, 0}
        };
    }

    @Test(dataProvider = "subLongStringsDp")
    public void oneValueMinusAnother(String a, String b, String expected) {
        long result = calculator.sub(Integer.parseInt(a), Integer.parseInt(b));
        Assert.assertEquals(result, Integer.parseInt(expected));
    }

    @DataProvider(name = "subLongStringsDp")
    public static Object[][] stringsForSubDp() {
        return new Object[][]{
                {"2", "13", "-11"},
                {"5", "2", "3"},
                {"-10", "-6", "-4"},
                {"0", "0", "0"}
        };
    }

}
