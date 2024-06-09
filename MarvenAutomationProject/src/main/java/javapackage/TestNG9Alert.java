package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG9Alert {

	@Test(groups = {"rediff"})
	public void alertWindow() throws Exception
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//click on sign in without entering uname and pwd
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(2000);
		String expected="Please enter a valid user name";
		System.out.println(expected);
		String actualTitle=driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
	/*	if(driver.switchTo().alert().getText().equalsIgnoreCase(expected))
		{
			System.out.println("Alert will get verified");
			driver.switchTo().alert().accept();// accept the alert, click on ok button
		}
		*/
    Assert.assertEquals(actualTitle, expected);// Hard Assert
    System.out.println("Alert will get verified");
    driver.switchTo().alert().accept();// accept the alert, click on ok button
		
	}
	

}
