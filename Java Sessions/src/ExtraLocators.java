package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ExtraLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();	//launch browser
		
		driver.get("http://www.facebook.com");
		
	//	driver.findElement(new ByAll(By.id("email"), By.name("email"), By.xpath("//input[@id='email']"))).sendKeys("swamysiva");
	
		//	driver.findElement(new ByIdOrName("email")).sendKeys("swamyshvia");
		
		driver.findElement(new ByChained(By.xpath("//div[@class='_6lux']"), By.name("email"))).sendKeys("swamyshivaaa");

	}

}
