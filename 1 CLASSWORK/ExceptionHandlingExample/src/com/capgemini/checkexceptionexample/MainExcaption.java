package com.capgemini.checkexceptionexample;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainExcaption 
{
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ReadingFile raf=new ReadingFile();
		raf.readFile();
		
		Division d=new Division();
		d.divide();
	}
	
}
