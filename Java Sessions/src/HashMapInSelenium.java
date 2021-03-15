package Selenium2;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HashMapInSelenium {

	public static void main(String[] args) {
		//E-commerce platform
		//Role based-- permission based use case
		//Category manager user- go to th app----> add all the products
		//Customer user--- go to th app----> buy a product--->place an order
		//admin user-----go to th app----> can see all the orders
		//seller user----go to th app----> can see only those orders which are relevent
		//Distributor user--- go to th app----> can see respective order
		// Delivery boy user---go to th app----> can see the orders and deliver the product
		//Customer Care user--go to th app----> help to the customers
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://ui.cogmento.com/");
		
//		driver.findElement(By.name("email")).sendKeys("swamyshiva");
//		driver.findElement(By.name("password")).sendKeys("test@12323");
		
		System.out.println(getCredentialsMap());
		System.out.println(getCredentialsMap().get("customer"));
		
		String credentials_customer=getCredentialsMap().get("customer");
		
		driver.findElement(By.name("email")).sendKeys(getUserName("customer"));
		driver.findElement(By.name("password")).sendKeys(getPassword("customer"));
		

	}
	
	public static HashMap<String, String> getCredentialsMap(){
		HashMap<String, String> userMap= new HashMap<String, String>();
		
		userMap.put("customer", "swamyshiva:Test@123");
		userMap.put("admin", "hero:Test@123345");
		userMap.put("distributor", "babbu:hell@123");
		userMap.put("seller", "jannu:jann@123");
		userMap.put("deliveryBoy", "swamyshiva:Test@123");
		
		return userMap;
				
	}
	
	public static String getUserName(String role) {
		String credentials= getCredentialsMap().get(role);
		return credentials.split(":")[0];
	}
	
	public static String getPassword(String role) {
		String credentials =getCredentialsMap().get(role);
		return credentials.split(":")[1];
	}

}
