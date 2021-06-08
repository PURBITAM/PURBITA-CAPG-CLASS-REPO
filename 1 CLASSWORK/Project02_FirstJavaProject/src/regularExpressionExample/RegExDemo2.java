package regularExpressionExample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println(Pattern.matches(".s","as"));
//		String s="Thisisastring123";
//		String s1="z";
//		int len=s.length();
//		System.out.println(Pattern.matches("[^abc]", s1));
//		System.out.println(Pattern.matches("[a-zA-Z0-9]{16}", s));
//		System.out.println();
		
//		System.out.print("enter mobile no : ");
//		String mno=sc.next();
//		boolean result=Pattern.matches("[789]{1}[0-9]{9}", mno);
//		System.out.println("mobile no is "+result);
//		boolean result1=Pattern.matches("[789]{1}\\d{9}", mno);
//		System.out.println("result using metacharacters = "+result1);
//		System.out.println();
		
//		System.out.println("Enter the email : ");
//		String email=sc.next();
//		String regexEmail="^(.+)@(.+)$";
//		Pattern pattern=Pattern.compile(regexEmail);
//		Matcher matcher=pattern.matcher(email);
//		boolean b=matcher.matches();
//		System.out.println(b);
//		System.out.println();
		
		System.out.println("adding more restricions to email : ");
		System.out.println("Enter the email : ");
		String email2=sc.next();
		String regexEmail2="^[a-zA-Z0-9+_.-]+@(.+)+\\.(.+)$";
		Pattern pattern2=Pattern.compile(regexEmail2);
		Matcher matcher2=pattern2.matcher(email2);
		boolean b2=matcher2.matches();
		System.out.println(b2);
		System.out.println();
//		
//		System.out.println("Enter the password : ");
//		String pwd=sc.next();
//		System.out.println(Pattern.matches("[a-zA-Z0-9]{8,}", pwd));
//		
	
	}

}
