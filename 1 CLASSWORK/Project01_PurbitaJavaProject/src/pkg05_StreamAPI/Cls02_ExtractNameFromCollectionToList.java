package pkg05_StreamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Cls02_ExtractNameFromCollectionToList {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("Purbita",20));
		al.add(new Employee("Radha",12));
		al.add(new Employee("Ankush",18));
		System.out.println("Employee Details : ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getName()+" "+al.get(i).getAge());
		}
		ArrayList<String> listOfNames=(ArrayList<String>) al.stream()
										.map(Employee::getName)
										.collect(Collectors.toList());
		System.out.println();
		System.out.println("Employee Name : ");
		String strJoined=(String) al.stream()
							.map(Employee::getName)
							.collect(Collectors.joining(", "));
		System.out.println(strJoined);
	}

}
