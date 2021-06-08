package stringexamples;

import java.util.Scanner;

public class StringMethods 
{
	public static void main(String[] args) {
		String s="A friend in need is a friend indeed";
//=======================================================================
		char ch=s.charAt(6);
		System.out.println("Character at index 6 : "+ch);
//=======================================================================
		String str=s.substring(8);
		System.out.println("Substring extracted from 8th index : "+str);
//=======================================================================
		String str1=s.substring(8,16);
		System.out.println("Substring extracted from 8th index to 16th index : "+str1);
//=======================================================================		
		CharSequence str2=s.subSequence(8,16);
		System.out.println("CharSequence extracted from 8th index 16th index : "+str2);
		//================================================================
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
//========================================================================
		char strchars[]=s.toCharArray();
		for(int i=0;i<strchars.length;i++)
		{
			System.out.print(strchars[i]);
		}
		System.out.println();
//========================================================================	
		String[] words=s.split(" ");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
//========================================================================	
		System.out.println(s.length());
//========================================================================	
		String s1="        A friend in need is a friend indeed        ";
		System.out.println(s1.trim());
//========================================================================
		System.out.println("enter the character to read : ");
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().trim().charAt(0);
		System.out.println("entered character : "+ch1);
//================================to compare two strings==================
		System.out.println(s.equals(s1.trim()));
//========================================================================
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareToIgnoreCase(s1));
//========================================================================
		System.out.println(s.indexOf('e'));
		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.indexOf('e',10));
//========================================================================
		System.out.println(s.contains("in")); //boolean
//========================================================================
		System.out.println(s.startsWith("A"));
		System.out.println(s.endsWith("deed"));
//========================================================================
		System.out.println(s.codePointAt(0)); //ascii of char at index 0
		System.out.println(s.contentEquals(s1.trim()));
//========================================================================
		System.out.println(s.codePointBefore(1));
//========================================================================
		System.out.println(s.codePointCount(0,6));		
//========================================================================
		String st=s.replaceAll("e", "____");
		System.out.println(st);
	}
	

	
}
