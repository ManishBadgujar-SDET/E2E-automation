package stepDefinitions;																									
																									
import java.util.NoSuchElementException;																									
import java.util.concurrent.TimeUnit;																									
import org.openqa.selenium.By;																									
import org.openqa.selenium.StaleElementReferenceException;																									
import org.openqa.selenium.WebDriver;																									
import org.openqa.selenium.WebElement;																									
import org.openqa.selenium.chrome.ChromeDriver;																									
import org.openqa.selenium.chrome.ChromeOptions;																									
import org.openqa.selenium.support.ui.ExpectedConditions;																									
import org.openqa.selenium.support.ui.WebDriverWait;																									
																									
import io.cucumber.java.en.And;																									
import io.cucumber.java.en.Given;																									
import io.cucumber.java.en.Then;																									
import io.cucumber.java.en.When;																									
																									
public class E2E {																									
	WebDriver driver = null;																								
@Given("browser is open")																									
public void browser_is_open() {																									
// Write code here that turns the phrase above into concrete actions																									
	System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver94\\\\chromedriver.exe");																								
	ChromeOptions options = new ChromeOptions();																								
options.addArguments("--disable-notifications");																									
driver=new ChromeDriver(options);																									
																									
//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);																									
driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);																									
//driver.manage().window().maximize();																									
}																									
																									
@And("enter {string} Site")																									
public void enter_site(String string) {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.manage().window().maximize();																								
	driver.get("https://staging-v2-website.cosmetize.com/");																								
																									
}																									
																									
@And("click on Login button")																									
public void click_on_login_button() {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.id("user-menu")).click();																								
}																									
																									
@And("user enters username and password")																									
public void user_enters_username_and_password() {																									
// Write code here that turns the phrase above into concrete actions			
	//mbadgujar100@gmail.com
	//Asdf@123
	driver.findElement(By.id("email")).sendKeys("mbadgujar100@gmail.com");																								
	driver.findElement(By.name("password")).sendKeys("Asdf@123");																								
																									
}																									
																									
@And("click on signin button")																									
public void click_on_signin_button() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.cssSelector("button[type= 'submit']")).click();																								
	Thread.sleep(5000);																								
																									
}																									
																									
@And("click  on brands button in the home page")																									
public void click_on_brands_button_in_the_home_page() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.get(driver.getCurrentUrl());																								
	driver.findElement(By.xpath("//a[contains(text(),'Brands')]")).click();																								
	Thread.sleep(3000);																								
}																									
																									
@And("click on adore product")																									
public void click_on_adore_product() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[2]/div[1]/nav/ul/ul/div[2]/nav/div/div/div[2]/div[2]/div/a[1]/img")).click();																									
Thread.sleep(3000);																									
																									
}																									
																									
@And("add the product to cart1")																									
public void add_the_product_to_cart1() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.get(driver.getCurrentUrl());																								
driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();																									
//Thread.sleep(3000);																									
WebDriverWait wait = new WebDriverWait(driver, 30);																									
	wait.ignoring(NoSuchElementException.class);																								
	wait.ignoring(StaleElementReferenceException.class);																								
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
																									
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
//driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();																									
																									
}																									
																									
@And("click  on hairextension button in the home page")																									
public void click_on_hairextension_button_in_the_home_page() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.xpath("//*[text()='Hair Extensions']")).click();																								
	Thread.sleep(3000);																								
}																									
																									
@And("click on curly hair extension")																									
public void click_on_curly_hair_extension() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.xpath("//*[text()='Curly Hair']")).click();																								
	Thread.sleep(3000);																								
																									
}																									
																									
@And("click on add to cart2")																									
public void click_on_add_to_cart2() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.get(driver.getCurrentUrl());																								
	driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();																								
	//Thread.sleep(3000);																								
	WebDriverWait wait = new WebDriverWait(driver, 30);																								
	wait.ignoring(NoSuchElementException.class);																								
	wait.ignoring(StaleElementReferenceException.class);																								
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
																									
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
	//driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();																								
}																									
@And("click  on wigs button in the home page")																									
public void click_on_wigs_button_in_the_home_page() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.linkText("Wigs & Pieces")).click();																								
	Thread.sleep(3000);																								
}																									
																									
@And("click on synthetic wigs")																									
public void click_on_synthetic_wigs() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.linkText("Synthetic Wigs")).click();																								
	Thread.sleep(3000);																								
																									
}																									
																									
