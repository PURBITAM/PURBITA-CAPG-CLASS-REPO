package pkg00_MYPackage;

public class Stringcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
        String str1="",str2="";
        int n=0,l=0;
		String string1="worldhii";
		String string2="world";
		String operator="-";
		if(operator.equals("+"))
	      {
	        str=string1+string2;
	      }
	      else if(operator.equals("-"))
	      {
			if(string1.length()>string2.length())
	        {
	            n=string1.indexOf(string2);
	            str1=string1;
	            str2=string2;
	        }
	        else if(string1.length()<string2.length())
	        {
	            n=string2.indexOf(string1);
	            str1=string2;
	            str2=string1;
	        }
	        if(n==0)
	        {
	            l=str2.length();
	            str=str1.substring(l);
	        }
	        else
	        {
	            l=0;
	            str=str1.substring(l,n);
	        }
	      }
        System.out.println(str);
	}

}
