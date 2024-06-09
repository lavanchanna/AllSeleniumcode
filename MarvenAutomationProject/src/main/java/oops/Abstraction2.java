package oops;

public class Abstraction2 extends Abstraction1 {

	@Override
	void balanceCheck() {
		// TODO Auto-generated method stub
		// Here we can write code for balancecheck
	}

	@Override
	void linkMobileNumber() {
		// TODO Auto-generated method stub
		// Here we can write code for linkMobileNumber
	}

	@Override
	void withdraw() {
		
		// TODO Auto-generated method stub
		// Here we can write code for withdraw
		
	}
	
	public static void main(String[] args) {
		//Abstraction1 ab1= new Abstraction1();
		// We can not create object of Abstract class 
		Abstraction1 ab1= new Abstraction2();
		ab1.balanceCheck();
		ab1.linkMobileNumber();
		ab1.createNewAccount();
		ab1.withdraw();
	
	}

}
