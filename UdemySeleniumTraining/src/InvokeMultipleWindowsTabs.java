import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeMultipleWindowsTabs {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		//Switching window
		driver.switchTo().newWindow(WindowType.TAB);
		//Get the WindowHandlers
		Set<String> handles=driver.getWindowHandles();
		java.util.Iterator<String> it=handles.iterator();
		String parentWindowId=it.next();
		String childWindowId=it.next();
		driver.switchTo().window(childWindowId);
		driver.get("https://www.rahulshettyacademy.com/");
		String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentWindowId);
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		//Take screenshot of the webelement
		File file=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Selenium\\logo.png"));
		//driver.quit();
		//Width and Height of the webelement
		System.out.println(name.getRect().getDimension().getHeight());  
		System.out.println(name.getRect().getDimension().getWidth());
		
		
		
	}

}
