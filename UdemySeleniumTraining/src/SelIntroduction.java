import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Invoking Browser

		//chromedriver.exe -> Invokes chrome browser
		//firefoxdriver
		//Safaridriver
		// Selenium Manager
		//step to invoke chrome browser

		
		// Chrome - ChromeDriver -> Methods
		//Webdriver methods + class methods
		
		// Chrome Launch
		//System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		// Firefox launch
		//geckodriver
		//webdriver.gecko.driver path property
		//System.setProperty("webdriver.gecko.driver", "C:/Selenium/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		// Microsoft edge
		System.setProperty("webdriver.edge.driver", "C:/Selenium/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	//	driver.close();
		driver.quit();
		driver.getPageSource();
	}

}
