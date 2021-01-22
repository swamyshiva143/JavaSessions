package Selenium1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.History;
import com.google.common.io.Files;

public class JavaScriptExecutorConceptFull {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("swamyakula2@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("lavi8978953782");
	//	driver.findElement(By.xpath("//button[@name='login']")).click();

		//executeScript==== to execute javascript code
		WebElement loginBtn= driver.findElement(By.name("login"));
		flash(loginBtn, driver);	//highlight the element

		drawBorder(loginBtn, driver); 	//to draw the border of the element
		
	//	Take screenshot and store as a file format
		
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
		//now copy the screenshot to desired location usign copyfile //method
				
		Files.copy(src, new File("C:\\Users\\Parameshwar Reddy\\Pictures\\element.png"));

		//generate Alert
		generateAlert(driver, "There is an issue with Login button on Login Page");
		
		//click on any element by using JS executor
		clickElementByJS(loginBtn, driver);
		
		//refresh the page
		//1. by using selenium
		driver.navigate().refresh();
		
		//2. by using JS executor
		refreshBrowserByJS(driver);
		
		
		//get the title of the page by JS
		System.out.println(getTitleByJS(driver));
		
		
		//get the Page Text
		System.out.println(getInnerPageText(driver));
		
		//scroll page Down
		scrollPageDown(driver);
		
		WebElement createPage= driver.findElement(By.xpath("//a[contains(@title,'Create a Page']"));
		scrollIntoView(createPage, driver);
		
	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String bgcolor= element.getCssValue("backgroundColor");
		for(int i=0; i<10; i++) {
			changeColor("rgb(0,200,0)", element, driver); //1
			changeColor(bgcolor, element, driver);
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);

		try {
			Thread.sleep(20);
		} catch(InterruptedException e) {
			
		}
		
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
				
	}
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"');");
		
	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String title= js.executeScript("return document.title;").toString();
		return title;
				
	}
	
	
	
	public static String getInnerPageText(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String sText = js.executeScript("return document.documentElement.innerText;").toString();
		return sText;
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", element);
	}
	
	
	

	
	
}
