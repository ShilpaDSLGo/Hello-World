package selelnium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeOptions;



public class JuiceShop{
	
	public static void main(String[] args) {
		org.openqa.selenium.chrome.ChromeOptions chromeOptions;
		
		chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(30));
		chromeOptions.addArguments("start-maximized");
		
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\shilp\\eclipse-workspace\\Hello-world\\src\\test\\resources\\driver\\chromedriver_win32\\chromedriver.exe");
	   WebDriver chromedriver=new ChromeDriver(chromeOptions);	
	   chromedriver.get("https://juiceshop.myspreadshop.com/");
	   chromedriver.findElement(By.id("onetrust-accept-btn-handler")).click();
	  
	  
	 
	  JavascriptExecutor jse=(JavascriptExecutor)chromedriver;
	  
	  //scroll by pixel
	  jse.executeScript("window.scrollTo(0,800)");
	  
	  //scrolling till element in view
	  //WebElement tShirt=findElement(By.xpath("//*[@id=\"sprd-content\"]/div[1]/div[2]/div/div/div/div[1]/div/div/div[1]/div/div[1]/img"));
	  //jse.executeScript("arguments[0].scrollIntoView(true)", tShirt);
	  
	  chromedriver.findElement(By.xpath("//*[@id=\"sprd-content\"]/div[8]/div[1]/a/div/div[1]/img")).click();
	  chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  jse.executeScript("window.scrollTo(0,100)");
	  chromedriver.findElement(By.id("sprd-detail-sizes__size-2")).click();//size selection
	  System.out.println("Size is selected");
	  
	 // chromedriver.findElement(By.xpath("//*[@id=\"sprd-appearance-list__appearance-1\"]/svg/use")).click();	
      //System.out.println("color is selected");
	  
	  chromedriver.findElement(By.xpath("//*[@id=\"sprd-content\"]/div[1]/div[3]/div/div[2]/button")).click();
	  System.out.println("Added to the cart");
	  jse.executeScript("window.scrollTo(0,10)");
	  chromedriver.findElement(By.xpath("//*[@id=\"sprd-basket\"]/div/div/a")).click();
	  chromedriver.findElement(By.xpath("//*[@id=\"sprd-content\"]/div/div[3]/div[3]/button")).click();
	  System.out.println("Clicked on Checkout");
	  
	  chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement emailTxtBox = chromedriver.findElement(By.id("email"));
		emailTxtBox.sendKeys("shilpa@gmail.com");
		
		jse.executeScript("window.scrollTo(0,150)");
		WebElement firstName=chromedriver.findElement(By.id("shipping_firstName"));
		firstName.sendKeys("Shilpa");
		
		WebElement lastName=chromedriver.findElement(By.id("shipping_lastName"));
		lastName.sendKeys("Alur");
		
		WebElement adress=chromedriver.findElement(By.id("field_8"));
		adress.sendKeys("567,old road");
		
		WebElement city=chromedriver.findElement(By.id("shipping_city2"));
		city.sendKeys("Newark");
		 
		System.out.println("Name and adress updated");
		
		Select dropdown=new Select (chromedriver.findElement(By.id("shipping_state")));
		dropdown.selectByIndex(13);
		
		WebElement zipcode=chromedriver.findElement(By.id("shipping_zipCode2"));
		zipcode.sendKeys("12345");
		
		chromedriver.findElement(By.xpath("//*[@id=\"shipping\"]/fieldset/div[1]/label[1]/div")).click();
		
		WebElement phoneNum=chromedriver.findElement(By.id("field_1"));
		phoneNum.sendKeys("1234523434");
	
		
		chromedriver.findElement(By.id("completeShipping")).click();
		System.out.println("Ready to ship");
		
	  
	  
	  
	}

	


}
