package com.ict.day2;
/*
abstract class  Vehicle{
	abstract int milage();
	abstract int speed();
	void show() {
		System.out.println(" concrete method");
	}
}
abstract class Parking{
	abstract int getParkingslot();
}
*/
interface  Vehicle{
	 int milage();
	 int speed();
	 
	
}
interface Parking{
	 int getParkingslot();
}
abstract class X{
	abstract void disp();
}
class Car extends X implements Vehicle,Parking{
	@Override
	public int milage() {
		return 15;
	}
	void disp() {
		
	}
	@Override
	public int speed() {
		return 80;
	}
	@Override
	public  int getParkingslot() {
		 return 10;
	 }
}

class Bus implements Vehicle{
	@Override
	public int milage() {
		return 12;
	}
	@Override
	public int speed() {
		return 100;
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Vehicle v=new Car();
	    System.out.println(v.speed());
	    System.out.println(v.milage());
	    Parking p=new Car();
	    System.out.println(p.getParkingslot());
	    v=new Bus();
	    System.out.println(v.speed());
	    System.out.println(v.milage());
	  
	}

}
