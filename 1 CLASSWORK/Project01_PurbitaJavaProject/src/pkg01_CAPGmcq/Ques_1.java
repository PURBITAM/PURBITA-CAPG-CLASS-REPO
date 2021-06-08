package pkg01_CAPGmcq;

import java.util.HashMap;
import java.util.TreeMap;

public class Ques_1 
{
	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(80, "pgs");
		h.put( 34, null);
		h.put(null, null);
		h.put(null, "sd");
		h.put(null, "sd1");
		System.out.println(h);
		TreeMap<Integer,String> h1=new TreeMap<Integer,String>();
		h1.put(80, "pgs");
		h1.put( 34, "null");
		h1.put(null, null);
		h1.put(null, "sd");
		System.out.println(h);
		}
}
