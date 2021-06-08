package multilevelinheritance;

public class HRDepartment extends Employee
{
	private int noofWorkingDays=30;
	private int leaveDays;
	
	public void readLeaveDays()
	{
		System.out.println("Enter no of days : ");
		leaveDays=sc.nextInt();
	}
	
	public int showLeaveDays()
	{
		System.out.println("No of days leave = "+leaveDays);
		return leaveDays;
	}
	
	public int showNoOfWorkingDays()
	{
		System.out.println("No of days leave = "+leaveDays);
		return leaveDays;
	}
}
