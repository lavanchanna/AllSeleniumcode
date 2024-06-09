package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {
	@Test
	public void testcase1()
	{
		int a=30;
		int b=20;
		String actualTitle="Facebook";
		String expectedTitle="facebook";
		Assert.assertTrue(a>b); //True>>assert pass, next line of codes will execute
		System.out.println("assertion will get verify");
		System.out.println("assertion checked");
		//Assert.assertTrue(a<b); //false>>expected true> assert failed,terminated directly next line of codes will not execute
		Assert.assertTrue(a<b, "Please check condition it should be true");//This message will print in console
		System.out.println("assertion will get verify");
		System.out.println("assertion checked");
		Assert.assertFalse(a<b);// false>expected false>assert passed
		System.out.println("assertion passed as expected false");
		System.out.println("assertion checked");
		
		Assert.assertEquals(actualTitle, expectedTitle);// failed,bcz both strings not equal, this is hard assert
		System.out.println("assertion will get verify");
		System.out.println("assertion checked");
		
		
	}

}
