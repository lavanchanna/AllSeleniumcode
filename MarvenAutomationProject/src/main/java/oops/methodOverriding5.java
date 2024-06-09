package oops;

public class methodOverriding5 {
	
	public static void main(String[] args) {
		
		//Parent ref= new child();
		methodOverriding3 mO3=new methodOverriding4(); // Dynamic method dispatch
		mO3.cook(); // child class method will get execute
		mO3.eat(); // parent class method will get execute
		//mO3.angry(); // child class method is not allowed because angry method not exist in parent class
	
		
	}

}
