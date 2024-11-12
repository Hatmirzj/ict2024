package com.ict.day2;

class CallMe{
	
	public synchronized void call(String s) {
		
		try {
			System.out.println("[Welcome");
			Thread.sleep(1000);
			System.out.println("Mrs/Ms"+s);
			Thread.sleep(1000);
			
			System.out.println("to Fullstack Training]");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

class Caller extends Thread{
	CallMe callMe;
	String s;
	 Caller(CallMe callMe,String s){
		this.callMe=callMe;
		this.s=s;
		 this.start();
	 }
	 public void run() {
		this.callMe.call(s);
	 }
	
}

public class SyncDemo {

	public static void main(String[] args) {
		CallMe cm=new CallMe();
		Caller c1=new Caller(cm,"ICTUSer123");
		Caller c2=new Caller(cm,"ICTUSer456");
		Caller c3=new Caller(cm,"ICTUSer789");
		

	}

}
