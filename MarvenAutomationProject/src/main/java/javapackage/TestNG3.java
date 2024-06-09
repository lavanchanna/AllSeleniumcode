package javapackage;

import org.testng.annotations.Test;

public class TestNG3 {

    @Test(priority = -10) 
	public void a()
	{
	System.out.println("This is a test case method");	
	}
    @Test (priority = 1)
	public void z()
	{
	System.out.println("This is z test case method");	
	}
    @Test (priority = 0)
	public void b()
	{
	System.out.println("This is b test case method");	
	}
    @Test(priority = 1) 
	public void c()
	{
	System.out.println("This is c test case method");	
	}
    @Test 
	public void x()
	{
	System.out.println("This is x test case method");	
	}
    @Test (priority = 2)
	public void u()
	{
	System.out.println("This is u test case method");	
	}
}
