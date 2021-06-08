package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastExamples {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Rama");
		names.add("Rama1");
		names.add("Ramaji");
		names.add("Ram");
		names.add("Raamaa");
		
		try
		{
			//printing the value of the arraylist
			System.out.println("Name in the ArrayList : ");
			Iterator<String> itr=names.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
				System.out.println("adding an element in between the iteration");
				names.add("Krishna");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block");
		}
		
		//using CopyOnWriteArrayList to avoid ConcurrentModificationException
		CopyOnWriteArrayList<String> names1=new CopyOnWriteArrayList<String>();
		names1.add("Rama");
		names1.add("Rama1");
		names1.add("Ramaji");
		names1.add("Ram");
		names1.add("Raamaa");
		try
		{
			//printing the value of the arraylist
			System.out.println("Name in the ArrayList : ");
			Iterator<String> itr=names1.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
				System.out.println("adding an element in between the iteration");
				names1.add("Krishna");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("-----------------------------------------------------------");
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
