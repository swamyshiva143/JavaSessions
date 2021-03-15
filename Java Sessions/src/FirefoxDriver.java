package WebDriverDesign;

public class FirefoxDriver implements WebDriver {
	
	public FirefoxDriver() {
		System.out.println("launch the browser");
	}
	@Override
	public void get(String url) {
		System.out.println("launch the url: "+ url);
		
	}

	@Override
	public void findElement(String locator) {
		System.out.println("finding the element: "+ locator);
		
	}

	@Override
	public void close() {
		System.out.println("closing the browser");
		
	}

	@Override
	public void quit() {
		System.out.println("quit all the browsers");
		
	}

}
