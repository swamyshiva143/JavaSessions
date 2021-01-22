package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorrrs {

	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		driver.findElement(By.id("firstname")).sendKeys("Swamy");
		driver.findElement(By.id("lastname")).sendKeys("Akula");
		driver.findElement(By.name("Email")).sendKeys("swamyshiva.iiit@gmail.com");
		driver.findElement(By.id("password")).sendKeys("lavi8978953782@");
//		driver.findElement(By.linkText("EMAIL_REG_FORM_SUBMIT")).click();
		driver.findElement(By.id("showpassword")).click();
		
		

	}

}
