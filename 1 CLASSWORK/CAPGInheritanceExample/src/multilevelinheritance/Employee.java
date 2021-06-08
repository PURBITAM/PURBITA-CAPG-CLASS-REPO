package multilevelinheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee 
{
	private int empId;
	private String empName;
	private String empDob;
	private String empDoj;
	public float empSalary;
	Scanner sc=new Scanner(System.in);
	Date dob=new Date();
	Date doj=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	/*
	 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-yyyy"); 
	 SimpleDateFormat sdf=new SimpleDateFormat("MM dd,yyyy");
	 */
	public void addEmployee() throws ParseException
	{
		System.out.println("Enter employee details");
		System.out.println("Enter employee id");
		empId=sc.nextInt();
		System.out.println("Enter employee name");
		sc.nextLine();
		empName=sc.nextLine();
		System.out.println("Enter employee DOB (dd/MM/yyyy)");
		empDob=sc.next();
		dob=convertStringToDate(empDob);
		System.out.println("Enter employee DOJ (dd/MM/yyyy)");
		empDoj=sc.next();
		doj=convertStringToDate(empDoj);
		System.out.println("Enter employee salary");
		empSalary=sc.nextFloat();
	}
	
	public void displayEmployeeDetails() throws ParseException
	{
		System.out.println("Employee Details are : ");
		System.out.println("Employee id : "+empId);
		System.out.println("Employee name : "+empName);
		System.out.println("Employee DOB : "+empDob);
		System.out.println("Employee DOJ : "+empDoj);
		System.out.println("Employee Salary : "+empSalary);
	}
	
	public Date convertStringToDate(String date) throws ParseException
	{
		Date stringToDate=sdf.parse(date);
		return stringToDate;
	}
	
	public float showSalary()
	{
		return empSalary;
	}
	
	
}
