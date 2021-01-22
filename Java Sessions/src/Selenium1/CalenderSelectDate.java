package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderSelectDate {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		
		String date= "18-September-2020";
		String dateArr[]=date.split("-"); //18, September, 2020
		String day= dateArr[0];
		String month=dateArr[1];
		String year=dateArr[2];
		
		Select select= new Select(driver.findElement(By.name("slctmonth")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.name("slctyear")));
		select1.selectByVisibleText(year);
		
		
	
		
		String beforexpath= "//*[@id='crmcalendar]/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterxpath= "]/td[";
		
		final int totalWeekDays= 7;
		
		//2-1 2-2 2-3 2-4 2-5 2-6 2-7
		//3-1 3-2 3-3 3-4 3-5 3-6 3-7
		
		boolean flag= false;
		String dayVal= null;
		
		for(int rowNum=2; rowNum<=7; rowNum++) {
			
			for(int colNum=1; colNum<=totalWeekDays; colNum++) {
				
				try {
					dayVal=driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+ "]")).getText();
					
				}
				catch(NoSuchElementException e) {
					System.out.println("Please enter a valid date value");
					flag= false;
					break;
				}
				System.out.println(dayVal);
				if(dayVal.equals(day)) {
					driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+ "]")).click();
					flag= true;
					break;
				}
			}
			
			if(flag) {
				break;
			}
		}
		
		

	}

}
