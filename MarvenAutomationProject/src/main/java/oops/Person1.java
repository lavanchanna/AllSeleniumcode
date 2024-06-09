package oops;

public class Person1 {
	
	public String name;
	public int age;
	//default constructor

	
	
	Person1()
	{
		name="Baliraj";
		age=35;
		
	}

	//Parameterized constructor
	Person1(String s,int i)
	{
		name=s;
		age=i;
		
	}
	
	
	public void enrol()
	{
		System.out.println("Hello I am :" + name );
		System.out.println("Myname Age is :" + age );
	}
	

}
