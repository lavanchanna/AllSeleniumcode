package javapackage;

public class Variable2 {
	
	int student=101; // global variable
	static int j=100;
		
	public static void main(String[] args) {
		
		// ClassName ref= new ClassName();
		Variable2 v2=new Variable2(); // Object of Variabl2 class
System.out.println(v2.student);

int Teacher=1000; // local Variable
System.out.println(Teacher);
v2.enrollName(); // calling user defined method to print the value
System.out.println(j); // static variable can call directly without any object
System.out.println(Variable2.j); // static variable can call directly with class	
	account(); // call static user defined methods
	
	}
	//user defined method
	
	public void enrollName()
	{
		String Text1="String Variable";
				System.out.println(Text1);
	}
	
	static public void account()
	
	{
		int account1=4567;
		System.out.println(account1);
		
		
	}
	
	

}
