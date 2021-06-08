package stringexamples;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String...args) //java 8 main method signature
	{
		// TODO Auto-generated method stub
		StringJoiner joinWords=new StringJoiner(",","prefix "," suffix ");
		joinWords.add("this");
		joinWords.add("is");
		joinWords.add("a");
		joinWords.add("string");
		System.out.println(joinWords);
		StringJoiner joinWords1=new StringJoiner(",");
		joinWords1.add("this");
		joinWords1.add("is");
		joinWords1.add("a");
		joinWords1.add("string");
//		StringJoiner joinWordsM=joinWords.merge(joinWords);
//		System.out.println(joinWordsM);
		
		StringJoiner joinWordsM2=joinWords1.merge(joinWords);
		System.out.println(joinWordsM2);
		
		StringJoiner joinWordsM1=joinWords.merge(joinWords);
		System.out.println(joinWordsM1);
	}

}
