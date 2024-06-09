package oops;

public class Inheritance4 extends Inheritance3 {

	public void enrollPayment()
	{
		System.out.println("enroll payment code");
	}
	public void makePayment()
	{
		System.out.println("Make payment code in child class");
	}
public static void main(String[] args) {
	
	Inheritance4 in4= new Inheritance4();
	in4.makePayment();
	in4.enrollPayment();
}
	
}
