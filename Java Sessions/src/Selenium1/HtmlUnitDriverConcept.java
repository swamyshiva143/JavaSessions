package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//in place of ChromeDriver---- we can replace it with  HtmlUnitDriver()...
		// to get console without opening browser.....
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sms31008@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("lavi8978953782");
		driver.findElement(By.name("login")).click();

		System.out.println(driver.getTitle());
	}

}
