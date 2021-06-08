package com.capgemini.atmsystem;

import java.util.ArrayList;

public class ATMCard extends BankCustomer
{
	private int PIN;
	private long CardID;
	private Account Acc;
	ArrayList<ATMCard> alatm=new ArrayList<ATMCard>();
	
	public ATMCard() {
		super();
	}
	
	public ATMCard(int pIN, long cardID, Account acc) {
		PIN = pIN;
		CardID = cardID;
		Acc = acc;
	}
	
	public ATMCard(String customerName, String addresss, String email, ATMCard card, Account acc) 
	{
		super(customerName, addresss, email, card, acc);
		// TODO Auto-generated constructor stub
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}

	public long getCardID() {
		return CardID;
	}

	public void setCardID(long cardID) {
		CardID = cardID;
	}

	public Account getAcc() {
		return Acc;
	}

	public void setAcc(Account acc) {
		Acc = acc;
	}
	
}
