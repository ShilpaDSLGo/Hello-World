package scrappingWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class googleScraping {

	public static void main(String[] args) {
//	chromeOptions =new ChromeOptions () ;
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
	WebDriver driver =new ChromeDriver ();
	
	driver.get("https://www.amazon.com/");
	
	}

}
