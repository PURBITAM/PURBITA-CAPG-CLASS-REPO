package pkg05_StreamAPI;

import java.util.ArrayList;

class Employee
{
	String name;
	int age;
	
	public Employee() {
		super();
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}	
}

public class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("Purbita",20));
		al.add(new Employee("Radha",12));
		al.add(new Employee("Ankush",18));
		
		ArrayList<Employee> alcpy=new ArrayList<>(al); //copy al->alcpy
		
		alcpy.sort((e1,e2)->(e1.getName().compareTo(e2.getName()))); //sorting
		
		for(int i=0;i<alcpy.size();i++)
		{
			System.out.println(alcpy.get(i).getName()+" "+alcpy.get(i).getAge());
		}
	}
}
