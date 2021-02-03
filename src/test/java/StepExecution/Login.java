package StepExecution;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;
	
		@Given("Login application present")
		public void login_application_present() {
		    // Write code here that turns the phrase above into concrete actions
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrathapKR\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		}

		@When("Enter valid Username")
		public void enter_valid_username() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		}
		@When("Enter valid password")
		public void enter_valid_password() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		}
		@When("Click on Login button")
		public void click_on_login_button() {
		    // Write code here that turns the phrase above into concrete actions
			
			   driver.findElement(By.id("btnLogin")).click();
		}
		@Then("Login Successful")
		public void login_successful() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			String expected= driver.findElement(By.id("welcome")).getText();
			   String actual= "Welcome Paul";
			   Assert.assertEquals(expected, actual);
			   Thread.sleep(3000);
			   driver.findElement(By.id("welcome")).click();
			   Thread.sleep(3000);
			   driver.close();
		}

		@When("Enter invalid Username")
		public void enter_invalid_username() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("txtUsername")).sendKeys("Admin12");
		}
		@When("Enter invalid password")
		public void enter_invalid_password() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("txtPassword")).sendKeys("admin12387");

		}
		@When("Click on Login btn")
		public void click_on_login_btn() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("btnLogin")).click();
		}
		@Then("Login should be unsuccessful")
		public void login_should_be_unsuccessful() {
		    // Write code here that turns the phrase above into concrete actions
		    String error= driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		    String actualerror="Invalid credentials";
		    Assert.assertEquals(error, actualerror);
		    driver.close();
		}


}
