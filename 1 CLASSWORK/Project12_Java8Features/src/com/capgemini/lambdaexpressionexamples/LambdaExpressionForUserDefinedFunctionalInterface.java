package com.capgemini.lambdaexpressionexamples;

import java.util.function.Predicate;

public class LambdaExpressionForUserDefinedFunctionalInterface {
	public static void main(String[] args) {

//Lambda Function
		Addition ad=()->{
			System.out.print("Addition : ");
			return (55+65);
		};
		System.out.println(ad.add());
		
//Lambda with return type
		Substraction s=()->{return (65-55);};
		int result = s.sub();
		System.out.println("Substraction : 65-55="+result);
		
//Lambda with return type and one parameter
		Message msg=(String m)->{return ("Message : hello from Lambda"+m);};
		String retmsg=msg.printMessage("-> parameter message");
		System.out.println(retmsg);
		
//Lambda with return type and two parameters
		MultiplicationUsingTwoParameters m=(int a,int b)->{
			System.out.println("Muliplication of two parameters,passed : "+(a*b));
		};
		m.mul(4,5);
		
		
		
//Lambda expression for Predicate interface in java.util.function package
		Predicate<Integer> greater= age->(age>18);
		//calling Predicate Method
		System.out.println(greater.test(20));
		
		Predicate<Integer> lesser= age->(age<18);	
		//calling Predicate Method
		System.out.println(lesser.test(20));
		
		//a.and(b) => AND operation
		//a.or(b) => OR operation
		//a.negate() => NOT operation
		
		boolean checkAge=greater.and(lesser).negate().test(25);
		System.out.println(checkAge);
		
		//calling a method with predicate parameter
		predicateInMethod(14, age->(age>18));
		
	}
	
	static void predicateInMethod(int number, Predicate<Integer> age)
	{
		if(age.test(number))
		{
			System.out.println("Age = "+number);
		}
		else
		{
			System.out.println("Age not satisfied = "+number);
		}
	}
}
