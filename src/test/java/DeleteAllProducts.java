import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteAllProducts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver94\\\\chromedriver.exe");												
	WebDriver driver=new ChromeDriver();									
	ChromeOptions options = new ChromeOptions();								
	options.addArguments("--disable-notifications");									
	driver=new ChromeDriver(options);								
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);									
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://staging-v2-website.cosmetize.com/");
	driver.findElement(By.id("user-menu")).click();		
	driver.findElement(By.id("email")).sendKeys("mbadgujar100@gmail.com");								
	driver.findElement(By.name("password")).sendKeys("Asdf@123");
	driver.findElement(By.cssSelector("button[type= 'submit']")).click();	
	Thread.sleep(3000);
	driver.get(driver.getCurrentUrl());
	driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/a[2]")).click();//go to cart
	Thread.sleep(2000);

	
	int i;
	for (i = 0; i<19;  ) {
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/a[2]/*[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		i++;
		}
	
	

	
	
	}

}
