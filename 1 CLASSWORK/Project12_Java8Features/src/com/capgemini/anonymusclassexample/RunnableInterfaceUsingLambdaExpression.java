package com.capgemini.anonymusclassexample;

public class RunnableInterfaceUsingLambdaExpression {

	public static void main(String[] args) {
		//implementing Runnable interface interface using Lambda Expression
		Runnable runnable1 = () -> {
										System.out.println("run method using lambda expression");
										System.out.println("Run method in anonymous class");
									};
		Thread th= new Thread(runnable1);
		th.start();
		
		new Thread(new Runnable() {

									@Override
									public void run() {
										// TODO Auto-generated method stub
										System.out.println("Implementation of runnable functional interface using anonymous class");
										System.out.println("Run method in anonymous class");
									}
									
								});
		
	}
}
