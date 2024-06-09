package oops;

public class ActionJavaClass1 implements Interface1{

	@Override
	public void miniStatement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balancecheck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

public static void main(String[] args) {
	Interface1 I1= new ActionJavaClass1(); // Create reference of parent class and assign child class
	//but you can not create object of Interface
	I1.miniStatement();
	I1.balancecheck();
	I1.logout();
}
	
}
