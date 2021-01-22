package Selenium1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		//Take screenshot and store as a file format
		
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//now copy the screenshot to desired location usign copyfile //method
		
		Files.copy(src, new File("C:\\Users\\Parameshwar Reddy\\Pictures\\google.png"));

	}

}
