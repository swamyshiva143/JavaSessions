package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	//launch chrome
		
		driver.get("http://www.facebook.com"); 	//enter url
		
		//1.xpath:
		//absolute xpath is should not be used
		//only relative xpath will be used
		
		driver.findElement(By.xpath("//*[@id..'firstname']")).sendKeys("Swamy");
		driver.findElement(By.xpath("//*[@id..'lastname']")).sendKeys("Shiva");
		driver.findElement(By.xpath("//*[@id..'address1']")).sendKeys("1-81,Banjerpally");
		
		
		//2. id:
		//first priority
		
		driver.findElement(By.id("firstname")).sendKeys("Swamy");
		driver.findElement(By.id("lastname")).sendKeys("Shiva");
		
		
		//3.name:
		
		driver.findElement(By.name("firstname")).sendKeys("Akula");
		driver.findElement(By.name("lastname")).sendKeys("Hello");
		
		
		//4.lintText:
		//only for links
		
		driver.findElement(By.linkText("Sign in")).click();
		
		
		//5.partiallinkText:
		//not recommend... not useful
		
		driver.findElement(By.partialLinkText("How to click...")).click();
		
		
		
		//6.CSS Selector:
		//if id is there--- #{id}
		//if class is there--- .{class}
		
		driver.findElement(By.cssSelector("#address1")).sendKeys("1-81, banjerpally");
		driver.findElement(By.cssSelector("#address2")).sendKeys("Thoguta, Siddipet");
		
		//7.class name:
		//not useful
		
		driver.findElement(By.className("ancAsb")).click();
		
		
		
	

	}

}
