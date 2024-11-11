package com.ict.client;
class Ride{
	void sq(int s){
		System.out.println("Area="+(s*s));
	}
}
class Ride1 extends Ride{
	void sq(int s) {
		System.out.println("PErimeter="+(4*s));
	}
	
}
public class MrideDemo {

	public static void main(String[] args) {
		Ride r=new Ride();
		r.sq(7);
		Ride1 r1=new Ride1();
		r1.sq(7);

	}

}
