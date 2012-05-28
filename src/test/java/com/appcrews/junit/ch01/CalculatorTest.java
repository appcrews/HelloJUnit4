package com.appcrews.junit.ch01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		double result = calculator.add(10, 50);
		assertEquals(60, result, 0);
	}
	
//	public static void main(String[] args) {
//		CalculatorTest test = new CalculatorTest();
//		try {
//			test.testAdd();
//		}catch (Throwable e) {
//			test.nbErrors ++;
//			e.printStackTrace();
//		}
//		if (test.nbErrors>0) {
//			throw new IllegalStateException("There are " + test.nbErrors + "error(s)");
//		}
//	}

}
