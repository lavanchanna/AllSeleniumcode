package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//  Using text() method xpath
		System.out.println(driver.findElement(By.xpath("//a[text()='Create new account']")).isDisplayed()+"create account displayed");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		//select[@id='month']
		
		WebElement bMonth=driver.findElement(By.xpath("//select[@id='month']"));
        Select month=new Select(bMonth);
        month.selectByIndex(3);
      System.out.println(month.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        month.selectByVisibleText("Jun");
        System.out.println(month.getFirstSelectedOption().getText());
        month.selectByValue("12");
        System.out.println(month.getFirstSelectedOption().getText());
      driver.close();
	}

}
