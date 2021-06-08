package accessspecifierexample1;

import accessspecifierexample.A;

public class D extends A
{
	public void callMethodsOfA()
	{
		methodOne(); //public
		methodThree(); //protected
	}
}
