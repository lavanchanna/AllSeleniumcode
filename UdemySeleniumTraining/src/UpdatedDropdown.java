import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// below code for checkbox
	//	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Thread.sleep(3000);
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	//	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))//display: block; opacity: 1 for enabled
		{
			System.out.println("Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Disabled");
			Assert.assertTrue(false);
		}
		
		//count the number of checkboxes
       System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
       
				
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
	
		//int i=1;
		//while(i<5)
		//{
		//	driver.findElement(By.id("hrefIncAdt")).click(); // 5 adults
		//i++;
		//}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); // 5 adults
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
