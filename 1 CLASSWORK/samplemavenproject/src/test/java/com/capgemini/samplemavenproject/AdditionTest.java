package com.capgemini.samplemavenproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdditionTest {
	Addition ad=new Addition();
	
	@Test
	public void addTest() {
		
		assertEquals(11, ad.add(5,6));
	}
}
