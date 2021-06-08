package com.capgemini.book.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.capgemini.book.exception.ArrayListIsNullException;
import com.capgemini.book.exception.BookAlreadyFoundException;
import com.capgemini.book.exception.BookIDCannotBeNegative;
import com.capgemini.book.exception.BookNameCannotBeNull;
import com.capgemini.book.exception.BookNotFoundException;
import com.capgemini.book.exception.PriceNotValidException;
import com.capgemini.book.model.Book;
class BookManagerTest 
{
	static ArrayList<Book> al=new ArrayList<Book>();
	
	private static BookManager bkm;
	private static Book bk;
	private static Book bk1;
	@BeforeAll
	public static void setupAll() throws BookIDCannotBeNegative, BookNameCannotBeNull, PriceNotValidException
	{
		
		System.out.println("Should print before all test");
		bk=new Book(20,"Krishna",260);
		al.add(bk);
		bk=new Book(24,"Krishna1",210);
		al.add(bk);
		bk=new Book(27,"Krishna2",200);
		al.add(bk);
	}

	
	@BeforeEach
	public void setup()
	{
		System.out.println("Should print before each test");
		bkm=new BookManager();
	}
	
	
	@Test
	@DisplayName("should print before each test")
	public void shouldCreateBook() throws BookIDCannotBeNegative, BookNameCannotBeNull, PriceNotValidException, ArrayListIsNullException, BookAlreadyFoundException
	{
		bkm.addBook(25,"Krishna",260);
		assertFalse(bkm.getAllBooks().isEmpty());
		assertEquals(1,bkm.getAllBooks().size());
	}
	
	@Test
	@DisplayName("should not create Book Details when Book ID is negetive")
	public void shouldThrowBookIDCannotBeNegative()
	{
		Assertions.assertThrows(BookIDCannotBeNegative.class,()->{bkm.addBook(-20,"Krishna",260);});
	}
	
	@Test
	@DisplayName("should not create Book Details when Book Name is Null")
	public void shouldThrowBookNameCannotBeNull()
	{
		Assertions.assertThrows(BookNameCannotBeNull.class,()->{bkm.addBook(20,"",260);});
	}
	@Test
	@DisplayName("should not create Book Details when price is zero or null or negative")
	public void shouldThrowPriceNotValidException()
	{
		Assertions.assertThrows(PriceNotValidException.class,()->{bkm.addBook(20,"Krishna",-260);});
	}
	
	@Test
	@DisplayName("check list is empty or not")
	public void checkDuplicateBook()
	{
		Assertions.assertThrows(BookAlreadyFoundException.class,()->{bkm.addBook(24,"Krishna1",210,al);});
	}
	
	@Test
	@DisplayName("check checkBookExist delete")
	public void checkBookExistDelete()
	{
		Assertions.assertThrows(BookNotFoundException.class,()->{bkm.delete(al,21);});
	}
	
	@Test
	@DisplayName("check checkBookExist update")
	public void checkBookExistUpdate()
	{
		Assertions.assertThrows(BookNotFoundException.class,()->{bkm.update(al,21);});
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
}
