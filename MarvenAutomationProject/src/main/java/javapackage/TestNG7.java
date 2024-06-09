package javapackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TestNG7 {

	WebDriver driver;
	
	public void captureScreenshot(ITestResult result) throws Exception {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
			
			//1. Create object of TakeScreenshot and Type cast with driver
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			//2. call method to capture the screenshot and store interms of File
			
			File scr=ts.getScreenshotAs(OutputType.FILE);//scr>actaul screenshot
			
			//3. copy (scr) and paste it at our project lavel
			// (./) I want to store screenhot at project lavel
			
			//selenium version 2.53.1
			FileUtils.copyFile(scr,new File("./screenshot/" +result.getName() +".png"));
		}
	}
}
