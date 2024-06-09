package anotherpackage;

import samepackage.A;

public class D extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D d= new D();
		//System.out.println(d.a); // a is private, this can access only in same package and same class
		System.out.println(d.b);//b is public, this can be access anywhere
		System.out.println(d.c); // c is protected, this can access only during inheritance
		//System.out.println(d.d);// d is default, this can access only in same package
		
	  // d.enrollpayment(); private enrollpayment is not accessible as private
		d.makepayment(); //is public, this can be access anywhere
		d.extnpayment(); //is protected, this can access only during inheritance
	//d.rewritepayment(); // is default, this can access only in same package.

		
	}

}
