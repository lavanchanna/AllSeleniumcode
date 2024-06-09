package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//Enter the data using JSE
		js.executeScript("document.getElementById('email').value='lavanc@gmail.com'");
		//Vertical Scrolldown
		js.executeScript("window.scrollBy(0,400)");
		//Horizontal scroll right js.executeScript("window.scrollBy(400,0)");
		//Horizontal scroll left js.executeScript("window.scrollBy(-400,0)");
		//Vertical ScrollUp
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-400)");
		// click on create new account button with JSE
		WebElement createaccount= driver.findElement(By.xpath("//a[text()='Create new account']"));
		js.executeScript("arguments[0].click()", createaccount);
		Thread.sleep(2000);
		WebElement femaleRadio= driver.findElement(By.xpath("//input[@value='1']"));

	js.executeScript("arguments[0].click()", femaleRadio);
		//js.executeScript("arguments[0].checked=true", femaleRadio);

	}

}
