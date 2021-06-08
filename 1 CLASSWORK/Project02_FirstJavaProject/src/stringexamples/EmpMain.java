package stringexamples;

public class EmpMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e=new Employee();
		System.out.println("e hashcode : "+e.hashCode());
		Employee e1=new Employee();
		System.out.println("e1 hashcode : "+e1.hashCode());
		e.readEmpDetails();
		e.printEmpDetails();
		e1.readEmpDetails();
		e1.printEmpDetails();
		Employee e3=new Employee();
		System.out.println("e3 hashcode : "+e3.hashCode());
		e3=e1; //e3 will show the same hashcode as e1 since e3 is also now pointing to e1's location
		System.out.println("(e3<-e1) e3 hashcode : "+e3.hashCode());
	}

}
