package selelnium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class saucedemo{

	public static void main(String[] args) {
		
		org.openqa.selenium.chrome.ChromeOptions chromeOptions;
		
		chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(30));
		chromeOptions.addArguments("start-maximized");
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\shilp\\eclipse-workspace\\Hello-world\\src\\test\\resources\\driver\\chromedriver_win32\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver(chromeOptions);	
		  driver.get("https://www.saucedemo.com/");
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  WebElement userName=driver.findElement(By.id("user-name"));
		  userName.sendKeys("standard_user");
		  
		  WebElement passWord=driver.findElement(By.id("password"));
		  passWord.sendKeys("secret_sauce");
		  
		  driver.findElement(By.id("login-button")).click();
		  
		  WebElement clickable = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
	       new Actions(driver).moveToElement(clickable);
		 
		  driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"] ")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"] ")).click();
		  driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"] ")).click();
		  
		  System.out.println("Products added to the cart");
		  
		  WebElement iframe = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
	        new Actions(driver)
	                .scrollToElement(iframe)
	                .perform();
		  driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();

		  WebElement checkout = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
	        new Actions(driver)
	                .scrollToElement(checkout)
	                .perform();
	        
	      driver.findElement(By.id("checkout")).click();
	        System.out.println("Clicked on Checkout ");
	        
	        
	        WebElement firstname=driver.findElement(By.id("first-name"));
			  firstname.sendKeys("Shruti");
			  
			  WebElement lastname=driver.findElement(By.id("last-name"));
			  lastname.sendKeys("Gopal");
			  
			   WebElement zipcode=driver.findElement(By.id("postal-code"));
			  zipcode.sendKeys("123444");
			  
			  driver.findElement(By.id("continue")).click();
			  
			  System.out.println("First name and last name entered");
			
			
	}
		  
	}


