package selelnium;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Petshop {

	public static void main(String[] args) {
		org.openqa.selenium.chrome.ChromeOptions chromeOptions;
		chromeOptions=new ChromeOptions();
		
		chromeOptions.setPageLoadStrategy(PageLoadStrategy .NORMAL);
		
		System.setProperty("windows.chrome.driver","\"C:\\\\Users\\\\shilp\\\\eclipse-workspace\\\\Hello-world\\\\src\\\\test\\\\resources\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(chromeOptions);
		
		driver.get( "https://petstore.octoperf.com/actions/Catalog.action");
		
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[2]/img ")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a ")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]")).click();
		System.out.println("Dog added to the cart");
		
		
		driver.findElement(By.id("BackLink")).click();
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[5]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		System.out.println("Bird added to the cart");
	
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
		
		 WebElement userid=driver.findElement(By.id("stripes--1995824763"));
		 userid.sendKeys("secret1");
		 System.out.println("Entered the user id");
		  WebElement passWord=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[2]/td[2]/input"));
		  passWord.sendKeys("secret_sauce");
		  
		  WebElement passWord2=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input"));
		  passWord2.sendKeys("secret_sauce");
		  
		  WebElement firstname=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[1]/td[2]/input"));
		  firstname.sendKeys("Aruni");
		  
		  WebElement lastname=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[2]/td[2]/input"));
		  lastname.sendKeys("secret");
		  
		  WebElement email=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[3]/td[2]/input"));
		  email.sendKeys("secretsauce@gmail.com");
		  
		  WebElement phonenumber=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[4]/td[2]/input"));
		  phonenumber.sendKeys("123456780");
		  
		  WebElement adress=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[5]/td[2]/input"));
		  adress.sendKeys("123 drive, godo");
		  
		  WebElement city=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[7]/td[2]/input"));
		  city.sendKeys("London");
		  
		  WebElement state=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[8]/td[2]/input"));
		  state.sendKeys("secret_sauce");
		  
		  WebElement zip=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[9]/td[2]/input"));
		  passWord.sendKeys("12345");
	}

}
