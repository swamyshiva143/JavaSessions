package Sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikulitest {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/watch?v=BHRAspZMyuM");
		
		Screen s = new Screen();
		
//		Pattern PauseImg= new Pattern("YT_Pause.png");
//		s.wait(PauseImg,2000);
//		s.click();
//		s.click();

		Pattern settingsImg = new Pattern("YT_Setting.png");
		s.wait(settingsImg, 3000);
		s.click();
		s.click();
	
	}

}

