package constructorChainingExamples;

public class Student 
{
	private int stdId;			//variables or data members or instance variables
	private String stdName;		//instance variable of current class
	private float marks;
	
	public Student()	//default constructor
	{
		this(1,"Rama",85);  //this calls parameterized constructor of the same class
		System.out.println("its a default constructor");
	}

	public Student(int stdId, String stdName, float marks) //Parameterized constructor
	{
		//this(); //this calls default constructor of the same class
		//note constructor call ('this()' statement) should be the first statement;
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
	}
}
