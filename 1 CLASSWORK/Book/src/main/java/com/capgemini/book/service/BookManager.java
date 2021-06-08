package com.capgemini.book.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.book.exception.ArrayListIsNullException;
import com.capgemini.book.exception.BookAlreadyFoundException;
import com.capgemini.book.exception.BookIDCannotBeNegative;
import com.capgemini.book.exception.BookNameCannotBeNull;
import com.capgemini.book.exception.BookNotFoundException;
import com.capgemini.book.exception.PriceNotValidException;
import com.capgemini.book.model.Book;

public class BookManager 
{
	ArrayList<Book> al=new ArrayList<Book>();
	static int bid;
	static String name;
	static double price;
	static Scanner ip=new Scanner(System.in);
	
	public void addBook(int bid,String name,double price) throws BookIDCannotBeNegative, BookNameCannotBeNull, PriceNotValidException, BookAlreadyFoundException
	{
		Book bk=new Book(bid,name,price);
		validateBook(bk);
		checkIfBookAlreadyExist(al,bid);
		al.add(bk);
	}
	
	public void addBook(int bid,String name,double price,ArrayList<Book> al) throws BookIDCannotBeNegative, BookNameCannotBeNull, PriceNotValidException, BookAlreadyFoundException
	{
		Book bk=new Book(bid,name,price);
		validateBook(bk);
		checkIfBookAlreadyExist(al,bid);
		al.add(bk);
	}
	
	private void checkIfBookAlreadyExist(ArrayList<Book> al,int bid) throws BookAlreadyFoundException {
		// TODO Auto-generated method stub
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).getBid()==bid)
			{
				throw new BookAlreadyFoundException("Book Already Found");
			}
		}
	}
	
	private void validateBook(Book bk) throws BookIDCannotBeNegative, BookNameCannotBeNull, PriceNotValidException {
		// TODO Auto-generated method stub
		bk.validateBid();
		bk.validateName();
		bk.validatePrice();
	}

	public void readDetails() throws BookIDCannotBeNegative, BookNameCannotBeNull, PriceNotValidException, BookAlreadyFoundException
	{
		
		System.out.println("Enter the Book details");
		System.out.println("Enter the Book ID : ");
		bid=ip.nextInt();
		System.out.println("Enter the Name : ");
		name=ip.next();
		System.out.println("Enter the price: ");
		price=ip.nextDouble();
		addBook(bid,name,price);
	}
	
	public ArrayList<Book> getAllBooks() throws ArrayListIsNullException
	{
		if(al.size()==0)
		{
			throw new ArrayListIsNullException("There are no books");
		}
		return al;
	}

	public ArrayList<Book> update(ArrayList<Book> al,int bid) throws BookNotFoundException 
	{
		
		// TODO Auto-generated method stub
		int pos=0,flag=0;
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).getBid()!=bid)
			{
				throw new BookNotFoundException("Book Not Found");
			}
		}
		
		System.out.println("Enter choice");
		System.out.println("1. Name");
		System.out.println("2. Price");
		int ch=ip.nextInt();
		switch(ch)
		{
			case 1 :	System.out.println("Enter the Name : ");
						al.get(pos).setName(ip.next());
						break;
			case 2 :	System.out.println("Enter the price: ");
						al.get(pos).setPrice(ip.nextDouble());
						break;
			default : 	System.out.println("Wrong choice");
						break;
		}
		return al;
		
	}

	public ArrayList<Book> delete(ArrayList<Book> al,int bid) throws BookNotFoundException 
	{
		// TODO Auto-generated method stub
		
		int flag=0;
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).getBid()==bid)
			{
				al.remove(i);
				return al;
			}
			
		}
		throw new BookNotFoundException("Book Not Found");
	}
}
