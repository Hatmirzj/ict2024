package com.ict.client;


//static, method overloadin, cimpilete time 
public class CustomerApp //extends Customer
{
	int area(int s) {
		return s*s;
	}
	int area(int l,int b) {
		return l*b;
	}
	double area(double r) {
		 return 3.142*r*r;
	}
	
	public static void main(String[] args) { //jvm, construct without args
		CustomerApp ca=new CustomerApp();
		ca.area(4534.3);
		ca.area(5,6);
		ca.area(2);
		
	}

}

