package javapackage;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int data=50/0;
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
		
		catch(Exception e)
	{
		System.out.println(e);
	}
		
	}

}
