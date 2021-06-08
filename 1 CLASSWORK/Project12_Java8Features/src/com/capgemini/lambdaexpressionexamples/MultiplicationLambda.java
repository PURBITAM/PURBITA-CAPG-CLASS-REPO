package com.capgemini.lambdaexpressionexamples;

public class MultiplicationLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplication m1 = null;
		Multiplication m=()->{
			System.out.println("Multiplication : "+(m1.a*m1.b));
		};
		m.mul();
	}

}
