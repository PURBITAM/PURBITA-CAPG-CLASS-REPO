package superExamples;

public class Student 
{
	private int stdId;			//variables or data members or instance variables
	private String stdName;		//instance variable of current class
	public float marks;
	
	public Student()	//default constructor
	{
		System.out.println("its a default constructor");
	}

	public Student(int stdId, String stdName, float marks) //parameterised constructor
	{
		super(); //object is the super class for all the classes
		System.out.println("its a parameterised constructor");
		this.stdId = stdId;
		this.stdName = stdName;
		this.marks = marks;
		
	}
	
	public void printStudentValues()
	{
		
		System.out.println("Student Details : ");
		System.out.println("Student ID : "+stdId);
		System.out.println("Student Name : "+stdName);
		System.out.println("Student Marks : "+marks);
		this.displayResult();
	}
	
	public void displayResult()
	{
		if(marks>75){System.out.println("Distinction");}
		else if((marks>=60)&&(marks<75)){System.out.println("First Class");}
		else{System.out.println("pass");}
	}
}
