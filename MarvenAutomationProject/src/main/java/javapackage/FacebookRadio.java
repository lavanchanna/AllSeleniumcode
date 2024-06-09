package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRadio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//create new account button displayed or not
		//System.out.println(driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).isDisplayed()+"create account displayed");
	//  Using text() method xpath
		System.out.println(driver.findElement(By.xpath("//a[text()='Create new account']")).isDisplayed()+"create account displayed");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		//Firstname is enabled or not
		System.out.println(driver.findElement(By.xpath("//input[@placeholder='First name']")).isEnabled()+" enabled or not");
		
 //Click on Female radion button with the help of multiple attribute concept
	
		driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();
		 //Click on Male radion button with the help of multiple attribute concept
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).click();
		 //Click on custom radion button with the help of multiple attribute concept
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='radio'][@value='-1']")).click();
		// custom radio button is selected or not 
	System.out.println(driver.findElement(By.xpath("//input[@type='radio'][@value='-1']")).isSelected());
	// female radio button is selected or not 
	System.out.println(driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).isSelected());
	// male radio button is selected or not 
	System.out.println(driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).isSelected());
		
	}

}
