package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	@Parameters({"URL","username"})
	@Test(groups=("Smoke"))
	public void day2demo2(String urlname,String uname)
	{
		System.out.println("Day2-Demo1");
		System.out.println(urlname);
		System.out.println(uname);
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("This prerequisite will be executed first");
	}


}
