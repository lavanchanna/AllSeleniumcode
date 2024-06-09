package javapackage;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int data=10/0;
			}
			catch(ArithmeticException a)
			{
			a.printStackTrace();// print exactly where exception occured
			}
		finally {
			System.out.println("This finally block will execute");
		}
		
	}

}
