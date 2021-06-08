package com.capgemini.samplemavenproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubtractionTest {
	
	Subtraction sb=new Subtraction();
	
	@Test
	public void subtractTest() {
		int expectedResult=10;
		int actualResult=sb.subtract(20,10);
		
		assertEquals(expectedResult, actualResult);
	}
	
}
