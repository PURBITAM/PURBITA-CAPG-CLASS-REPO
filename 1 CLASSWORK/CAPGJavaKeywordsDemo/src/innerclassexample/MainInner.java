package innerclassexample;

public class MainInner 
{
	public static void main(String[] args) 
	{
		//creating object for non-static inner class
//		OuterClass outcls=new OuterClass();   //first create object for outer class
//		OuterClass.InnerClass inncls=outcls.new InnerClass();  // using the outer class object, create an object for inner class
//		inncls.printValue();
		
		//creating object for static inner class
		OuterClass.InnerClass inncls=new OuterClass.InnerClass();
		inncls.printValue();
	}
}
