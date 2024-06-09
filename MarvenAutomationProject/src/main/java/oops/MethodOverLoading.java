package oops;

public class MethodOverLoading {

	public int sum(int a, int b)
	{
		return a+b;
	}
	public int sum(int a, int b, int c)
	{
				return a+b+c;
	}
	public void sum(String a, String b)
	{
		String c = a+b;
		System.out.println(c);
	}
}
