package com.capgemini.book.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {
	
	static Book bk;
	static Book bk1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		bk=new Book(11,"The ABC",250);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		bk=null;
	}

	@BeforeEach
	void setUp() throws Exception {
		bk1=new Book();
	}

	@AfterEach
	void tearDown() throws Exception {
		bk1=null;
	}

	@Test
	void testBook() {
		assertEquals(new Book(),bk1);
	}
	
	@Test
	void testGetBid() {
		assertEquals(11,bk.getBid());
	}

	@Test
	void testGetName() {
		assertEquals("The ABC",bk.getName());
	}

	@Test
	void testGetPrice() {
		assertEquals(250,bk.getPrice());
	}
}
