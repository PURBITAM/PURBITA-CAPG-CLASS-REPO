package com.capgemini.concurrency.executorexample;

public class RunnableTwo implements Runnable{
	
	public void run()
	{
		while(true)
		{
			System.out.println("Executing task two");
			try
			{
				Thread.sleep(10000);
			}
			catch(Throwable e)
			{
				e.printStackTrace();
			}
			//Thread.stop();
		}
	}
}
