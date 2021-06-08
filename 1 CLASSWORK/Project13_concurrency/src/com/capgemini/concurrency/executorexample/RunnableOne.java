package com.capgemini.concurrency.executorexample;

public class RunnableOne implements Runnable{
	
	public void run()
	{
		while(true)
		{
			System.out.println("Executing task one");
			try
			{
				Thread.sleep(10000);
			}
			catch(Throwable e)
			{
				e.printStackTrace();
			}
		}
	}
}
