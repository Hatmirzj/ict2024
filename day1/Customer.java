package com.ict;
public class Customer{
	public Integer id;
	protected String name;
	
	
	private String email;
	public  Customer(){ 
	}
	public Customer(String name) {
		super();
		this.name = name;
	}


	public Customer(Integer id) {
		super();
		this.id = id;
	}


	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	void show() {
		
	}
	
	
}

