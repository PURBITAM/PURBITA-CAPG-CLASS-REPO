package com.capgemini.cmappcollections.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ContactManagerTest {
	
	/**
	 * Object of Contact Manager Class
	 */
	private ContactManager contManager;
	
	@BeforeAll
	public static void setupAll()
	{
		System.out.println("Should print before all test");
	}
	
	@BeforeEach
	public void setup()
	{
		System.out.println("Should print before each test");
		System.out.println("Instantiating the Contact Manager");
		contManager=new ContactManager();
	}
	
	@Test
	@DisplayName("should print before each test")
	public void shouldCreateContact()
	{
		contManager.addContact("Rama","Krishna","01234567890");
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1,contManager.getAllContacts().size());
	}
	
	//Testing Exceptions in JUnit5 and Java 8
	@Test
	@DisplayName("should not create contact when first name is null")
	public void shouldThrowRunTimeExceptionWhenFirstNameIsNull()
	{
		Assertions.assertThrows(RuntimeException.class,()->{
			contManager.addContact(null,"Krishna","01234567890");});
	}
	
	
	//	//Testing Exceptions in JUnit4 and Java 7 or below
	//	
	//	@Test(expected=RuntimeException.class)
	//	@DisplayName("should not create contact when first name is null")
	//	public void FirstNameIsNull()
	//	{
	//		contManager.addContact(null,"Krishna","01234567890");
	//	}	
	
	
	//Testing Exceptions in JUnit5 and Java 8
	@Test
	@DisplayName("should not create contact when Last name is null")
	public void shouldThrowRunTimeExceptionWhenLastNameIsNull()
	{
		Assertions.assertThrows(RuntimeException.class,()->{
			contManager.addContact("Rama",null,"01234567890");});
	}
	
	//Testing Exceptions in JUnit5 and Java 8
		@Test
		@DisplayName("should not create contact when Last name is null")
		public void shouldThrowRunTimeExceptionWhenPhNoIsNull()
		{
			Assertions.assertThrows(RuntimeException.class,()->{
				contManager.addContact("Rama","Krishna",null);});
		}
		//Testing Exceptions in JUnit5 and Java 8
		@Test
		@DisplayName("should test phone number start with 0")
		public void TestPhoneNumberFormat()
		{
			Assertions.assertThrows(RuntimeException.class,()->{
				contManager.addContact("Rama","Krishna","99887766554");});
		}
		
		@Nested
		class RepeatedTests
		{
			@DisplayName("Should create contact")
			@RepeatedTest(value=5,name="Repeating contact creation test[currentRepeation] of [totalRepeation]")
			public void shouldCreateContactRepeatedly()
			{
				contManager.addContact("Rama","Krishna","01234567890");
				assertFalse(contManager.getAllContacts().isEmpty());
				assertEquals(1,contManager.getAllContacts().size());
			}
		}
		
		@Nested
		class ParameterizedRests
		{
			@DisplayName("Phone number should match the required format")
			@ParameterizedTest
			@ValueSource(strings= {"01234567890","01234567899","01234567898"})
			public void shouldTestPhoneNumberFormatUsingValueSource(String phoneNumber)
			{
				contManager.addContact("Rama","Krishna", phoneNumber);
				assertFalse(contManager.getAllContacts().isEmpty());
				assertEquals(1,contManager.getAllContacts().size());
			}
		}
		
		private static List<String> phoneNumberList()
		{
			return Arrays.asList("01234567890","01234567899","01234567898");
			
		}
		//reading from "phoneNumberList()" and tested in "testPhoneNumberUsingMethodSource(String phoneNumber)"
		@DisplayName("Testing Phone Number in required format using Method Source")
		@ParameterizedTest
		@MethodSource("phoneNumberList")
		public void testPhoneNumberUsingMethodSource(String phoneNumber)
		{
			contManager.addContact("Rama","Krishna", phoneNumber);
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1,contManager.getAllContacts().size());
		}
		
		@Test
		@DisplayName("disabled test")
		@Disabled
		public void disabledTest()
		{
			throw new RuntimeException("this test is a disabled test");
		}
		
		@AfterEach
		public void tearDown()
		{
			System.out.println("Should print after each test");
		}
		
		@AfterAll
		public static void tearDownAll()
		{
			System.out.println("Should print after all test");
		}
		
//		@Test
//		@DisplayName("should print before each test")
//		@EnabledOnOs()
//		public void shouldCreateContactOnMAC()
//		{
//			contManager.addContact("Rama","Krishna","01234567890");
//			assertFalse(contManager.getAllContacts().isEmpty());
//			assertEquals(1,contManager.getAllContacts().size());
//		}
}
