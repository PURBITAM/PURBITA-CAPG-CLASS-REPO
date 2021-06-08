package com.capgemini.atmsystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.capgemini.exceptions.InvalidTransactionException;

public class Transaction extends Account
{
	private Date dt;
	private int PIN;
	private double amt;
	private String status;
	//private double withdraw;
	ArrayList<Transaction> alt=new ArrayList<Transaction>();
	Scanner sc=new Scanner(System.in);
	int ch;
	
	public Transaction() {
		super();
	}
	
	public Transaction(Date dt, int pIN, double amt, String status) {
		super();
		this.dt = dt;
		PIN = pIN;
		this.amt = amt;
		this.status = status;
	}
	
	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<Transaction> startTransaction()
	{
		System.out.println("Enter PIN : ");
		PIN=sc.nextInt();
		dt=new Date();
		int flag=0;
		for(int i=0;i<alc.size();i++)
		{
			if(alatm.get(i).getPIN()==PIN)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("ATM Card PIN Invalid");
			alt.add(new Transaction(dt,0,0,null)) ;
		}
		else
		{
			
			System.out.println("choose : 1.Deposit 2.Withdraw");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1 :	System.out.println("Enter deposition amount : ");
						amt=sc.nextDouble();
						for(int i=0;i<alc.size();i++)
						{
							if(alatm.get(i).getPIN()==PIN)
							{
								alc.get(i).setBalance(alc.get(i).getBalance()+amt);
								System.out.println("Diposited");
								break;
							}
						}
						alt.add(new Transaction(dt,PIN,amt,"deposit")) ;
						break;
			case 2 :	
						while(true)
						{
							System.out.println("Enter withdrawal amount : ");
							try
							{
								amt=sc.nextDouble();
								if(amt>800)
								{
									throw new InvalidTransactionException("Amount to be withdrawn, should be less than INR 800");
								}
								else
								{
									break;
								}
							}
							catch(InvalidTransactionException e)
							{
								System.out.println(e.getMessage());
								continue;
							}
						}
						for(int i=0;i<alc.size();i++)
						{
							if(alatm.get(i).getPIN()==PIN)
							{
								alc.get(i).setBalance(alc.get(i).getBalance()-amt);
								System.out.println("Withdrawn");
								break;
							}
						}
						alt.add(new Transaction(dt,PIN,amt,"withdraw")) ;
						break;
			default : 	System.out.println("Wrong choice");
						break;
			}
		}
		
		
		return alt;
	}
	
	public void getAllTransaction() 
	{
		if(alt.size()==0)
		{
			System.out.println("No Transaction Yet.");
		}
		for(int i=0;i<alt.size();i++)
		{
			System.out.println(alt.get(i).getDt()+" "+alt.get(i).getPIN()+" "+alt.get(i).getStatus()+" "+alt.get(i).getAmt());
		}
	}
	
	public void getTransaction(ArrayList<Transaction> alt2, ArrayList<BankCustomer> albc2,ArrayList<Account> alc2, ArrayList<ATMCard> alatm2, ArrayList<SavingsAccount> alsa, int id) 
	{
		int cnt=0;
		for(int i=0;i<alt2.size();i++)
		{
			if(alt2.get(i).getPIN()==id)
			{
				System.out.println(alt2.get(i).getDt()+" "+alt2.get(i).getPIN()+" "+alt2.get(i).getStatus()+" "+alt2.get(i).getAmt());
			}
			else
			{
				cnt++;
			}
		}
		if(cnt==alt2.size())
		{
			System.out.println("No transaction yet");
		}
		else
		{
			System.out.println("===========================");
			for(int i=0;i<alatm2.size();i++)
			{
				if(alatm2.get(i).getPIN()==id)
				{
					//System.out.println("Current Balance : "+alc2.get(i).getBalance());
					System.out.println("Current Balance : "+alsa.get(i).getBal());
					break;
				}
			}
			
			System.out.println("===========================");
		}
	}
	
	public void getTransactionATM(ArrayList<Transaction> alt2, ArrayList<BankCustomer> albc2,ArrayList<Account> alc2, ArrayList<ATMCard> alatm2, ArrayList<SavingsAccount> alsa, int id) 
	{
		System.out.println("Transaction Details : ");
		int cnt=0;
		for(int i=alt2.size()-1;i>=0;i--)
		{
			if(alt2.get(i).getPIN()==id)
			{
				System.out.println(alt2.get(i).getDt()+" "+alt2.get(i).getPIN()+" "+alt2.get(i).getStatus()+" "+alt2.get(i).getAmt());
				break;
			}
			else
			{
				cnt++;
			}
		}
		if(cnt==alt2.size())
		{
			System.out.println("No transaction yet");
		}
		else
		{
			for(int i=0;i<alatm2.size();i++)
			{
				if(alatm2.get(i).getPIN()==id)
				{
					System.out.println("Current Balance : "+alsa.get(i).getBal());
					break;
				}
			}
		}
	}
}
