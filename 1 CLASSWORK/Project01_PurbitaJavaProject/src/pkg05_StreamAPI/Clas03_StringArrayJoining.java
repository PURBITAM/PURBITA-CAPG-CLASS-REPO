package pkg05_StreamAPI;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Clas03_StringArrayJoining {
	
	public static void main(String[] args) {
		String[] strarr= {"Purbita","Radha","Ankush","Mohit"};
		System.out.println("String array joining : ");
		String strJoined=Arrays.asList(strarr)
								.stream()
								.collect(Collectors.joining(","));
		System.out.println(strJoined);
		System.out.println();
		String str1=Arrays.toString(strarr);
		System.out.println(str1);
	}
}
