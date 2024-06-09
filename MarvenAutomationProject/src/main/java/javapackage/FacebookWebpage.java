package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookWebpage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://amazon.in");
		Thread.sleep(2000); // forcefully stop execution for 2 sec
		driver.manage().window().maximize(); // maximize the window
		System.out.println(driver.getTitle());
		Thread.sleep(2000); // forcefully stop execution for 2 sec
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000); // forcefully stop execution for 2 sec
		//driver.findElement(null)
		//driver.close();
		driver.quit();
	}

}
