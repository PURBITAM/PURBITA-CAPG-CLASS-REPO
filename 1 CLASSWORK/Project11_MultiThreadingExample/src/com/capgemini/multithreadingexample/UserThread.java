package com.capgemini.multithreadingexample;

public class UserThread extends Thread 
{
	//to assign a action or a task to a thread
	public void run()
	{
		System.out.println("Thread is in running state");
		for(int i=1;i<10;i++)
		{
			try
			{
				Thread.sleep(500);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		UserThread ut=new UserThread();
		ut.setName("purbita");
		ut.start();
		try
		{
			ut.join();
			System.out.println("Thread id : "+ut.getId());
			System.out.println("Thread Name : "+ut.getName());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		UserThread ut1=new UserThread();
		ut1.start();
		System.out.println("Thread id : "+ut.getId());
		System.out.println("Thread Name : "+ut.getName());
		//ut.sleep(3000);
		System.out.println("sleep is done");
		//ut.run();
	}
}
