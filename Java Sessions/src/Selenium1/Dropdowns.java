package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

public class Dropdowns {

	public static void main(String[] args) throws UnexpectedTagNameException {
		
			System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		
		driver.get("https://passport.alibaba.com/member/us/reg/fast/union_reg.htm?_regfrom=ICBU_UNION_REG&_lang=en_US&_regbizsource=main_page&tg=https%3A%2F%2Fwww.alibaba.com%2F%3F__redirected__%3D1");

		Select select = new Select(driver.findElement(By.id("language-switch")));
		select.selectByVisibleText("English");
		
		Select select1 = new Select(driver.findElement(By.className("next-select-inner")));
		select1.selectByVisibleText("China");
	}

}
