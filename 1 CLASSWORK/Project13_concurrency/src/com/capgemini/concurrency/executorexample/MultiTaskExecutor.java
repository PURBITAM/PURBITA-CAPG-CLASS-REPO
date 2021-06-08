package com.capgemini.concurrency.executorexample;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultiTaskExecutor {

	public static void main(String[] args) {
		
		BlockingQueue<Runnable> worksQueue=new ArrayBlockingQueue<Runnable>(10);
		RejectedExecutionHandlerImpl rejectionHandler=new RejectedExecutionHandlerImpl();
		ThreadPoolExecutor executor=new ThreadPoolExecutor(3, 3, 10,TimeUnit.SECONDS, worksQueue);
		
	}

}
