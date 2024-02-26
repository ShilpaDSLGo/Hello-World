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
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class TurorialsNinja {

	public static void main(String[] args) {
		org.openqa.selenium.chrome.ChromeOptions chromeOptions;
		chromeOptions=new ChromeOptions();
		
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(30));
		chromeOptions.addArguments("start-maximized");
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shilp\\eclipse-workspace\\Hello-world\\src\\test\\resources\\driver\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(chromeOptions);	
		driver.get("https://tutorialsninja.com/demo/index.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Changing the currency.
		
		WebElement selectCurrency = driver.findElement(By.id("form-currency"));
		selectCurrency.click();
		Reporter.log("selectCurrency selected as Euro");
		
		WebElement currencyName = driver.findElement(By.name("EUR"));
		currencyName.click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,600)");
		
		System.out.println("scrolled down");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/div[3]/button[1]")).click();
		
		System.out.println("Chose the product");
		
		JavascriptExecutor jse1=(JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0,800)");
		
		/*Select dropdown2 =new Select(driver.findElement(By.id("input-option226")));
		dropdown2.selectByIndex(1);
		
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		
		driver.findElement(By.id("button-cart")).click();
		System.out.println("Camera added to the cart");*/
		
		driver.findElement(By.xpath("//*[@id=\"product-product\"]/ul/li[1]/a/i")).click();
		
		//clicked on the Iphone
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/h4/a")).click();
		
		jse1.executeScript("window.scrollTo(0,600)");
		
		
		WebElement quantity=driver.findElement(By.id("input-quantity"));
		quantity.clear();
		quantity.sendKeys("2");
		
		
		driver.findElement(By.id("button-cart")).click();
		
		System.out.println("Iphone added to the cart");
		
		driver.findElement(By.xpath("//*[@id='cart']/button")).click();
		driver.findElement(By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[1]/strong")).click();
		
		WebElement quantity1=driver.findElement(By.xpath("//div[@class='input-group btn-block']/input"));
		quantity1.clear();
		quantity1.sendKeys("3");
		
		driver.findElement(By.xpath("//div[@class='input-group btn-block']/span/button")).click();
		System.out.println("Updated the Iphone quantity to 3");
		
		jse1.executeScript("window.scrollTo(0,1000)");
		
		WebElement Ecotax= driver.findElement(By.xpath("//*[@id='content']/div[2]/div/table/tbody/tr[2]/td[2]"));
		System.out.println("The Eco tax is : " + Ecotax.getText());
	
		
		WebElement VAT= driver.findElement(By.xpath("//*[@id=\'content\']/div[2]/div/table/tbody/tr[3]/td[2]"));
		System.out.println("The VAt is : "+ VAT.getText());
		
		driver.findElement(By.partialLinkText("Checkout")).click();
		
		driver.findElement(By.xpath("//*[@id=\"checkout-checkout\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@class='input-group btn-block']//button[2]/i")).click();
		
		System.out.println("Emptied the cart");
		//Clicking  on the home page
		driver.findElement(By.xpath("//*[@id=\"error-not-found\"]/ul/li[1]/a/i")).click();
		
		Actions action = new Actions(driver);
		   action.scrollByAmount(0, 600);
		
		   // clicked on mac book
		   driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]/div/div[3]/button[1]")).click();
		   
		   // clicked on cart
		   driver.findElement(By.xpath("//*[@id='top-links']//i[@class='fa fa-shopping-cart']")).click();
		   System.out.println("macbook added to the cart");
		   action.scrollByAmount(0, 1000);
		   
		   driver.findElement(By.xpath("//div[@id='accordion']/div/div/h4/a")).click(); 
		   driver.findElement(By.id("input-coupon")).sendKeys("ABCD123");
		   driver.findElement(By.id("button-coupon")).click();
		   
		   System.out.println("Coupon entered");
		   WebElement errorMessage=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		   System.out.println(errorMessage.getText());
		   
		   action.scrollByAmount(0, 1000).perform();
		   driver.findElement(By.id("input-coupon")).clear();
		   driver.findElement(By.xpath("//div[@class='buttons clearfix']/div[2]/a")).click(); 
		   System.out.println("Clicked on checkout");
	}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
