package javapackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplcitiWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);- older version
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//enter email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bali12@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("54673");
	
		//explicit wait for login button
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='login']")));
driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		
	}

}
