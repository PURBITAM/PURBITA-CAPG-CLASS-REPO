package com.capgemini.atmsystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.capgemini.exceptions.InvalidAccNoException;
import com.capgemini.exceptions.InvalidAddressException;
import com.capgemini.exceptions.InvalidBalanceException;
import com.capgemini.exceptions.InvalidCardIDException;
import com.capgemini.exceptions.InvalidEmailException;
import com.capgemini.exceptions.InvalidNameException;
import com.capgemini.exceptions.InvalidPINException;


public class Account extends ATMCard
{
	private int AccountNumber;
	private double Balance;
	private Transaction Trans;
	
	public Account() {
		super();
	}
	
	public Account(int accountNumber, double balance, Transaction trans) {
		super();
		AccountNumber = accountNumber;
		Balance = balance;
		Trans = trans;
	}
	
	public Account(int pIN, long cardID, Account acc) {
		super(pIN, cardID, acc);
	}
	
	public Account(String customerName, String addresss, String email, ATMCard card, Account acc) {
		super(customerName, addresss, email, card, acc);
	}
	
	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	Scanner sc=new Scanner(System.in);
	String CustomerName,Address,Email;
	int PIN,ch;
	long CardID;
	Account ATM,BankCust;
	BankCustomer bcust=new BankCustomer();
	ArrayList<Account> alc=new ArrayList<Account>();
	

	
	public ArrayList<BankCustomer> BankCustomerArrList()
	{
		return albc;
	}
	public ArrayList<ATMCard> ATMCardArrList()
	{
		return alatm;
	}
	
	public ArrayList<Account> insert()
	{
		if(alc.size()!=0)
		{
			sc.nextLine();
		}
//=============================================================================	
		while(true)
		{
			System.out.print("Enter Customer name : ");
			try
			{
				CustomerName=sc.nextLine();
				if(!CustomerName.isEmpty())
				{
					int count=0,ch;
					for(int i=0;i<CustomerName.length();i++)
					{
						ch=(int)CustomerName.charAt(i);
						if((ch>=65&&ch<=90) || (ch>=97 && ch<=122))
						{
							count++;
						}
					}
					boolean check=(count==CustomerName.length());
					if(!check)
					{
						throw new InvalidNameException("ERROR => Name must contain only alphabets");
					}
					else
					{
						break;
					}
				}
				else
				{
					throw new InvalidNameException("ERROR => Name Not Inserted");
				}
			}
			catch(InvalidNameException n)
			{
				System.out.println(n.getMessage());
				continue;
			}
		}
//=============================================================================	
		while(true)
		{
			System.out.print("Enter Customer Address : ");
			
			try
			{
				Address=sc.nextLine();
				if(Address.isEmpty())
				{
					throw new InvalidAddressException("ERROR => Address not inserted");
				}
				else
				{
					break;
				}
			}
			catch(InvalidAddressException n)
			{
				System.out.println(n.getMessage());
				continue;
			}
		}
//=============================================================================			
		while(true)
		{
			System.out.print("Enter Customer Email : ");
			try
			{
				Email=sc.nextLine();
				if(!Email.isEmpty())
				{
					boolean check=Pattern.matches("^[a-zA-Z0-9._-]+@(.+)+\\.(.+)$",Email);
					if(!check)
					{
						throw new InvalidEmailException("ERROR => should be in the format xyz@abc.cde and can include '.','_','-'");
					}
					else
					{
						break;
					}
				}
				else
				{
					throw new InvalidEmailException("ERROR => Email not inserted");
				}
				
			}
			catch (InvalidEmailException e)
			{
				System.out.println(e.getMessage());
				continue;
			}
		}
//=============================================================================		
		while(true)
		{
			System.out.print("Enter Customer ATM Card PIN : ");
			try
			{
				PIN=sc.nextInt();
				String pinstr=""+PIN;
				if(!pinstr.isEmpty())
				{
					boolean check=Pattern.matches("^[0-9]{3}$",pinstr);
					if(!check)
					{
						throw new InvalidPINException("ERROR => PIN should be a 3 digit number");
					}
					else
					{
						break;
					}
				}
				else
				{
					throw new InvalidPINException("ERROR => PIN not inserted");
				}
			}
			catch (InvalidPINException e)
			{
				System.out.println(e.getMessage());
				continue;
			}
		}
//=============================================================================	
		while(true)
		{
			System.out.print("Enter Customer ATM Card ID : ");
			try
			{
				CardID=sc.nextLong();
				String idstr=""+CardID;
				if(!idstr.isEmpty())
				{
					boolean check=Pattern.matches("^[0-9]{4}$",idstr);
					if(!check)
					{
						throw new InvalidCardIDException("ERROR => Card ID should be a 4 digit number");
					}
					else
					{
						break;
					}
				}
				else
				{
					throw new InvalidCardIDException("ERROR => Card ID not inserted");
				}
			}
			catch (InvalidCardIDException e)
			{
				System.out.println(e.getMessage());
				continue;
			}
		}
//=============================================================================	
		while(true)
		{
			System.out.print("Enter Customer Account Number : ");
			try
			{
				AccountNumber=sc.nextInt();
				String accnostr=""+AccountNumber;
				if(!accnostr.isEmpty())
				{
					boolean check=Pattern.matches("^[0-9]{5}$",accnostr);
					if(!check)
					{
						throw new InvalidAccNoException("ERROR => Account Number should be a 5 digit number");
					}
					else
					{
						break;
					}
				}
				else
				{
					throw new InvalidAccNoException("ERROR => Account Number not inserted");
				}
			}
			catch (InvalidAccNoException e)
			{
				System.out.println(e.getMessage());
				continue;
			}
		}
//=============================================================================	
		while(true)
		{
			System.out.print("Enter Customer Account Balance : ");
			try
			{
				Balance=sc.nextDouble();
				String balstr=""+Balance;
				if(!balstr.isEmpty())
				{
					boolean check=Pattern.matches("^[0-9]{4,}+\\.+[0-9]{1,}$",balstr);
					if(!check||(Balance<1000))
					{
						throw new InvalidBalanceException("ERROR => Balance should be greater than INR 1000. ");
					}
					else
					{
						break;
					}
				}
				else
				{
					throw new InvalidBalanceException("ERROR => Balance not inserted");
				}
			}
			catch (InvalidBalanceException e)
			{
				System.out.println(e.getMessage());
				continue;
			}
		}
		
		alc.add(new Account(AccountNumber,Balance,Trans));
		alatm.add(new ATMCard(PIN,CardID,alc.get(alc.size()-1)));
		albc.add(new BankCustomer(CustomerName,Address,Email,alatm.get(alatm.size()-1),alc.get(alc.size()-1)));
		ATM=new Account(PIN,CardID,alc.get(alc.size()-1));
		BankCust=new Account(CustomerName,Address,Email,alatm.get(alatm.size()-1),alc.get(alc.size()-1)); 
		
		return alc;
	}
	
