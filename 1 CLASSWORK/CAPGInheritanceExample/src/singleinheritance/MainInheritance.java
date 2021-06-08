package singleinheritance;

import java.text.ParseException;

public class MainInheritance 
{
	public static void main(String[] args) throws ParseException
	{
		Employee e=new Employee();
		//e.addEmployee();
		//e.displayEmployeeDetails();
		
		HRDepartment hrd= new HRDepartment();
		hrd.addEmployee();
		hrd.displayEmployeeDetails();
		hrd.readLeaveDays();
		hrd.showLeaveDays();
	}
}
