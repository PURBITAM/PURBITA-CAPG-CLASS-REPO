package com.capgemini.atmsystem;

import java.util.ArrayList;

public class BankCustomer implements ATM
{
	private String CustomerName;
	private String Address;
	private String Email;
	private ATMCard Card;
	private Account Acc;
	
	ArrayList<BankCustomer> albc=new ArrayList<BankCustomer>();
	
	public BankCustomer() {
		super();
	}

	public BankCustomer(String customerName, String addresss, String email, ATMCard card, Account acc) {
		super();
		CustomerName = customerName;
		Address = addresss;
		Email = email;
		Card = card;
		Acc = acc;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public ATMCard getCard() {
		return Card;
	}

	public void setCard(ATMCard card) {
		Card = card;
	}

	public Account getAcc() {
		return Acc;
	}

	public void setAcc(Account acc) {
		Acc = acc;
	}

	public ArrayList<BankCustomer> getAlbc() {
		return albc;
	}

	public void setAlbc(ArrayList<BankCustomer> albc) {
		this.albc = albc;
	}

	@Override
	public void show() 
	{
		// TODO Auto-generated method stub
		System.out.println("ATM Location : "+Location);
		System.out.println("ATM Branch Name : "+BranchName);
		
	}
	
	
}
