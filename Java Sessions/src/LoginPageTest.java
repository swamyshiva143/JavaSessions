package Selenium2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LoginPageTest {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
	
		//how to read the properties file
		Properties prop= new Properties();
		FileInputStream ip= new FileInputStream("D:\\Swamyshiva\\swamyshiva\\JavaSessions\\src\\config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		String browserName= prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			 driver= new FirefoxDriver();
		}
		else if(browserName.equals("safari")) {
			driver= new SafariDriver();
			}
		else {
			System.out.println("no browser value is given");
		}
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.name(prop.getProperty("username_name"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("loginBtn_xpath"))).click();
	}
		

	}

