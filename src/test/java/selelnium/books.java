package selelnium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class books {

	public static void main(String[] args) throws InterruptedException {
		org.openqa.selenium.chrome.ChromeOptions chromeOptions;
		
		
		chromeOptions=new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy .NORMAL);
		chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(30));
		chromeOptions.addArguments("start-maximized");
		
		System.setProperty("windows.chrome.driver","\"C:\\\\Users\\\\shilp\\\\eclipse-workspace\\\\Hello-world\\\\src\\\\test\\\\resources\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://demoqa.com/books ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("window.scrollTo(0,150)");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("login")).click();
		 
		 
		 driver.findElement(By.id("newUser")).click();
		 
		 driver.findElement(By.id("firstname")).sendKeys("Sthuti");
		 driver.findElement(By.id("lastname")).sendKeys("Sthi");
		 driver.findElement(By.id("userName")).sendKeys("Sthuti123");
		 driver.findElement(By.id("password")).sendKeys("Sthuti123");
		 
		 System.out.print("Username and password and entered");
		 
		 
		 //I am not robot button not clicking.
		 
		 driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1] ")).click();
		 
		 driver.findElement(By.id("register")).click();
		 
		 System.out.print("Registered as new user");
		 
		 
	}

}
