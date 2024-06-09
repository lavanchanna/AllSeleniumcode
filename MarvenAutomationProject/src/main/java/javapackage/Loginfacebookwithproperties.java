package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfacebookwithproperties {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Specify the location of the properties file with the class of File class object
		File scr=new File("C:\\Users\\043479744\\eclipse-workspace\\MarvenAutomationProject\\PageLocators\\Login.properties");
		//we need create object of FileInputStream to load the file class object ref scr
		FileInputStream fis=new FileInputStream(scr);
		// create object of properties 
		Properties prop=new Properties();
		//read the properties file
		prop.load(fis);
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//getProperty method
driver.findElement(By.xpath(prop.getProperty("email"))).sendKeys("lavanuk79@gmail.com");
driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys("Selenium123#");
driver.findElement(By.xpath(prop.getProperty("login"))).click();
Thread.sleep(10000);

//driver.findElement(By.xpath(prop.getProperty("newaccount"))).click()
driver.quit();
		
	}

}
