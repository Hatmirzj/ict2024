package com.ict;

public class Demo {
	static {
 	   System.out.println(" static block 3");
    }
	  int  sum(int a,int b) {
		 return a+b;
	  }
	  static {
   	   System.out.println(" static block 2");
      }
      void show() {
   System.out.println(" show function that does not return");
      }
       String getMessge() {
    	   return "welcome";
       }
       static {
    	   System.out.println(" static block 1");
       }
       public void main(String name) {
    	   System.out.println(" user defined main"+name);
       }
public static void main(String args[]) {//JVM
	/*
	 * System.out.println("main start ...demo...");
	 * System.out.println("Name:"+args[0]); System.out.println("City:"+args[1]);
	 */
	 Demo d=new Demo();
	 System.out.println(d.sum(4, 5));
	 System.out.println(d.sum(46, 35));
	 System.out.println(d.getMessge());
	 d.show();
	
   }	
}
