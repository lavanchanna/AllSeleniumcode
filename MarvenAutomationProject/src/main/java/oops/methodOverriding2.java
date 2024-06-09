package oops;

public class methodOverriding2 extends methodOverriding1 {
	public void makePayment()
	{
		//HDFC Bank
		String firstName;
		String lastName;
		int accountNumber;
		int mobileNumber;
		System.out.println("Make a payment for SBI");
	}
	public static void main(String[] args) {
		
		//Access the child class makePayment method as below
		methodOverriding2 mO2= new methodOverriding2();
		mO2.makePayment();
		
		//Access the parent class makePayment method as below
		methodOverriding1 mO1= new methodOverriding1();
		mO1.makePayment();
	}

}
