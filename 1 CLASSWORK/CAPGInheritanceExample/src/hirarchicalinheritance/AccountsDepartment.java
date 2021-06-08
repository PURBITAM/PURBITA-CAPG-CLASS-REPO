package hirarchicalinheritance;

public class AccountsDepartment extends HRDepartment
{
	int noOfSalaryDays;
	public void calculateSalary()
	{
		noOfSalaryDays=showNoOfWorkingDays();
		float sal=showSalary();
		float salPerDay=sal/30;
		float totalSalPerMonth=salPerDay*noOfSalaryDays;
		System.out.println("Salary credited"+totalSalPerMonth);
	}
}
