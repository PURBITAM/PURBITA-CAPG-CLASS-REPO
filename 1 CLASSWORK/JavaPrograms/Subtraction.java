package day2arithmeticop;
import java.util.Scanner;
public class Subtraction
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a: ");
		int a=sc.nextInt();
		System.out.println("enter value of b: ");
		int b=sc.nextInt();
		System.out.print(a-b);
	}
}

/*
D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms>javac -d . Subtraction.java
'javac' is not recognized as an internal or external command,
operable program or batch file.

D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms>set path=C:\Program Files\Java\jdk1.8.0_281\bin

D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms>javac -d . Subtraction.java
Subtraction.java:3: error: class Substraction is public, should be declared in a file named Substraction.java
public class Substraction
       ^
1 error

D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms>javac -d . Subtraction.java

D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms>cd day2arithmeticoperations

D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms\day2arithmeticoperations>cd..

D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms>javac -d . Subtraction.java

D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms>java arithmeticop.Subtraction.java
Error: Could not find or load main class arithmeticop.Subtraction.java

D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms>java day2arithmeticop.Subtraction.java
Error: Could not find or load main class day2arithmeticop.Subtraction.java

D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms>java day2arithmeticop.Subtraction
enter value of a:
2
enter value of b:
1
1
D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms>javac -d .. Subtraction.java

D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms>java day2arithmeticop.Subtraction
enter value of a:
3
enter value of b:
1
2
D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms>javac -d . greatestnumberhandson.java

D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms>java maxnumber.max.greatestnumberhandson
enter value of a:
3
enter value of b:
4
4
D:\1 ECLIPSE IDE WORKSPACE\JavaPrograms>
*/