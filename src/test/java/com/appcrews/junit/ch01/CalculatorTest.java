package com.appcrews.junit.ch01;

public class CalculatorTest {
	private int nbErrors = 0;
	
	public void testAdd() {
		Calculator calculator = new Calculator();
		double result = calculator.add(10, 50);
		if (result!=60) {
			System.out.println("Bad result: " + result);
		}
	}
	

}
