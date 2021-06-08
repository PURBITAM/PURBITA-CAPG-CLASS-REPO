package multilevelinheritance;

import java.text.ParseException;

public class MainInheritance 
{
	public static void main(String[] args) throws ParseException
	{
		Employee e=new Employee();
		//e.addEmployee();
		//e.displayEmployeeDetails();
		
		AccountsDepartment ad= new AccountsDepartment();
		ad.addEmployee();
		ad.displayEmployeeDetails();
		ad.readLeaveDays();
		ad.showLeaveDays();
		ad.calculateSalary();
	}
}