@And("click on add to cart3")																									
public void click_on_add_to_cart3() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.get(driver.getCurrentUrl());																								
	driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();																								
	//Thread.sleep(3000);																								
	WebDriverWait wait = new WebDriverWait(driver, 30);																								
	wait.ignoring(NoSuchElementException.class);																								
	wait.ignoring(StaleElementReferenceException.class);																								
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
																									
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
	//driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();																								
}																									
																									
@And("click  on hair button in the home page")																									
public void click_on_hair_button_in_the_home_page() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.linkText("Hair")).click();																								
	Thread.sleep(3000);																								
}																									
																									
@And("click on hair oils")																									
public void click_on_hair_oils() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.linkText("Hair Oils")).click();																								
	Thread.sleep(3000);																								
																									
}																									
																									
@And("click on add to cart4")																									
public void click_on_add_to_cart4() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.get(driver.getCurrentUrl());																								
	driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();																								
	//Thread.sleep(3000);																								
	WebDriverWait wait = new WebDriverWait(driver, 30);																								
	wait.ignoring(NoSuchElementException.class);																								
	wait.ignoring(StaleElementReferenceException.class);																								
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
																									
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
	//driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();																								
																									
}																									
@And("click  on Skincare button in the home page")																									
	public void click_on_skincare_button_in_the_home_page() throws InterruptedException {																								
	// Write code here that turns the phrase above into concrete actions																								
		driver.findElement(By.linkText("Skin Care")).click();																							
		Thread.sleep(3000);																							
	}																								
	@And("click on  Face masks")																								
	public void click_on_face_masks() throws InterruptedException {																								
	// Write code here that turns the phrase above into concrete actions																								
		driver.findElement(By.linkText("Face Masks")).click();																							
		Thread.sleep(3000);																							
																									
	}																								
																									
	@And("click on add to cart5")																								
	public void click_on_add_to_cart5() throws InterruptedException {																								
	// Write code here that turns the phrase above into concrete actions																								
		driver.get(driver.getCurrentUrl());																							
		driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();																							
		//Thread.sleep(3000);																							
		WebDriverWait wait = new WebDriverWait(driver, 30);																							
		wait.ignoring(NoSuchElementException.class);																							
		wait.ignoring(StaleElementReferenceException.class);																							
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																							
																									
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																							
		// driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();																							
	}																								
																									
@And("click  on makeup button in the home page")																									
public void click_on_makeup_button_in_the_home_page() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
driver.findElement(By.xpath("//*[text()='Makeup']")).click();																									
Thread.sleep(3000);																									
}																									
																									
@And("click on  Lipglosses")																									
public void click_on_Lipglosses() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.xpath("//*[text()='Lipglosses']")).click();																								
	Thread.sleep(3000);																								
}																									
@And("click on add to cart6")																									
public void click_on_add_to_cart6() throws InterruptedException  {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.get(driver.getCurrentUrl());																								
	driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();																								
	//Thread.sleep(3000);																								
	WebDriverWait wait = new WebDriverWait(driver, 30);																								
	wait.ignoring(NoSuchElementException.class);																								
	wait.ignoring(StaleElementReferenceException.class);																								
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
																									
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
	//driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();																								
}																									
																									
@And("click  on Fragrance button in the home page")																									
public void click_on_fragrance_button_in_the_home_page() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.xpath("//*[text()='Fragrance']")).click();																								
	Thread.sleep(3000);																								
}																									
																									
@And("click on  Deodrants")																									
public void click_on_deodrants() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
driver.findElement(By.xpath("//*[text()='Deodorants']")).click();																									
Thread.sleep(3000);																									
																									
}																									
																									
@And("click on add to cart7")																									
public void click_on_add_to_cart7() throws InterruptedException  {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.get(driver.getCurrentUrl());																								
	driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();																								
	//Thread.sleep(3000);																								
	WebDriverWait wait = new WebDriverWait(driver, 30);																								
	wait.ignoring(NoSuchElementException.class);																								
	wait.ignoring(StaleElementReferenceException.class);																								
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
																									
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
	//driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();																								
																									
}																									
@And("click  on Electrical button in the home page")																									
public void click_on_electrical_button_in_the_home_page() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.xpath("//*[text()='Electrical']")).click();																								
	Thread.sleep(3000);																								
}																									
																									
