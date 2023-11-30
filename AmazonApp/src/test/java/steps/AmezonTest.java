package steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmezonTest {
	private WebDriver driver;

	@Given("I navigate to the Amazon login page")
	public void i_navigate_to_the_amazon_login_page() {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	}

	@When("I enter valid login credentials")
	public void i_enter_valid_login_credentials() {
		driver.findElement(By.id("ap_email")).sendKeys("6306006966");
		driver.findElement(By.xpath("//input[@id='continue']")).click();

		driver.findElement(By.id("ap_password")).sendKeys("Samrat@26");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		boolean isWelcomeMessageDisplayed = driver.findElement(By.id("welcomeMessage")).isDisplayed();

		assertTrue("Welcome message is not displayed after successful login", isWelcomeMessageDisplayed);
	}

	@Given("I navigate to the Amazon registration page")
	public void i_navigate_to_the_amazon_registration_page() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%2F%3Fie%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}

	@When("I enter valid registration details")
	public void i_enter_valid_registration_details() {
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Gaurav Mall");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("gauravmallgkp@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Samrat@26");
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("630606966");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}

	@Then("my account should be created successfully")
	public void my_account_should_be_created_successfully() {
		boolean isConfirmationMessageDisplayed = driver.findElement(By.id("confirmationMessage")).isDisplayed();

		assertTrue("Confirmation message is not displayed after successful registration",
				isConfirmationMessageDisplayed);
	}

	@Given("I am logged in to the Amazon app")
	public void i_am_logged_in_to_the_amazon_app() {
		driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        
        driver.findElement(By.id("ap_email")).sendKeys("6306006966");
		driver.findElement(By.xpath("//input[@id='continue']")).click();

		driver.findElement(By.id("ap_password")).sendKeys("Samrat@26");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}

	@When("I search for a product with keyword {string}")
	public void i_search_for_a_product_with_keyword(String string) {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

}
