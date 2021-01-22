package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		//driver.findElement(By.name("ctl00$mainContent$txt_Fromdate"));
		
		//driver.switchTo().frame(0);
//		
//		WebElement date= driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']"));
//		String dateVal= "30-12-2020";
//		selectDateByJS(driver, date, dateVal);
//		Thread.sleep(5000);
		
		WebElement dates= driver.findElement(By.xpath("//input[@type='text' and @id='ctl00_mainContent_view_date2']"));
		String dateVals= "20-1-2022";
		selectDatesByJS(driver, dates, dateVals);
		Thread.sleep(10000);
		
		
	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	
	Select select= new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
	select.selectByVisibleText("3");
		
	Select select1= new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
	select1.selectByVisibleText("2");
	
	Select select2= new Select(driver.findElement(By.xpath("//select[contains(@name,'ctl00$mainContent$ddl_Infant')]")));
	select2.selectByVisibleText("4");
	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
		
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"')", element);
		
		
	}
public static void selectDatesByJS(WebDriver driver, WebElement element, String dateVals) {
		
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVals+"')", element);

}
}