/**
 * 
 */
package com.capgemini.cmappcollections.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Purbita
 *
 */
public class ContactTest {

	/**
	 * @throws java.lang.Exception
	 */
	static Contact cont;
	Contact cont1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cont=new Contact("Rama","Krishna","01234567890");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		cont=null;
	}
	

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		cont1=new Contact();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		cont1=null;
	}
	/**
	 * Test method for {@link com.capgemini.cmappcollections.model.Contact#Contact()}.
	 */
	
	@Test
	void testContact() {
		assertEquals(new Contact(),cont1);
	}

//	/**
//	 * Test method for {@link com.capgemini.cmappcollections.model.Contact#Contact(java.lang.String, java.lang.String, java.lang.String)}.
//	 */
//	@Test
//	void testContactStringStringString() {
//		fail("Not yet implemented");
//	}

	/**
	 * Test method for {@link com.capgemini.cmappcollections.model.Contact#getfName()}.
	 */
	@Test
	void testGetfName() {
		assertEquals("Rama",cont.getfName());
	}

//	/**
//	 * Test method for {@link com.capgemini.cmappcollections.model.Contact#setfName(java.lang.String)}.
//	 */
//	@Test
//	void testSetfName() {
//		fail("Not yet implemented");
//	}

	/**
	 * Test method for {@link com.capgemini.cmappcollections.model.Contact#getlName()}.
	 */
	@Test
	void testGetlName() {
		assertEquals("Krishna",cont.getlName());
	}

//	/**
//	 * Test method for {@link com.capgemini.cmappcollections.model.Contact#setlName(java.lang.String)}.
//	 */
//	@Test
//	void testSetlName() {
//		fail("Not yet implemented");
//	}

	/**
	 * Test method for {@link com.capgemini.cmappcollections.model.Contact#getPhNo()}.
	 */
	@Test
	void testGetPhNo() {
		assertEquals("01234567890",cont.getPhNo());
	}
	
	
//	
//	/**
//	 * Test method for {@link com.capgemini.cmappcollections.model.Contact#hashCode()}.
//	 */
//	@Test
//	void testHashCode() {
//		fail("Not yet implemented");
//	}
//
//	
//	/**
//	 * Test method for {@link com.capgemini.cmappcollections.model.Contact#setPhNo(java.lang.String)}.
//	 */
//	@Test
//	void testSetPhNo() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link com.capgemini.cmappcollections.model.Contact#equals(java.lang.Object)}.
//	 */
//	@Test
//	void testEqualsObject() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link com.capgemini.cmappcollections.model.Contact#toString()}.
//	 */
//	@Test
//	void testToString() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link com.capgemini.cmappcollections.model.Contact#validateFirstName()}.
//	 */
//	@Test
//	void testValidateFirstName() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link com.capgemini.cmappcollections.model.Contact#validateLastName()}.
//	 */
//	@Test
//	void testValidateLastName() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link com.capgemini.cmappcollections.model.Contact#validatePhNo()}.
//	 */
//	@Test
//	void testValidatePhNo() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#Object()}.
//	 */
//	@Test
//	void testObject() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#getClass()}.
//	 */
//	@Test
//	void testGetClass() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
//	 */
//	@Test
//	void testEqualsObject1() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#clone()}.
//	 */
//	@Test
//	void testClone() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#toString()}.
//	 */
//	@Test
//	void testToString1() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#notify()}.
//	 */
//	@Test
//	void testNotify() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#notifyAll()}.
//	 */
//	@Test
//	void testNotifyAll() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#wait()}.
//	 */
//	@Test
//	void testWait() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#wait(long)}.
//	 */
//	@Test
//	void testWaitLong() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#wait(long, int)}.
//	 */
//	@Test
//	void testWaitLongInt() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#finalize()}.
//	 */
//	@Test
//	void testFinalize() {
//		fail("Not yet implemented");
//	}

}
