import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 1. Give me count of link on the page- With Tagname "a"
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. Count of the links in the footer 
	 WebElement footerdriver=	driver.findElement(By.id("gf-BIG")); // limiting webdriver scope locate the footer section
	 System.out.println(footerdriver.findElements(By.tagName("a")).size());
	 // 3. Links count of first column in the footer
	WebElement columndriver= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(columndriver.findElements(By.tagName("a")).size());
	 // 4. Click on the each link in the first column and verify links are working

	
      for (int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
      {
    	  String clickOnlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
    	  columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnlinkTab);
    	    // 5. Get the Tile of each link in the first column
    	  Thread.sleep(5000);
      }
    	  Set<String> abc=driver.getWindowHandles();
    	  java.util.Iterator<String> it=abc.iterator();
        
    	  while(it.hasNext())
    	  {
    		 driver.switchTo().window(it.next()) ;
    		 System.out.println(driver.getTitle());
    		  
    	  }
    	  
    	  
      

      
	
	
	}

}
