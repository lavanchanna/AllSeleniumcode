package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//  Using text() method xpath
		System.out.println(driver.findElement(By.xpath("//a[text()='Create new account']")).isDisplayed()+"create account displayed");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		//Handling month dropdown without select and using findelements
		List<WebElement> birthMonth= driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println(birthMonth.size());
	birthMonth.get(4).click();
	driver.findElement(By.xpath("//select[@id='month']/option[11]")).click();
		

	}

}