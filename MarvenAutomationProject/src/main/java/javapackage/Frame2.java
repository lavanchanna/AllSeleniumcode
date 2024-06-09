package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        List<WebElement> totalFrame=driver.findElements(By.tagName("iframe"));//2
        
        for(int i=0;i<totalFrame.size();i++)
        {
        		driver.switchTo().frame(i);
        		if(driver.findElement(By.xpath("//div[@id='draggable']")).isDisplayed());
   System.out.println(driver.findElement(By.xpath("//div[@id='draggable']")).getText());
        		
        		
        		
        }
        	
				

	}

}
