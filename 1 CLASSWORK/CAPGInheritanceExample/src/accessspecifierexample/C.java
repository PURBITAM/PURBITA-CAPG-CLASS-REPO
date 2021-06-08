package accessspecifierexample;

public class C extends A
{
	public void callMethodOfAFromC()
	{
		A a=new A();
		a.methodOne();//public
		a.methodTwo();//default
		a.methodThree();//protected
	}
}
