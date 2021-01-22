package Selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlealerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);

		Alert alert= driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text = alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Valid Alert message");
		}
		else {
			System.out.println("Invalid Alert message");
		}
		
		alert.accept();
		
		//alert.dismiss();
		
		
	}

}
