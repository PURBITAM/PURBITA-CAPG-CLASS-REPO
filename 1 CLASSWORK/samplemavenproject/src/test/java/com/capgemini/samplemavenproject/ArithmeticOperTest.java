package com.capgemini.samplemavenproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArithmeticOperTest {
	ArithmeticOper ao=new ArithmeticOper();
	@Test											//addition
	public void addTest()
	{
		int expectedResult=30;
		int actualResult=ao.add(20,10);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test											//subtraction
	public void subtractTest() {
		int expectedResult=10;
		int actualResult=ao.subtract(20,10);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test											//multiplication
	public void multiplyTest()
	{
		int expectedResult=200;
		int actualResult=ao.multiply(20,10);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test											//division
	public void divideTest() {
		int expectedResult=2;
		int actualResult=ao.divide(20,10);
		assertEquals(expectedResult, actualResult);
	}
}
