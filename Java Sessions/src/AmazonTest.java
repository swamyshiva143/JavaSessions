package WebDriverDesign;

public class AmazonTest {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.findElement("swamyshiva");
		driver.close();
		driver.quit();
	}

}
