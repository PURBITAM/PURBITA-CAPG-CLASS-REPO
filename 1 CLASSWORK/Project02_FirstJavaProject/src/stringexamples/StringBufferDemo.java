package stringexamples;

import java.util.Scanner;

public class StringBufferDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter the sequence : ");
		str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append(" is a done using StringBuffer");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		System.out.println("instanceof : "+(sb instanceof StringBuffer));
		System.out.println("StringBuffer to String : "+sb.toString());
		String sbstr=new String(sb);
		System.out.println("instanceof : "+(sbstr instanceof String));
		System.out.println(sb.insert(4,"__"));
	}

}
