package com.capgemini.authorapp.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AuthorTest {
	
	static Author au;
	Author au1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		au=new Author("Rama","rama@abc.d",'m');
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		au=null;
	}

	@BeforeEach
	void setUp() throws Exception {
		au1=new Author();
	}

	@AfterEach
	void tearDown() throws Exception {
		au1=null;
	}

	@Test
	void testAuthor() {
		assertEquals(new Author(),au1);
	}

	@Test
	void testGetName() {
		assertEquals("Rama",au.getName());
	}

	@Test
	void testGetEmail() {
		assertEquals("rama@abc.d",au.getEmail());
	}

	@Test
	void testGetGender() {
		assertEquals('m',au.getGender());
	}

}
