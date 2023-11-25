package web_collect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Virtual_driver {

	WebDriver driver;
	
	String name = "webdriver.gecko.driver";
	String path = "C://Users//email//Desktop//MSU//Fall2023//BIS 3523-01 Advanced Languages I//geckodriver-v0.33.0-win64//geckodriver.exe";
	String url;
	
	public void firefox(String input_url) {
		
			System.setProperty(name, path);
			
			driver = new FirefoxDriver();
			
			url = input_url;
	}
}
