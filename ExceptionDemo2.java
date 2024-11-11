package com.ict;

import java.util.Scanner;
class DepositException extends Exception{
	DepositException(String msg)
	{
		System.out.println(msg);
	}
}
public class ExceptionDemo2 {
	public static void main(String[] args) throws DepositException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to be deposited...");
		int amt=sc.nextInt();
		if(amt<1000)
			throw new DepositException("minimum amount is 1000/-");
		else
			System.out.println("Thank you for using services...");

	}

}
