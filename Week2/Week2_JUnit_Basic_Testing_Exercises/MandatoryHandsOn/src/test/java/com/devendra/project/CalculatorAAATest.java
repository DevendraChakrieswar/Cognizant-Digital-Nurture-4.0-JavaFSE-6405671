package com.devendra.project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorAAATest {
    private CalculatorAAA calculator;

    @Before
    public void setUp() {
        calculator = new CalculatorAAA();
        System.out.println("Setting up before test........");
    }
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Cleaning up after test...........");
    }
    @Test
    public void testAdd() {
        int a = 10;
        int b = 5;
        int res = calculator.add(a,b);

        assertEquals(15, res);
    }
    @Test
    public void testSubtract() {
        int a = 10;
        int b = 3;
        int res = calculator.subtract(a,b);
        assertEquals(7, res);
    }
}
