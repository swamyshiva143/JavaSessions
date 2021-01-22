package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.etihad.com/en-in/");
		
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Book"))).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Book flights")).click(); 
		
		
		
		
		
	}

}
