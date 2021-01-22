package Selenium2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		 WebDriver driver =  new ChromeDriver();	//launch browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.amazon.com");
		
		//1.get the list of all the links and images
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("size of all the links and images....:"+linksList.size());
		
		List<WebElement> activeLinks= new ArrayList<WebElement>();
		
		//2.iterate linkslist... exclude all the images, links which doesnot have 'href' attributes.
		
		for(int i=0; i<linksList.size();i++) {
			System.out.println(linksList.get(i).getAttribute("href"));
			if(linksList.get(i).getAttribute("href")!=null && (!linksList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linksList.get(i));
			}
		}
	
		// get the size of active links list:
		
		System.out.println("size of active links and images----"+ activeLinks.size());
		
		
		//check the href url, with the httpconnections api:
		//200---ok
		//400---bad request
		//404--- not found
		//500-- internal error
		
		for(int j=0; j<activeLinks.size();j++) {
			HttpURLConnection connection= (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response= connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"---------->"+ response);
			
		}
		
		
		
	}

	
}
