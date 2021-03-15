package Selenium2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium1.TakeScreenshot;

public class ScreenshotHandle {
	
		static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		takeScreenshot("Facebook_loginPage");
	}
	
	public static void takeScreenshot(String fileName) throws IOException {
		//1. take screenshot, and store it as a file format
		File file= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//2. now copy the screenshot to desired location using copyfile method
		
		FileUtils.copyFile(file, new File("D:\\Swamyshiva\\swamyshiva\\JavaSessions\\src\\screenshots\\"+fileName+".png"));
		
	}
	
	

}
