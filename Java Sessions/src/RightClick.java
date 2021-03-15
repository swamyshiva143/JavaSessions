package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		Actions action= new Actions(driver);
		WebElement rightClickButton= driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(rightClickButton).build().perform();
		
		WebElement copy= driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		String copyText= copy.getText();
		System.out.println(copyText);

	}

}
