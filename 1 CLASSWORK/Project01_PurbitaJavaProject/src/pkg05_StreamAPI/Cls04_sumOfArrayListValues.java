package pkg05_StreamAPI;

import java.util.*;
import java.util.stream.IntStream;
public class Cls04_sumOfArrayListValues {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6};
		Integer sumval=IntStream.of(arr).sum();
		
		
//		List<Integer> al=Arrays.asList(1,2,3,4,5,6);
//		
//		Integer sumval1=al.stream()
//						 .mapToInt(i->i)
//						 .sum();
//		System.out.println(sumval1);
		
		ArrayList<String> al = new ArrayList<>();
		  
		//al.add("Geeks");
        al.add("Geeks1");
        al.add("Geeks");
        al.add("For");
        al.add("Geeks");
  
        System.out.println(
            "Initial ArrayList " + al);
  
        //al.remove(1);
  
        System.out.println(
            "After the Index Removal " + al);
  
        al.remove("Geeks");
  
        System.out.println(
            "After the Object Removal " + al);
	}

}
