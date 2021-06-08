package regularExpressionExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Burn your ego before it burns you";
		//String str="as";
		Pattern p = Pattern.compile("ego",Pattern.CASE_INSENSITIVE); //'.' represents single character
		Matcher m=p.matcher(str);
		boolean result=m.find();
		if(result)
		{
			System.out.println("Pattern matched");
		}
		else
		{
			System.out.println("Pattern not matched");
		}
		
	}

}
