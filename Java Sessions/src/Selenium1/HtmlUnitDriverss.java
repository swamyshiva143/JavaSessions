package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverss {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver =  new HtmlUnitDriver();
		//WebDriver driver= new ChromeDriver();
		
		//No HtmlUnitBrowser after Selenium 3.x version
		//We have to download it from browser as HtmlUnitDriver download
		
		//Advantage:
		//1.Testing is happening behind the Scene... no browser is launched
		//2. too fast.... excecution of the test cases.... very fast.... performance of the script.
		
		//Disadvantage is
		//Its not Suitable for Actions Classes... MouseMovement, doubleClick, drag and drop
		
		//Also called as Ghost Driver---- or HeadlessBrowser...
		//Htmlunitdriver-Java
		//PhantomJS- JAvascript
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		driver.get("http://www.facebook.com");
		
		System.out.println("Before login, title is:====" + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sms31008@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("lavi8978953782");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sms31008@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("lavi8978953782");
//		driver.findElement(By.name("login")).click();

		System.out.println("After login, title is:=====" + driver.getTitle());
	}

}
