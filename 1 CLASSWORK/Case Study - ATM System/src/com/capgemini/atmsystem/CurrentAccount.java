package com.capgemini.atmsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CurrentAccount extends Account
{
	private static final double InterestRate=0.02;


	
	public void displayById(ArrayList<Transaction> alt, ArrayList<BankCustomer> albc, ArrayList<Account> alc,ArrayList<ATMCard> alatm,ArrayList<SavingsAccount> alsa, int id2) {
		// TODO Auto-generated method stub
		
		System.out.println("========================================");
		for(int i=0;i<alc.size();i++)
		{	
			if(alc.get(i).getAccountNumber()==id2)
			{
				System.out.println("Customer Name : "+albc.get(i).getCustomerName());
				System.out.println("Customer Address : "+albc.get(i).getAddress());
				System.out.println("Customer Email : "+albc.get(i).getEmail());
				System.out.println("Customer Account Number : "+alc.get(i).getAccountNumber());
				System.out.println("Customer PIN : "+alatm.get(i).getPIN());
				System.out.println("Customer CardID : "+alatm.get(i).getCardID());
				show();
				System.out.println("Customer Balance : "+alsa.get(i).getBal());
				System.out.println("========================================");
				break;
			}
			
		}
	}
	public void displayATM(ArrayList<Transaction> alt, ArrayList<BankCustomer> albc, ArrayList<Account> alc,ArrayList<ATMCard> alatm,ArrayList<SavingsAccount> alsa, int id2) {
		for(int i=0;i<alc.size();i++)
		{	
			if(alc.get(i).getAccountNumber()==id2)
			{
				System.out.println("Customer Name : "+albc.get(i).getCustomerName());
				System.out.println("Customer Address : "+albc.get(i).getAddress());
				System.out.println("Customer Email : "+albc.get(i).getEmail());
				System.out.println("Customer Account Number : "+alc.get(i).getAccountNumber());
				System.out.println("Customer PIN : "+alatm.get(i).getPIN());
				System.out.println("Customer CardID : "+alatm.get(i).getCardID());
				show();
				break;
			}
			
		}
	}

}
