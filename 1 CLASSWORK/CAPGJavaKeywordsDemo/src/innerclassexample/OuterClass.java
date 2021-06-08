package innerclassexample;

//non-static inner class or nested class
public class OuterClass 
{
	private int a = 30;
	
	private void displayMessage()
	{
		System.out.println("in outer class private method");
	}
	static class InnerClass 
	{
		void printValue() 
		{
			System.out.println("static inner class");
//			System.out.println("Value is : " + a);
//			displayMessage();
		}
	}
}
