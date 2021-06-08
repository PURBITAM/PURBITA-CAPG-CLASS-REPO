package com.capgemini.checkexceptionexample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile 
{
	public void readFile() throws IOException,FileNotFoundException
	{
		FileReader file=new FileReader("src\\com\\capgemini\\checkexceptionexample\\sample.txt");
		BufferedReader br=new BufferedReader(file);
		for(int i=0;i<3;i++)
		{
			System.out.println(br.readLine());
		}
		file.close();
	}
}
