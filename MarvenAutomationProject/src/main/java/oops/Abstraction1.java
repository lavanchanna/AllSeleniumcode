package oops;

public abstract class Abstraction1 {

	// below is normal user defined method, it is non abstract method
	public void createNewAccount()
	{
		// here we can write code
		
	}
	// below are abstracts method, it should not have any body
	abstract void balanceCheck();	
	abstract void linkMobileNumber();
	abstract void withdraw();
	
}
