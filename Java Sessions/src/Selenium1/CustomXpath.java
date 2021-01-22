package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		
		//absolute xpath
		////*[@id="mainContent"]/div[1]/ul/li[10]/a
		//1. performance issue
		//2. not reliable
		//3. can be changed at any time in future.
		
	
//		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Java");
//		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Hello");
//		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("World");
//		
		
		//dynamic id: input
		//id= test_123
		//By.id("test_123")
		

		//starts-with
		//id=test_123
		//id=test_234
		//id=test_456_test_235
		
		//ends-with
		//id=12323_test_t
		//id=3455_test_t
		//id=457_t_test_t
		
//		driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Test");
//		
//		driver.findElement(By.xpath("//input[starts-with(@id,'test_']")).sendKeys("Test");
//		
//		driver.findElement(By.xpath("//input[ends-with(@id,'_test_t']")).sendKeys("Test");
		
		
		//for links-custom xpath
		//all the links represented by <a> HTML tag
		
	//	driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
		
		
	}

}
