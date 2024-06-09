package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookdRadio2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//  Using text() method xpath
		System.out.println(driver.findElement(By.xpath("//a[text()='Create new account']")).isDisplayed()+"create account displayed");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		// find elements using multiple webelements
	List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radios.size());
		//Select second radio button
		radios.get(1).click();
		System.out.println(radios.get(1).isSelected());
		System.out.println(radios.get(0).isSelected());
		radios.get(2).click();
		System.out.println(radios.get(2).isSelected());
	}

}
