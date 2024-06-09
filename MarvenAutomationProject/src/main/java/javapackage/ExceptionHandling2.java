package javapackage;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		try {
			int a[]=new int[5]; //size of array is 5
			a[10]=500/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
				}
		finally {
			System.out.println("This is final block");
		}
	}

}
