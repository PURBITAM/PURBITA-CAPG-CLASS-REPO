package com.capgemini.atmsystem;

import java.util.ArrayList;

public class SavingsAccount extends Account
{
	private static final double InterestRate=0.02;
	private int id;
	private double bal;
	ArrayList<SavingsAccount> alsa=new ArrayList<SavingsAccount>();
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int id, double bal) {
		super();
		this.id = id;
		this.bal = bal;
	}

	public SavingsAccount(int accountNumber, double balance, Transaction trans) {
		super(accountNumber, balance, trans);
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int pIN, long cardID, Account acc) {
		super(pIN, cardID, acc);
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(String customerName, String addresss, String email, ATMCard card, Account acc) {
		super(customerName, addresss, email, card, acc);
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public ArrayList<SavingsAccount> CalculateInterest(ArrayList<Account> alc, ArrayList<ATMCard> alatm,ArrayList<SavingsAccount> alsa,int id)
	{
		int flag=0;
		for(int i=0;i<alsa.size();i++)
		{
			if(id==alsa.get(i).getId())
			{
				flag=1;
				bal=(alc.get(i).getBalance()*(1+InterestRate));
				alsa.get(i).setBal(bal);
				break;
			}
		}
		if(flag==0)
		{
			bal=(alc.get(alc.size()-1).getBalance()*(1+InterestRate));
			id=alatm.get(alatm.size()-1).getPIN();
			alsa.add(new SavingsAccount(id,bal));
		}
		return alsa;
		
	}
	
}
