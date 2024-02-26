package selelnium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.interactions.Actions;

public class SeleniumPracticeform {

	public static void main(String[] args) throws InterruptedException {
		
		
		org.openqa.selenium.chrome.ChromeOptions chromeOptions;
		chromeOptions=new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy .NORMAL);
		chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(30));
		chromeOptions.addArguments("start-maximized");
		
		System.setProperty("windows.chrome.driver","\"C:\\\\Users\\\\shilp\\\\eclipse-workspace\\\\Hello-world\\\\src\\\\test\\\\resources\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("window.scrollTo(0,300)");
		
		driver.findElement(By.id("banner-accept")).click();
		
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Sthuti");
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Sthuti");
		Thread.sleep(1000);
		
		 WebElement iframe = driver.findElement(By.tagName("iframe"));
	     WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(iframe);
	        new Actions(driver)
	                .scrollFromOrigin(scrollOrigin, 0, 300)
	                .perform();
	        
	
	        
	        
		//driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[3]/td[2]/input[2]")).click();
		 /*WebElement clickable = driver.findElement(By.xpath("mainContent\\\"]/div[4]/div/form/table/tbody/tr[3]/td[2]/input[2]"));
	        new Actions(driver).moveToElement(clickable)
	                .click(clickable);*/
	                
		
		System.out.println("Gender Selected");
		
		//selecting experience
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div//tr[4]/td[2]/span[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[5]/td[2]/input")).sendKeys("4-11-2023");
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[6]/td[2]/span[2]/input")).click();
		
		WebElement Photo = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[7]/td[2]/input"));
		Photo.sendKeys("\"C:\\Users\\shilp\\OneDrive\\Desktop\\Selenium\\images.jpg\"");

		System.out.println("Photo uploaded");
		
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[6]/td[2]/span[2]/input")).click();
		
		// Selecting the continents
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[9]/td[2]/select"));
		Select continets=new Select(driver.findElement(By.partialLinkText("Australia")));
		continets.selectByVisibleText("Switch Commands");
		
		
		//selecting selenium commands
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[10]/td[2]/select"));
		Select Scommands=new Select(driver.findElement(By.partialLinkText("Switch Commands")));
		Scommands.selectByVisibleText("Switch Commands");
	}

}
