package com.capgemini.concurrency.executorexample;

public class RunnableThree {
	public void run()
	{
		while(true)
		{
			System.out.println("Executing task three");
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
