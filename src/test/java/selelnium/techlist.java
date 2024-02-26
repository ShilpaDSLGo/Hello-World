package selelnium;

import java.time.Duration;
import java.util.Arrays;

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

public class techlist {

	public static void main(String[] args) {
org.openqa.selenium.chrome.ChromeOptions chromeOptions;
		
		chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(30));
		chromeOptions.addArguments("start-maximized");
		
		
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\shilp\\OneDrive\\Documents\\chromedriver.exe");
	   	
	   WebDriver driver=new ChromeDriver(chromeOptions);
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	   
	   //JavascriptExecutor jse=(JavascriptExecutor) chromeOptions;
       //jse.executeScript( "window.scrollTo(0,500)");

	   //scroll by element
	    /*Actions action = new Actions(driver);
	      WebElement element = driver.findElement(By.xpath("//*[@id=\\\"post-body-3077692503353518311\\\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input"));
	      action.scrollToElement(element).click(element).perform();*/
	   
	   
	   //SCROLL by amt using actions and it works
	   
	   Actions action = new Actions(driver);
	   action.scrollByAmount(0, 1000);
	   
	   WebElement firstName=driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input"));
		firstName.sendKeys("Shdcbnmza");
		
		WebElement lastName=driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input"));
		lastName.sendKeys("Ahzbxch");

	   //driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input")).sendKeys("Satvik");
	   
		action.scrollByAmount(0,30000);
		
	   System.out.println("First name entererd");
	   
	   
	   driver.findElement(By.xpath("//*[@id=\"sex-1\"] ")).click();
	   driver.findElement(By.xpath("//*[@id=\"exp-3\"] ")).click();
	   
	  
	   
	   driver.findElement(By.xpath("//*[@id=\"datepicker\"] ")).sendKeys("4/13/2023");
	   
	   
	   Actions action1=new Actions(driver);
	   action1.scrollByAmount(0, 10000).perform();
	   
	   driver.findElement(By.xpath("//*[@id=\"profession-1\"] ")).click();
	   driver.findElement(By.xpath("//*[@id=\"tool-2\"] ")).click();
	   
	   System.out.println("profession and tools selected");
	   
	   driver.findElement(By.id("continents"));
	   //Select dropdown =new Select(driver.findElement(By.xpath("//*[@id=\\\"continents\\\"]/option[4] ")));
		//dropdown.selectByVisibleText("Australia");
		
	   driver.findElement(By.xpath("//*[@id=\"continents\"]/option[4]")).click();
	   
	   driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[2]")).click();
	   
	   //driver.findElement(By.id("photo")).click();
	   //driver.findElement(By.id("tool-2 ")).click();
	   
	   WebElement Photo = driver.findElement(By.id("photo"));
	   Photo.sendKeys("C:\\Users\\shilp\\OneDrive\\Desktop");
	   
	   System.out.println("Photo Uploaded");
	   
	}

}
