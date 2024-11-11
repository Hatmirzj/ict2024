package com.ict;

class Loan{  //super ,base , parent
    Integer id;
    String type;
    void dispLoanDetails() {
    	
    }
    void show() {
    	
    }
	
}
class SavingAccount  extends Account{
	
}
class HousingLoan extends Loan{  //derived, sub , child
	 String type;
	 String nameOfTheProperty;
	 void dispLoantype() {
		 System.out.println(  this.type +"  "+super.type);
	 }
	 
}
class EmployeeHousingLoan extends HousingLoan{
	String type;
	 void dispLoantype() {
		 System.out.println(  this.type +"  "+super.type);
	 }
	
}
class BusinessHousingLoan extends HousingLoan{
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		

	}

}
