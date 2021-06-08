package javaioxamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExample {

	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("D:\\IODemoSample\\file2.txt");
			String str="My name is Purbita";
			byte b[]=str.getBytes();//converting String to byte array
			fout.write(b);
			fout.close();
			System.out.println("File created successfully");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		//reading data from the above file
		try
		{
			FileInputStream finput=new FileInputStream("D:\\IODemoSample\\file2.txt");
			int ch;
			while((ch=finput.read())!=-1)
			{
				System.out.println((char)ch);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
