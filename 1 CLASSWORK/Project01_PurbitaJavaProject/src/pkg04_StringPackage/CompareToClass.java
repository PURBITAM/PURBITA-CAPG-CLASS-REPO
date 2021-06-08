package pkg04_StringPackage;

public class CompareToClass {

	public static void main(String[] args) 
	{
		String str1="hello";
		String str2="Hello";
		System.out.println(str1.compareTo(str2));
		
		String str3="Helloa";
		String str4="Hello";
		System.out.println(str3.compareTo(str4)); //length of string, since rest are same
	}

}
