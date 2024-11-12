package com.ict.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product  // implements Comparable
{
	Integer id;
	String name;
	Double price;
	public Product(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	/*
	public int compareTo(Object o) {
		Product p=(Product)o;
		//return this.name.compareTo(p.name);
		
		if(this.id<p.id) 
			return -1;
		
		else if(this.id>p.id) 
			return 1;
	
		else return 0;
		
	}*/
	
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Product> productList=new ArrayList<>();
       productList.add(new Product(90,"mobie",9999.99));
       productList.add(new Product(30,"tab",19999.99));
       productList.add(new Product(10,"laptop",89999.99));
       productList.add(new Product(20,"bag",129999.99));
       productList.add(new Product(70,"box",94999.99));
       productList.add(new Product(80,"table",89999.99));
     //  Collections.sort(productList);
       
       Comparator<Product> comp=(p1,p2)->p1.name.compareTo(p2.name);
       productList.stream().sorted(comp).forEach(p->System.out.println(p));
       
        
	}

	

}
