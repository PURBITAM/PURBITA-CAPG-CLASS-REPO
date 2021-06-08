package com.capgemini.book.model;

import com.capgemini.book.exception.BookIDCannotBeNegative;
import com.capgemini.book.exception.BookNameCannotBeNull;
import com.capgemini.book.exception.PriceNotValidException;

public class Book 
{
	private int bid;
	private String name;
	private double price;
	public Book() {
		super();
	}
	
	public Book(int bid, String name, double price) {
		super();
		this.bid = bid;
		this.name = name;
		this.price = price;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bid != other.bid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", name=" + name + ", price=" + price + "]";
	}
	
	public void validateBid() throws BookIDCannotBeNegative {
		// TODO Auto-generated method stub
		if(this.bid<0)
		{
			throw new BookIDCannotBeNegative("book ID should not be negetive");
		}
	}

	public void validateName() throws BookNameCannotBeNull {
		// TODO Auto-generated method stub
		if(this.name.isBlank())
		{
			throw new BookNameCannotBeNull("Name cannot be null or empty");
		}
	}

	public void validatePrice() throws PriceNotValidException
	{
		// TODO Auto-generated method stub
		String pricestr=""+(this.price);
		if(this.price<=0 || (pricestr.isBlank()))
		{
			throw new PriceNotValidException("price can not be zero or null or negative ");
		}
	}
}
