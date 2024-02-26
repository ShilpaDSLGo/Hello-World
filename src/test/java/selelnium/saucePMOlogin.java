    package selelnium;

	import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
    import org.testng.reporters.jq.Main;
                      

		public class saucePMOlogin{                     

			
			WebDriver driver=new ChromeDriver();	
			String URL="https://www.saucedemo.com/";
			  By userName=By.id("user-name");
			  By passWord=By.id("password");
			  By loginB=By.id("login-button");
			  
			
		 	         
				  	  @Test
				  public  void  login () {
			
				  driver.get(URL);
				 
				  driver.findElement(userName).sendKeys("standard_user");
				  driver.findElement(passWord).sendKeys("secret_sauce");
				  driver.findElement(loginB).click();
				  //driver.findElement(By.className("shopping_cart_link ")).click();
				  //driver.findElement(By.id("checkout")).click();

			}

		}
	
		/*public static WebDriver driver=new ChromeDriver();
		String URL="https://www.saucedemo.com/";
		By userName=By.id("user-name");
		By passWord=By.id("password");
		By loginB=By.id("login-button");

		@Test
		public void login () {

		driver.get(URL);
		driver.findElement(userName).sendKeys("vijay");;
		driver.findElement(passWord).sendKeys("bharathi");
		driver.findElement(loginB).click();*/

		


		


