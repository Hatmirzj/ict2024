package com.ict;

public class ThreadDemo implements Runnable//extends Thread
{
	public void run() {
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		ThreadDemo t1=new Thread(new ThreadDemo());  //1
		t1.setPriority(MAX_PRIORITY);
		//t1.setDaemon(true);
		//t1.setName("trainer");
		t1.start();//runnable
		//running
		
		ThreadDemo t2=new ThreadDemo();
		t2.setName("Student");
		t2.start();
		System.out.println(Thread.activeCount());
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.activeCount());
	}

}
