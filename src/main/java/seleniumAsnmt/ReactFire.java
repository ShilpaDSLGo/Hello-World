package seleniumAsnmt;

import java.time.Duration;

import org.apache.logging.log4j.core.appender.rolling.action.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReactFire {

	public static void main(String[] args) {
		// what's the use of this line ??
		org.openqa.selenium.chrome.ChromeOptions chromeOptions;
		chromeOptions=new ChromeOptions();
		
		chromeOptions.setPageLoadStrategy(PageLoadStrategy .NORMAL);
		
		System.setProperty("windows.chrome.driver","\"C:\\\\Users\\\\shilp\\\\eclipse-workspace\\\\Hello-world\\\\src\\\\test\\\\resources\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get(" https://react-shopping-cart-67954.firebaseapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,300)");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/main/div/div[1]/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/main/div/div[4]/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/main/div/div[6]/button")).click();
		
		System.out.println("Product added to the cart");
		
		
		jse.executeScript("window.scrollTo(0,100)");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/button")).click();
		//Thread.sleep(1000);
		System.out.println("Clicked on chekout");
			
		//ask abt this to Vijay
		driver.switchTo().alert().accept();
	
	
	}

}
