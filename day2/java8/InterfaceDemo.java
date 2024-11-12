package com.ict.day2.java8;

interface Arith{
	int op(int a,int b);
	default void disp() {
		 System.out.println("default.in parent.");
	}
	static void show() {
		System.out.println(" static ");
	}
}
class ArithImpl implements Arith{
	@Override
	  public void disp() {
		  System.out.println("default in child"); 
	   }
	
	public int op(int a,int b) {
		return a+b;
	}
}

public class InterfaceDemo {
   
	public static void main(String[] args) {
		Arith.show();
		Arith a=new ArithImpl();
		a.disp();

	}

}
