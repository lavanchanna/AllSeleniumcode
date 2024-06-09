
public class MethodsDemo {
public static void main(String[] args) {
	MethodsDemo	a = new MethodsDemo();
	a.getdata();
	String value=a.getstring();
	System.out.println(value);	
	//calling from different class
	MethodsDemo2 b= new MethodsDemo2();
	String value2=b.getstring2();
	System.out.println(value2);	
	//Static methods no need of objects.
	String value3=getstring3();
	System.out.println(value3);	
	getstring3();
}

public void getdata()
{
	System.out.println("Hello How are you");
}	

public String getstring()

{
return("Returning string");
}

public static String getstring3()

{
	System.out.println("from static method");
	return("Returning string from static method");

}

}