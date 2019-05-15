package com.training.task.module4.simpleoperations;

import com.epam.tat.module4.Calculator;
import com.training.task.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SumLongTest extends BaseCalculatorTest {

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "sumLongNumbersDp", groups = "sum")
    public void oneValuePlusAnother(long a, long b, long expected) throws InterruptedException {
        sleep(1000);
        checkTime();
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "sumLongNumbersDp")
    public static Object[][] numbersForSumDp() {
        return new Object[][]{
                {2, 13, 15},
                {-5, 7, 2},
                {-10, -6, -16},
                {0, 0, 0}
        };
    }

    @Test(dataProvider = "sumLongStringsDp", groups = "sum")
    public void oneValuePlusAnother(String a, String b, String expected) throws InterruptedException {
        sleep(1000);
        checkTime();
        long result = calculator.sum(Integer.parseInt(a), Integer.parseInt(b));
        Assert.assertEquals(result, Integer.parseInt(expected));
    }

    @DataProvider(name = "sumLongStringsDp")
    public static Object[][] stringsForSumDp() {
        return new Object[][]{
                {"2", "13", "15"},
                {"-5", "7", "2"},
                {"-10", "-6", "-16"},
                {"0", "0", "0"}
        };
    }
}