	public void display(ArrayList<Account> alc,ArrayList<SavingsAccount> alsa)
	{
		System.out.println("========================================");
		for(int i=0;i<alc.size();i++)
		{
			System.out.println("Customer Name : "+albc.get(i).getCustomerName());
			System.out.println("Customer Address : "+albc.get(i).getAddress());
			System.out.println("Customer Email : "+albc.get(i).getEmail());
			System.out.println("Customer Account Number : "+alc.get(i).getAccountNumber());
			System.out.println("Customer Balance : "+alc.get(i).getBalance());
			System.out.println("Balance (Interest included) : "+alsa.get(i).getBal());
			System.out.println("Customer PIN : "+alatm.get(i).getPIN());
			System.out.println("Customer CardID : "+alatm.get(i).getCardID());
			System.out.println("========================================");
		}
	}
	public void displayById(ArrayList<Account> alc,int id)
	{
		System.out.println("========================================");
		for(int i=0;i<alc.size();i++)
		{
			if(alc.get(i).getAccountNumber()==id)
			{
				System.out.println("Customer Name : "+albc.get(i).getCustomerName());
				System.out.println("Customer Address : "+albc.get(i).getAddress());
				System.out.println("Customer Email : "+albc.get(i).getEmail());
				System.out.println("Customer Account Number : "+alc.get(i).getAccountNumber());
				System.out.println("========================================");
				break;
			}
			
		}
	}
	public void updateById(ArrayList<Account> alc, ArrayList<BankCustomer> albc, ArrayList<ATMCard> alatm, int id) 
	{
		for(int j=0;j<alc.size();j++)
		{
			if(alc.get(j).getAccountNumber()==id)
			{
				System.out.println("Enter which one you want to edit : ");
				System.out.println("1. Customer Name\t2. Address\t3. Email\t4. PIN\t5. CardID");
				ch=sc.nextInt();
				sc.nextLine();
				switch(ch)
				{
					case 1 : 	System.out.println("Current Name : "+albc.get(j).getCustomerName());
								while(true)
								{
									System.out.print("Enter New Name : ");
									try
									{
										CustomerName=sc.nextLine();
										if(!CustomerName.isEmpty())
										{
											int count=0,ch;
											for(int i=0;i<CustomerName.length();i++)
											{
												ch=(int)CustomerName.charAt(i);
												if((ch>=65&&ch<=90) || (ch>=97 && ch<=122))
												{
													count++;
												}
											}
											boolean check=(count==CustomerName.length());
											if(!check)
											{
												throw new InvalidNameException("ERROR => Name must contain only alphabets");
											}
											else
											{
												
												break;
											}
										}
										else
										{
											throw new InvalidNameException("ERROR => Name Not Inserted");
										}
									}
									catch(InvalidNameException n)
									{
										System.out.println(n.getMessage());
										continue;
									}
								}
								albc.get(j).setCustomerName(CustomerName);
							 	break;
					case 2 : 	System.out.println("Current Address : "+albc.get(j).getAddress());
								while(true)
								{
									System.out.print("Enter New Address : ");
									
									try
									{
										Address=sc.nextLine();
										if(Address.isEmpty())
										{
											throw new InvalidAddressException("ERROR => Address not inserted");
										}
										else
										{
											break;
										}
									}
									catch(InvalidAddressException n)
									{
										System.out.println(n.getMessage());
										continue;
									}
								}
								
							 	albc.get(j).setAddress(Address);
							 	break;
					case 3 : 	System.out.println("Current Email ID : "+albc.get(j).getEmail());
								while(true)
								{
									System.out.print("Enter New Email ID : ");
									try
									{
										Email=sc.nextLine();
										if(!Email.isEmpty())
										{
											boolean check=Pattern.matches("^[a-zA-Z0-9._-]+@(.+)+\\.(.+)$",Email);
											if(!check)
											{
												throw new InvalidEmailException("ERROR => should be in the format xyz@abc.cde and can include '.','_','-'");
											}
											else
											{
												break;
											}
										}
										else
										{
											throw new InvalidEmailException("ERROR => Email not inserted");
										}
										
									}
									catch (InvalidEmailException e)
									{
										System.out.println(e.getMessage());
										continue;
									}
								}
							 	albc.get(j).setEmail(Email);
							 	break;
					case 4 : 	System.out.println("Current PIN : "+alatm.get(j).getPIN());
								while(true)
								{
									System.out.print("Enter New PIN : ");
									try
									{
										PIN=sc.nextInt();
										String pinstr=""+PIN;
										if(!pinstr.isEmpty())
										{
											boolean check=Pattern.matches("^[0-9]{3}$",pinstr);
											if(!check)
											{
												throw new InvalidPINException("ERROR => PIN should be a 3 digit number");
											}
											else
											{
												break;
											}
										}
										else
										{
											throw new InvalidPINException("ERROR => PIN not inserted");
										}
									}
									catch (InvalidPINException e)
									{
										System.out.println(e.getMessage());
										continue;
									}
								}
							 	alatm.get(j).setPIN(PIN);
							 	break;
					case 5 : 	System.out.println("Current Card ID : "+alatm.get(j).getCardID());
								while(true)
								{
									System.out.print("Enter Card ID : ");
									try
									{
										CardID=sc.nextLong();
										String idstr=""+CardID;
										if(!idstr.isEmpty())
										{
											boolean check=Pattern.matches("^[0-9]{4}$",idstr);
											if(!check)
											{
												throw new InvalidCardIDException("ERROR => Card ID should be a 4 digit number");
											}
											else
											{
												break;
											}
										}
										else
										{
											throw new InvalidCardIDException("ERROR => Card ID not inserted");
										}
									}
									catch (InvalidCardIDException e)
									{
										System.out.println(e.getMessage());
										continue;
									}
								}
							 	alatm.get(j).setCardID(CardID);
							 	break;
					default : 	System.out.println("Wrong Choice");
							 	break;
				}
			}
		}
	}
}
