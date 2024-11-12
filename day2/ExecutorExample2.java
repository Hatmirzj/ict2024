package com.ict.day2;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class ExecutorExample2 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        Runnable task1=() ->{
        	try {
				for(int i=1;i<=10;i+=2) {
				  System.out.println(Thread.currentThread().getName() +"  "+ i);
				  Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        };
        
        Runnable task2=() ->{
        	try {
				for(int i=0;i<=10;i+=2) {
				  System.out.println(Thread.currentThread().getName()+" "+i);
				  Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
      };
      
      executor.submit(task1);
      executor.submit(task2);
      executor.shutdown();
    }

}
