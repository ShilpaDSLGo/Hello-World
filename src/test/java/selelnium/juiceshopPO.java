package selelnium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class juiceshopPO {
	
	public  ChromeOptions chromeOptions =new ChromeOptions();
	public  WebDriver driver=new ChromeDriver ();
	
	String URL="https://juice-shop.herokuapp.com/#/register";
	
	 //By cookies=By.xpath("//span[@id='cookieconsent:desc']");
	By dismissBtn = By.xpath("//button//span[text()='Dismiss']");
	By PopUp = By.xpath("//a[text()='Me want it!']");
	 
	 
	  By email=By.id("emailControl");
	  By passWord=By.id("passwordControl");
	  By repeatpwd=By.id("repeatPasswordControl");
	  By scurityQ=By.id("mat-select-value-1");
	  
	  By zip=By.partialLinkText(" Your ZIP/postal code when you were a teenager? ");
	  /*By scurityQ=By.id("mat-select-value-1");
	  By scurityQ=By.id("mat-select-value-1");
	  By scurityQ=By.id("mat-select-value-1");*/
	  
	  @Test
	public  void  juiceshop (){
		  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		driver.get(URL);
		driver.findElement(dismissBtn).click();
		
		driver.findElement(PopUp).click();
	    driver.navigate().refresh();
	 //Alert alert=driver.switchTo().alert();
	 //alert.dismiss();
		
		  driver.switchTo().alert().accept();
		  driver.findElement(email).sendKeys("krishna@gmail.com");
		  driver.findElement(passWord).sendKeys("krishna");
		  driver.findElement(repeatpwd).sendKeys("standard_user");
		 /* driver.findElement(scurityQ).click();
		  driver.findElement(scurityQ).click();
		  driver.findElement(scurityQ).click();
		  driver.findElement(scurityQ).click();*/
	}

}
