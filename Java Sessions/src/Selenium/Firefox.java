package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Swamyshiva\\swamyshiva\\geckodriver-0.26.0\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
	}

}
