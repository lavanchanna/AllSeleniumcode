package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG8 {
 
	TestNG7 t7=new TestNG7();
	
	@Test(groups = {"Login"})
	public void facebookLogin() throws Exception {
	
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	
		
		t7.driver=new ChromeDriver();
		
		t7.driver.get("https://www.facebook.com/");//launching web application		
		t7.driver.manage().window().maximize();//maximize web application		
		Thread.sleep(2000);//stop execution for 2 sec
		
		//email text field		
		t7.driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bali12@gmail.com");
		
		Thread.sleep(2000);//stop execution for 2 sec

		//password text field having wrong xpath
		
		t7.driver.findElement(By.xpath("//input[@id='passssssssssssssss']")).sendKeys("54673");
		
		Thread.sleep(2000);//stop execution for 2 sec
	}
	
	@Test(groups = {"NewAccount"})
	public void clickonCreateNewAccount() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		 t7.driver = new ChromeDriver();

		t7.driver.get("https://www.facebook.com/");// launching web application

		t7.driver.manage().window().maximize();// maximize web application

		Thread.sleep(2000);// stop execution for 2 sec
		
		
		//click on Create new account button using wrong xpath
		
		t7.driver.findElement(By.xpath("//a[text()='Create new accountttttttttttttttttt']")).click();
		Thread.sleep(2000);// stop execution for 2 sec
		
		
	}
	
	@AfterMethod
	public void takescreenshot(ITestResult result) throws Exception {
		
		t7.captureScreenshot(result);
		Thread.sleep(2000);
	}
}
