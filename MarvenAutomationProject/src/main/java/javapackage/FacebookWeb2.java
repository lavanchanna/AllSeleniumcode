package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookWeb2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://amazon.in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back(); // back
		Thread.sleep(2000);
		driver.navigate().forward(); //forward
		Thread.sleep(2000);
		driver.navigate().refresh();//refresh
		Thread.sleep(2000);
		System.out.println(driver.getPageSource());
		
		driver.quit();
		
	}

}
