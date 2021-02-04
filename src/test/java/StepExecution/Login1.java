package StepExecution;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login1 {

	WebDriver driver;
	
	@Given("Login application should present")
	public void login_application_should_present() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrathapKR\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@When("Enter valid Username {string}")
	public void enter_valid_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	@When("Enter valid password {string}")
	public void enter_valid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys(string);
		
	}
	@When("Click on Login button1")
	public void click_on_login_button1() {
	    // Write code here that turns the phrase above into concrete actions
		
		   driver.findElement(By.id("btnLogin")).click();
	}
	@Then("Then i should see welcome name as {string}")
	public void then_i_should_see_welcome_name_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		String expected= driver.findElement(By.id("welcome")).getText();
		   String actual= string;
		   Assert.assertEquals(expected, actual);
		   Thread.sleep(3000);
		   driver.findElement(By.id("welcome")).click();
		   Thread.sleep(3000);
		   driver.close();
	}

	@When("Enter invalid Username {string}")
	public void enter_invalid_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	@When("Enter invalid password {string}")
	public void enter_invalid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	
	@When("Click on Login btn1")
	public void click_on_login_btn1() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Then("I should see invalid credential error as {string}")
	public void i_should_see_invalid_credential_error_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String error= driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
	    String actualerror=string;
	    Assert.assertEquals(error, actualerror);
	    driver.close();
	}



}

