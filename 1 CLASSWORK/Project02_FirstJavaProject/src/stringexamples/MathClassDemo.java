package stringexamples;

import java.util.Scanner;

public class MathClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number : ");
		int num=sc.nextInt();
		System.out.println("Math.cbrt(num): "+Math.cbrt(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.PI);
		System.out.println(Math.abs(num));
		System.out.println("enter float number");
		float num1=sc.nextFloat();
		System.out.println("floor value: "+Math.floor(num1));
		System.out.println("ceil value: "+Math.ceil(num1));
		System.out.println(Math.cos(num1));
		System.out.println(Math.sin(num1));
	}

}
