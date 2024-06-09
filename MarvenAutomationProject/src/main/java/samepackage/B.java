package samepackage;

public class B {
	
	public static void main(String[] args) {
	A a= new A(); // Create object of Class A
	// private a.a is not accessible as private
	System.out.println(a.b);//b is public, this can be access anywhere
	System.out.println(a.c); // c is protected, this can access in same package
	System.out.println(a.d);// d is default, this can access only in same package.
	// a.enrollpayment(); private enrollpayment is not accessible as private
		a.makepayment(); //is public, this can be access anywhere
		a.extnpayment(); //is protected, this can access in same package
		a.rewritepayment(); // is default, this can access only in same package.
	}

}
