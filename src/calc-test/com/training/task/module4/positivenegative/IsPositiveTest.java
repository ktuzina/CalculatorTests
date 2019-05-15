package com.training.task.module4.positivenegative;

import com.epam.tat.module4.Calculator;
import com.training.task.module4.BaseCalculatorTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class IsPositiveTest extends BaseCalculatorTest {

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void checkValuePositive() {
        assertTrue(calculator.isPositive(1));
    }

    @Test
    public void checkValuePositiveFalse() {
        assertFalse(calculator.isPositive(-1));
    }

    @Test
    public void checkValuePositiveZero() {
        assertFalse(calculator.isPositive(0));
    }
}
