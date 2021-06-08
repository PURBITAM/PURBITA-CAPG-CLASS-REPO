package maxnumber.max;
import java.util.Scanner;
class greatestnumberhandson
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a: ");
		int a=sc.nextInt();
		System.out.println("enter value of b: ");
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.print(a);
		}
		else
		{
			System.out.print(b);
		}
	}
}