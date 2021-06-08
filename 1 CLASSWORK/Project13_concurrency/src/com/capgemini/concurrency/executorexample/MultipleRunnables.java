package com.capgemini.concurrency.executorexample;

import java.util.List;

public class MultipleRunnables implements Runnable{
	
	public final List<Runnable> runnables;
	public MultipleRunnables(List<Runnable> runnables)
	{
		this.runnables=runnables;
	}
	
	public void run()
	{
		for(Runnable runnable:runnables)
		{
			new Thread(runnable).start();
		}
	}
}
