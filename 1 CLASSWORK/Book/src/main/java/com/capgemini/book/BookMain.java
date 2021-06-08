package com.capgemini.book;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.book.exception.ArrayListIsNullException;
import com.capgemini.book.exception.BookAlreadyFoundException;
import com.capgemini.book.exception.BookIDCannotBeNegative;
import com.capgemini.book.exception.BookNameCannotBeNull;
import com.capgemini.book.exception.BookNotFoundException;
import com.capgemini.book.exception.PriceNotValidException;
import com.capgemini.book.model.Book;
import com.capgemini.book.service.BookManager;

public class BookMain {

	static Scanner ip=new Scanner(System.in);
	static BookManager bm=new BookManager();
	static ArrayList<Book> al=new ArrayList<Book>();
	public static void main(String[] args) throws BookIDCannotBeNegative, BookNameCannotBeNull, PriceNotValidException, ArrayListIsNullException, BookAlreadyFoundException, BookNotFoundException 
	{
		
		//System.out.println("Enter the choice : ");
		int ch;
		char choice='y';
		int bid;
		while(choice=='y')
		{
			System.out.println("Enter choice");
			System.out.println("1. Create");
			System.out.println("2. Read");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			ch=ip.nextInt();
			switch(ch)
			{
				case 1 :	bm.readDetails();
							break;
				case 2 :	al=bm.getAllBooks();
							System.out.println(al);
							break;
				case 3 :	System.out.println("Enter the Book ID : ");
							bid=ip.nextInt();
							bm.update(al,bid);
							break;
				case 4 :	System.out.println("Enter the Book ID : ");
							bid=ip.nextInt();
							bm.delete(al,bid);
							break;
				default : 
							break;
			}
			System.out.println("Do you want to continue : y/n");
			choice=ip.next().trim().charAt(0);
		}
	}
}
