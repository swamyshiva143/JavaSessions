package Selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG {

		static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://debeissat.nicolas.free.fr/svg3d.php");

		//String color=driver.findElement(By.xpath("//*[name='svg']//*[local-name='circle']")).getAttribute("fill");
		//System.out.println(color);
//		String text=driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='text' and @id='pointline']")).getText();
//		System.out.println(text);
		
		driver.switchTo().frame("svg_result");
		while(true) {
			List<WebElement> eleList=driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='g' and @id='g2']"
					+ "//*[local-name()='path' and contains(@id,'face')]"));
			for(WebElement ele:eleList) {
				String text=null;
				text=ele.getAttribute("d");
				System.out.println(text);
			}
		}
	}

}
