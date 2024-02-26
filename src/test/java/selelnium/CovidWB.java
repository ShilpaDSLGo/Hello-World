package selelnium;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CovidWB {

	public static void main(String[] args) throws InterruptedException {
		
		org.openqa.selenium.chrome.ChromeOptions chromeOptions;
		chromeOptions=new ChromeOptions();
		chromeOptions.setAcceptInsecureCerts(true);// this will security error in the opening the web site 
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(30));
		chromeOptions.addArguments("start-maximized");
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shilp\\eclipse-workspace\\Hello-world\\src\\test\\resources\\driver\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(chromeOptions);	
		driver.get("https://westbengal.covidsafe.in/");
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 300).perform();
		
		//for (int i= 2; i<=30;i++) {
		
			String hospname=driver.findElement(By.xpath("///*[@id='root']/div/div/div[2]/div[2]/div/div/div/div[2]")).getText();
			System.out.println("The names of the hospitals are :"+ hospname);
		//}
		
	}

}
