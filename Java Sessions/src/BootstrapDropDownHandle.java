package Selenium2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();

		List<WebElement> list= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//a//label"));
		System.out.println(list.size());
		Thread.sleep(10000);
		
//		//selecting all the checkboxes/options;
//		for(int i=0; i<list.size();i++) {
//			System.out.println(list.get(i).getText());
//			list.get(i).click();
//		
//		}
		//selecting individual option
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Java")) {
			
				list.get(i).click();
				break;
			}
			
		
		}
	}

}
