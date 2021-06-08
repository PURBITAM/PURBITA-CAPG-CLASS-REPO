package com.capgemini.ems;

import java.util.Scanner;

public class Employee 
{
	private int empId;
	private String empName;
	
	public Employee()
	{
		super();
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void displayEmpDetails(Employee[] emp) {
		for(int i=0;i<emp.length;i++) {
			System.out.println("empId = "+emp[i].empId+" Emp name = "+emp[i].empName);
			System.out.println();
		}
	}
	
	public void displayEmpDetails(Employee emp) {
		System.out.println("empId = "+empId+" Emp name = "+empName);
		System.out.println();
	}
	
	public void findEmployeeById(Employee[] emp,int id)
	{
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].getEmpId()==id)
			{
				System.out.println("Employee found at : "+i);
				System.out.println("empId = "+emp[i].empId+" Emp name = "+emp[i].empName);
			}
			else
			{
				System.out.println("No employee found");
			}
		}
	}
	
//	Scanner sc=new Scanner(System.in);
//	public Employee[] createEmployeeList()
//	{
//		Employee[] empList1=new Employee[3];
//		for(int i=0;i<empList1.length;i++)
//		{
//			System.out.println("Enter the Employee details for "+i+" emp object");
//			
//			//empList1[i]=new Employee(sc.nextInt(),sc.nextLine());
//			
//			//OR
//			
//			empList1[i]=new Employee();
//			empList1[i].setEmpId(sc.nextInt());
//			sc.nextLine();
//			empList1[i].setEmpName(sc.nextLine());
//		}
//		return empList1;
//	}
	
	//creating the list of employees using array and returning an array
	   Scanner sc = new Scanner(System.in);
	   Employee[] empList1 = new Employee[3];
	   
	public Employee[] createEmpList() {
		   for(int i=0;i<empList1.length;i++) {
			   System.out.println("Enter the employee details for  "+ i + " emp object");
			   empList1[i] = new Employee();
			   empList1[i].setEmpId(sc.nextInt());
			   empList1[i].setEmpName(sc.next());
		   }
		   return empList1;
	}

	//find an employee by id
	public void updateEmployeeById(Employee[] emp,int id) {
		for(int i=0;i<emp.length;i++) {
			if(emp[i].getEmpId() == id)
			{
				System.out.println("employee found at " + i);
				System.out.println("Enter new name to update for the employee");
				String updatedname=sc.next();
				emp[i].setEmpName(updatedname);
				System.out.println("empId = " + emp[i].getEmpId() + "Emp name = " + emp[i].getEmpName());
				break;
			}else {
				System.out.println("No employee found");
			}
		}
		System.out.println();
	}
	
	//delete an employee by id
		public Employee[] deleteEmployeeById(Employee[] emp,int id) {
			int originalLength = emp.length;
			for(int i=0;i<originalLength;i++) {
				if(emp[i].getEmpId() == id)
				{
					System.out.println("employee found at " + i);
					emp[i] = emp[originalLength-1];
					originalLength--;
					break;
				}else {
					System.out.println("No employee found");
				}
			}
			System.out.println();
			return emp;
		}
}
