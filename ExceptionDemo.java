package com.ict;

public class ExceptionDemo {

	public static void main(String[] args) {
	int a=10;
	int b=0;
	int d[]= {5,7,8};
		try {
			
			try {
				int c = a/b;
				System.out.println(c);
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //runtime
		
			System.out.println(d[5]);

		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
	
	System.out.println("Thank you");
	}

}
