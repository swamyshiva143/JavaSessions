package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("swamyakula2@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("lavi8978953782");
	//	driver.findElement(By.xpath("//button[@name='login']")).click();
		
		WebElement loginbtn= driver.findElement(By.name("login"));
		flash(loginbtn, driver);
	

	}
	 public static void flash(WebElement element, WebDriver driver) {
		 
		 JavascriptExecutor js= ((JavascriptExecutor) driver);
		 String bgcolor= element.getCssValue("backgroundcolor");
		 
		 for(int i=0; i<100; i++) {
			 
			 changeColor("rgb(0,400,0", element, driver);
			 changeColor(bgcolor, element, driver);
			 
		 }
		 
	 }
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+ "'", element);
		
		
		try {
			Thread.sleep(20);
		}
		catch(InterruptedException e) {
			
		}
	}

}
