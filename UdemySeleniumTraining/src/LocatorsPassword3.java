import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsPassword3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String name="lavanc@gmail.com";
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait to all steps
		String password=getPasword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText()); // only one tagname
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']"));// xpath using the text
		driver.quit();
	}
	
	public static String getPasword(WebDriver driver) throws Exception
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");
		//Array 0 index -Please use temporary password
		//Array 1st index- rahulshettyacademy' to Login.
	//	String[] passwordArray2=passwordArray[1].split("'"); //This will split
	//	passwordArray2[0];
		String password=passwordArray[1].split("'")[0]; // You can write as above using new variable or using [0] index
		return(password);
		//Array 0 index - rahulshettyacademy
		//Array 1 index- to Login.
		
	}

}
