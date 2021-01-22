package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillocators {

	public static void main(String[] args) throws NoSuchElementException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&dsh=S-636868705%3A1608129082227294&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		
		driver.findElement(By.name("firstName")).sendKeys("Swamy");
		driver.findElement(By.id("lastName")).sendKeys("Shiva");
		driver.findElement(By.name("Username")).sendKeys("akulaswamyshiva");
		driver.findElement(By.name("Passwd")).sendKeys("helloworld@123");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("helloworld@123");
		driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe")).click();
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		
		
//		driver.findElement(By.cssSelector("#firstName")).sendKeys("hello");
//		driver.findElement(By.cssSelector("#lastName")).sendKeys("Jimmm");
//		driver.findElement(By.cssSelector("#username")).sendKeys("dingdoonl");
		
//		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Helloo");
//		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("world");

	}

}
