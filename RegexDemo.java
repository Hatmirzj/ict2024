package com.ict.day2;
import java.util.regex.*;  

public class RegexDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(".r");//. represents single character  
		Matcher m = p.matcher("ar");  
		boolean b = m.matches();  
		  
		//2nd way  
		boolean b2=Pattern.compile(".p").matcher("as").matches();  
		  
		//3rd way  ? + . * 
		boolean b3 = Pattern.matches("[*]s", "apkjs");  
		  
		System.out.println(b+" "+b2+" "+b3);  

System.out.println(Pattern.matches("[^0-9]", "s"));//false (non-digit)  
System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
System.out.println(Pattern.matches("\\d", "4"));//false (digit but comes more than once)  


		System.out.println(Pattern.matches("[ab]", "a"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "y"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[am]", "m"));//false (m and a comes more than once) 
		 
	}

}
