package com.ict.day2.java8;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Calsi{
	int op(int a,int b);
	//int sum(int b,int c);
	
}

public class FunctionalDemo1  {
	public static void main(String[] args) {
    Calsi c=(a,b)-> a+b;
    System.out.println(c.op(4, 5));
    System.out.println(c.op(42, 35));
    Calsi c1=(a,b)->a*a+b*b;
    System.out.println(c1.op(3, 4));
    
    //in build functional interface
    Consumer<Integer> con1=(x)->System.out.println(x*100);
    con1.accept(20);
    
    Supplier<Integer> sup1=()-> new Random().nextInt();
    System.out.println(sup1.get());
    
    Predicate<Integer> pre=(x)->x>10;
    System.out.println(pre.test(30));
     Function<Integer,Integer> fun1=(x)->x*x*x*50;
    System.out.println(fun1.apply(5));
    
    
    
    
    
	}
}
