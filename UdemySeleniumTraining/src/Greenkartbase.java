import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenkartbase {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		int j=0;
		// List of items to add using Array
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Walnuts"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		//System.out.println(products.size());
		for (int i=0; i<products.size(); i++)
		{
			// Cauliflower - 1 Kg
			// split by -, Cauliflower, 1 Kg
			
			
			String[] name = products.get(i).getText().split("-");
			String formatedname= name[0].trim();
			//System.out.println(formatedname);
			//format it to get actual vegetable name 
			//check whether name your expected is present is arraylist or not
			//convert array into array list for easy search
			List itemsNeededList= Arrays.asList(itemsNeeded);
							
			if (itemsNeededList.contains(formatedname))
			{
				j++;
				//Click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j==itemsNeeded.length)
				{
					break;
				}
							}
				
		}
		
	}

}
