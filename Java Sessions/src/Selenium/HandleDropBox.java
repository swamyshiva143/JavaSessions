package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.facebook.com"); 	//enter url
		
		Select select= new Select(driver.findElement(By.id("store")));
		select.selectByVisibleText("California");
		
		
		Select select1= new Select(driver.findElement(By.xpath("akfdjofheo")));
		select1.selectByVisibleText("India");
		
		Select select2= new Select(driver.findElement(By.name("Love")));
		select2.selectByVisibleText("Telangana");

	}

}
