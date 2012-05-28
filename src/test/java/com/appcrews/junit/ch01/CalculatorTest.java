package com.appcrews.junit.ch01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		double result = calculator.add(1, 1);
		assertEquals(2, result, 0);
	}
	
}
