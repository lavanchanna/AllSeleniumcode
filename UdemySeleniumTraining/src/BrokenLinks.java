import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		//softAssert a=new softAssert(); need to download the jar file from testng to use this
		
		for(WebElement link : links)
		{
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responsecode=conn.getResponseCode();
			System.out.println(responsecode);
			//a.assertTrue(responsecode<400,"The link with Text"+ link.getText() + "is broken with response code " + responsecode);
			if(responsecode>400)
			{
				System.out.println("The link with Text"+ link.getText() + "is broken with response code " + responsecode);
				Assert.assertTrue(false);
			
			}
			//a.assertAll(); This need to use for soft assert to get all the links
		}
		
		//broken URL
		//Step1-Is to get all the URLS tied up to the links in selenium
		//a[href*="soapui"]
		
		// Java Methods will call the URLS and gets the status code
		// if status code is more than 400, then that url is not working, link which tied to url is broken

	}

}
