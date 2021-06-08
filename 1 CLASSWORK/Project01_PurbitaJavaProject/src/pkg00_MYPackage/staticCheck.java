package pkg00_MYPackage;

public class staticCheck {

	static int a;
	final int b;
	static final int c;
	static
	{
		c=70;
	}
	public staticCheck() {
		// TODO Auto-generated constructor stub
		b=90;
	}
	public static void display()
	{
		System.out.println("hii"+a);
	}

	public static void display1()
	{

		a=80;
	}
	public static void main(String[] args) 
	{
		display1();
		display();
	}

}
