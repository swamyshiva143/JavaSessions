package Selenium2;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DisabledImageOptions {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
//		ChromeOptions options= new ChromeOptions();
//		disabledImageChrome(options);
//		
//		WebDriver driver= new ChromeDriver(options);
//		driver.get("http://www.amazon.com");
//		System.out.println(driver.getTitle());
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Swamyshiva\\swamyshiva\\geckodriver\\geckodriver.exe");
		FirefoxOptions options= new FirefoxOptions();
		disabledImageFirefox(options);
		WebDriver driver= new FirefoxDriver(options);
		
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());

	}

	public static void disabledImageChrome(ChromeOptions options) {
		HashMap<String , Object> images= new HashMap<String, Object>();
		images.put("images", 2);
		HashMap<String, Object> prefs= new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values", images);
		
		options.setExperimentalOption("prefs", prefs);
		
	}

	public static void disabledImageFirefox(FirefoxOptions options) {
		FirefoxProfile profile= new FirefoxProfile();
		profile.setPreference("permissions.default.image", 2);
		options.setProfile(profile);
		options.setCapability(FirefoxDriver.PROFILE, profile);
	}
}
