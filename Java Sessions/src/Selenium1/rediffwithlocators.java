package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediffwithlocators {

	public static void main(String[] args) throws NoSuchElementException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	
		
		driver.findElement(By.xpath("//input[starts-with(@name,'name']")).sendKeys("Swamyshiva Akula");
		driver.findElement(By.name("login87317a08")).sendKeys("swamyakula2");
		driver.findElement(By.className("btn_checkavail")).click();
		driver.findElement(By.name("passwd87317a08")).sendKeys("helloworld@123");
		driver.findElement(By.name("confirm_passwd87317a08")).sendKeys("helloworld@123");
		driver.findElement(By.name("altemail87317a08")).sendKeys("shivasms31008@gmail.com");
		driver.findElement(By.name("chk_altemail87317a08")).click();
		driver.findElement(By.id("mobno")).sendKeys("7095316055");
		
		Select select= new Select(driver.findElement(By.name("DOB_Day87317a08")));
		select.selectByVisibleText("02");
		
		Select select1 = new Select(driver.findElement(By.name("DOB_Month87317a08")));
		select1.selectByVisibleText("11");
		
		Select select2 = new Select(driver.findElement(By.name("DOB_Year87317a08")));
		select2.selectByVisibleText("1992");
		
		driver.findElement(By.name("gender87317a08")).click();
		
		Select select3= new Select(driver.findElement(By.id("country")));
		select3.selectByVisibleText("India");

		
		Select select4= new Select(driver.findElement(By.name("city87317a08")));
		select4.selectByVisibleText("Goa");
		
		
	}

}
