import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SslCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
	
		//FirefoxOptions options1=new FirefoxOptions();
		//options1.setAcceptInsecureCerts(true);
	//	EdgeOptions options2=new EdgeOptions();
		//options2.setAcceptInsecureCerts(true);
		options.setAcceptInsecureCerts(true);
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
