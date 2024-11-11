package com.ict;
//non sub class 
public class OnlineCustomer extends Customer{
	
	void show() {
		System.out.println(id +"  "+name);
	}

}


class Order{
	void disp() {
		Customer c=new Customer(); // has- a - composition
		c.show();
		System.out.println(c.id+  "  "+c.name  );
	}
}
