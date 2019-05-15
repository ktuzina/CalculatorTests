package com.training.task.module4;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;

import java.util.Date;

public class BaseCalculatorTest {

    protected Calculator calculator;

    @BeforeGroups("sum")
    public void setUpGroup(){
        calculator = new Calculator();
    }

    @BeforeMethod
    public void startTestMsg() {
        System.out.println("Start the test");
    }

    @AfterMethod
    public void finishTestMsg() {
        System.out.println("Test is finished");
    }

    protected void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }
}
