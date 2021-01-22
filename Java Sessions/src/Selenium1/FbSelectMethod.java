package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSelectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.name("firstname")).sendKeys("Swamy");
		driver.findElement(By.xpath("//*[@id=\"u_0_p\"]")).sendKeys("Akula");
		driver.findElement(By.cssSelector("#u_0_s")).sendKeys("swamyakula2@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("helloworld@123");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("swamyakula2@gmail.com");
		
		Select select= new Select(driver.findElement(By.name("birthday_day")));
		select.selectByVisibleText("2");

		Select select1= new Select(driver.findElement(By.name("birthday_month")));
		select1.selectByVisibleText("Jan");
		
		Select select2= new Select(driver.findElement(By.name("birthday_year")));
		select2.selectByVisibleText("1992");
		
//		Select select3=new Select(driver.findElement(By.className("_58mt")));
//		select3.selectByVisibleText("Male");
		
		driver.findElement(By.linkText("Male")).click();
		driver.findElement(By.name("websubmit")).click();
	}

}
