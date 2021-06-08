package javaioxamples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOfExample 
{
	public static void main(String[] args) 
	{
		FileOutputStream fout=null;
		FileInputStream fin=null;
		BufferedInputStream bin=null;
		try 
		{
			fout=new FileOutputStream("D:\\IODemoSample\\file2.txt");
			BufferedOutputStream boutput=new BufferedOutputStream(fout);
			String newStr="hello how are you";
			byte b[] = newStr.getBytes();
			boutput.write(b);
			boutput.flush();
			boutput.close();
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		try
		{
			fin=new FileInputStream("D:\\IODemoSample\\file2.txt");
			bin=new BufferedInputStream(fin);
			int ch;
			while((ch=bin.read())!=-1)
			{
				System.out.println((char)ch);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
