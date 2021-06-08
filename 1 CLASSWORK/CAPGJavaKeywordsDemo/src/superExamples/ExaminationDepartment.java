package superExamples;

public class ExaminationDepartment extends Student
{
	public ExaminationDepartment()
	{
		super(128,"Sri",97); //this calls super class param constructor
		System.out.println("Examination department default constructor");
	}
	public void checkExamFeePayment()
	{
		System.out.println("checkExamFeePayment");
		super.marks=56;//accessing super class instance variable using super keyword
		super.displayResult();
	}
}
