package oops;

public class methodOverriding7 extends methodOverriding6{
	static void m1()
	{
		System.out.println("B-M1");
	}
	void m2()
	{
		System.out.println("B-M2");
	}
	void m3(float f, int a)
	{
		System.out.println("B-M3 float and int Parameter");
	}
	public static void main(String[] args) {
		//Below are method overriding
		methodOverriding7 mO7= new methodOverriding7();
		mO7.m1(); //child class method will execute
		mO7.m2(); //child class method will execute
		mO7.m3(); //Parent class method will execute as there is child class method
		mO7.m3("Lavan");//Parent class method will execute as there is child class method
		mO7.m3(41.3f, 10); //child class method will execute
		// below is Dynamic method dispatch
		methodOverriding6 mO6= new methodOverriding7();
		mO6.m2();//child class method will execute
		mO6.m3("Lavan");//parent class method will execute
		mO6.m1();// Parent class method will execute incase of static keyword
	}
	

}
