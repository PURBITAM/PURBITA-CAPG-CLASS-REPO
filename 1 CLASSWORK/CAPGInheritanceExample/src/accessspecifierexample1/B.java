package accessspecifierexample1;

import accessspecifierexample.A;

public class B 
{
	public void callMethodOfAFromB()
	{
		A a=new A();
		a.methodOne();//public
	}
}