@And("click on  Hair Straighteners")																									
public void click_on_hair_straighteners() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.xpath("//*[text()='Hair Straighteners']")).click();																								
	Thread.sleep(3000);																								
}																									
																									
@And("click on add to cart8")																									
public void click_on_add_to_cart8() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.get(driver.getCurrentUrl());																								
	driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();																								
	//Thread.sleep(3000);																								
	WebDriverWait wait = new WebDriverWait(driver, 30);																								
	wait.ignoring(NoSuchElementException.class);																								
	wait.ignoring(StaleElementReferenceException.class);																								
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
																									
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
	//driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();																								
																									
}																									
																									
@And("click  on Men button in the home page")																									
public void click_on_men_button_in_the_home_page() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.linkText("Men")).click();																								
	Thread.sleep(3000);																								
}																									
																									
@And("click on  Spray, Oils & Serums")																									
public void click_on_spray_oils_serums() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.linkText("Spray, Oils & Serums")).click();																								
	Thread.sleep(3000);																								
}																									
																									
@And("click on add to cart9")																									
public void click_on_add_to_cart9() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.get(driver.getCurrentUrl());																								
	driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();																								
	//Thread.sleep(3000);																								
	WebDriverWait wait = new WebDriverWait(driver,30);																								
	wait.ignoring(NoSuchElementException.class);																								
	wait.ignoring(StaleElementReferenceException.class);																								
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
																									
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
	//driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();																								
																									
}																									
																									
@And("click  on body button in the home page")																									
public void click_on_body_button_in_the_home_page() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	//WebDriverWait Wait = new WebDriverWait(driver,300);																								
	//Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Body']"))).click();																								
	driver.findElement(By.xpath("//*[text()='Body']")).click();																								
	Thread.sleep(3000);																								
}																									
																									
@And("click on soap")																									
public void click_on_soap() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.xpath("//*[text()='Soap']")).click();																								
	Thread.sleep(3000);																								
}																									
																									
@And("click on add to cart10")																									
public void click_on_add_to_cart10() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.get(driver.getCurrentUrl());																								
	driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();																								
	//Thread.sleep(3000);																								
	WebDriverWait wait = new WebDriverWait(driver, 30);																								
	wait.ignoring(NoSuchElementException.class);																								
	wait.ignoring(StaleElementReferenceException.class);																								
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
																									
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Continue Shopping']"))).click();																								
	//driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();																								
}																									
@And("click on go to cart")																									
public void click_on_go_to_cart() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/a[2]")).click();																									
Thread.sleep(3000);																									
}																									
																									
@And("click on checkout")																									
public void click_on_checkout() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions	
	driver.get(driver.getCurrentUrl());	
	WebDriverWait wait = new WebDriverWait(driver,30);																								
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Checkout')]"))).click();																								
	//driver.findElement(By.xpath("//*[(text()='Checkout')]")).click();																								
			Thread.sleep(3000);																						
																									
}																									
																									
@And("click on add new address")																									
public void click_on_add_new_address() {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/a[1]")).click();																								
	driver.findElement(By.name("line_1")).sendKeys("Anneppamodali street");																								
driver.findElement(By.name("country")).sendKeys("India");																									
driver.findElement(By.name("city")).sendKeys(" Tirupati");																									
driver.findElement(By.name("zipcode")).sendKeys("517526");																									
driver.findElement(By.name("province")).sendKeys("Papanaidupet");																									
}																									
@And("click on save")																									
public void click_on_save() {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.xpath("//*[text()='save']")).click();																								
driver.manage().deleteAllCookies();																									
																									
}																									
@When("click on continue button")																									
public void click_on_continue_button() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions		
	driver.get(driver.getCurrentUrl());		
driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();																									
Thread.sleep(3000);																									
}	

/*
@Then("click on proceed to payment")																									
public void click_on_proceed_to_payment() throws InterruptedException {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.findElement(By.xpath("//a[contains(text(),'Proceed to Payment')]")).click();																								
Thread.sleep(3000);																									
}	
*/				

@Then("close the browsers")																									
public void close_the_browsers() {																									
// Write code here that turns the phrase above into concrete actions																									
	driver.manage().deleteAllCookies();																								
	driver.close();																								
}																									
}																																		