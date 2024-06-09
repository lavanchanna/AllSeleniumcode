import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");// This method will wait until all the components are loaded
		driver.navigate().to("https://www.rahulshettyacademy.com/");// this method will not wait
		driver.navigate().back();
		driver.navigate().forward();
	}

}
