package com.capgemini.concurrency.executorexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutorFramework {

	private static ExecutorService executor=null;
	private static volatile Future taskOneOutput=null;
	private static volatile Future taskTwoOutput=null;
	public static void main(String[] args) {
		executor=Executors.newFixedThreadPool(2);
		while(true)
		{
			try
			{
				checkTasks();
				Thread.sleep(10000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Caught Exception = "+e.getMessage());
			}
		}

	}
	private static void checkTasks() throws Exception
	{
		if(taskOneOutput == null || taskOneOutput.isDone()||taskOneOutput.isCancelled())
		{
			taskOneOutput=executor.submit(new RunnableOne());
			//taskOneOutput.cancel(true);
		}
		if(taskTwoOutput == null || taskTwoOutput.isDone()||taskTwoOutput.isCancelled())
		{
			taskTwoOutput=executor.submit(new RunnableTwo());
		}
	}

}
