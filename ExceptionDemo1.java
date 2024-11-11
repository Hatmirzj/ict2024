package com.ict;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
class Vehicle{

	void show() throws InterruptedException,IOException
	{
		Thread.sleep(500);
		FileReader f=new FileReader("C:\\javaworkspace\\info.txt");

		
	}
}
class Car extends Vehicle{
	void show() throws FileNotFoundException,InterruptedException{
		
	}
}



public class ExceptionDemo1 {
	
	void show() throws InterruptedException,IOException
	{
		Thread.sleep(500);
		FileReader f=new FileReader("C:\\javaworkspace\\info.txt");
	}

	public static void main(String[] args) //throws InterruptedException,IOException
	{
		
		ExceptionDemo1 ex1=new ExceptionDemo1();
		try {
			ex1.show();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
