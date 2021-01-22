package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://api.cogmento.com/register/");
		
		//1.isDisplayed() method; its applicable for all the web elements
		boolean b1= driver.findElement(By.name("action")).isDisplayed();
		System.out.println(b1);
		
		
		//2.isEnabled() method;
		boolean b2= driver.findElement(By.name("action")).isEnabled();
		System.out.println(b2);
		
		//Select I agree to terms button
		driver.findElement(By.id("terms")).click();
		boolean b3= driver.findElement(By.name("action")).isEnabled();
		System.out.println(b3);
		
		
		//3.isSelected() method: only for checkbox, dropdowns, radiobutton
		boolean b4= driver.findElement(By.id("terms")).isSelected();
		System.out.println(b4);
		
		
		//deselect the checkbox
		driver.findElement(By.id("terms")).click();
		boolean b5= driver.findElement(By.id("terms")).isSelected();
		System.out.println(b5);
		
		
	}

}
