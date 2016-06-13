package com.renovite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
    public void addTwoNumbersTest() {
        int a = 10;
        int b = 15;
        assertEquals(25, Calculator.add(a, b));
    }

}
