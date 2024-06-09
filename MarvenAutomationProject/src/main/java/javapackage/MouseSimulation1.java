package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement elec=driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		WebElement fashion=driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
		WebElement grocery=driver.findElement(By.xpath("//span[contains(text(),'Grocery')]"));
		Actions act= new Actions(driver);
		act.moveToElement(elec).build().perform();
		Thread.sleep(2000);
		act.contextClick(fashion).build().perform();
		Thread.sleep(2000);
		act.doubleClick(grocery).build().perform();
		
	}

}
