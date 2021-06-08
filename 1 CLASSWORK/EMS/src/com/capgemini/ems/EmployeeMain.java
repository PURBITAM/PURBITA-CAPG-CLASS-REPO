package com.capgemini.ems;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring an array of employee
		Employee[] empList;
		
		//allocating the memory for 3 employee objects
		empList = new Employee[3];
		
		//Employee[] empList = new Employee[3];
		
		//Initializing the first array element with empObject
		empList[0]=new Employee(1234,"Rama");
		empList[1]=new Employee(1235,"Ramana");
		empList[2]=new Employee(1236,"Ramji");
		
		System.out.println(empList[0].hashCode());
		System.out.println(empList[1].getEmpId());
		
		Employee emp = new Employee();
		   Employee[] empList1 = new Employee[3];
		   Scanner sc = new Scanner(System.in);
		   empList1 =  emp.createEmpList();

		   
		
			  //displayEmpDetails with employee[] object as argument is called
			  System.out.println("Out put from displayEmpDetails with employee[] object as argument ");
		  emp.displayEmpDetails(empList1);
		  
		  Employee emp2 = new Employee();
		  emp2.setEmpId(120005);
		  emp2.setEmpName("Ramji");
		  System.out.println("Out put from displayEmpDetails with employee object as argument ");
		  //displayEmpDetails with employee object as argument is called
		  emp.displayEmpDetails(emp2);
		   
		  //call find by employee by id
		  System.out.println("Enter the empid to find an employee");
		  int id = sc.nextInt();
		  emp.findEmployeeById(empList1, id);
		  
		  
		  //call update by employee by id
		  System.out.println("Enter the empid to update an employee details");
		  int eid = sc.nextInt();
		  emp.updateEmployeeById(empList1, eid);
		  
		  //call delete by employee by id
		  System.out.println("Enter the empid to delete an employee details");
		  int did = sc.nextInt();
		  emp.deleteEmployeeById(empList1, did);
		 
		   
//		Employee[] empList1 = new Employee[3];
//		Scanner sc=new Scanner(System.in);
//		Employee emp = new Employee();
//		empList1=emp.createEmployeeList(empList1);
//
//		Employee emp=new Employee();
//		//displayEmployeeDetails with employee[] object as argument is called
//		emp.displayEmpDetails(empList1);
//		
//		Employee emp2=new Employee();
//		emp.setEmpId(1200005);
//		emp.setEmpName("Ramji");
//		//displayEmployeeDetails with employee object as argument is called
//		emp.displayEmpDetails(emp2);
//		
//		//call findEmployeeById
//		emp.findEmployeeById(empList1, 123);
	}

}
