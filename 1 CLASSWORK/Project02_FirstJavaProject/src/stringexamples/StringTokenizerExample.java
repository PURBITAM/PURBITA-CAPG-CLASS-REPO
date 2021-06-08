package stringexamples;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="This is a String in java";
			StringTokenizer st=new StringTokenizer(s);
			while(st.hasMoreTokens())
			{
				System.out.println(st.nextToken(" "));
			}
			String s1="This is a";
			String s2=" String";
			System.out.println(s1.concat(s2));
		}

}
