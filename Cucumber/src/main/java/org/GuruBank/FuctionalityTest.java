package org.GuruBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FuctionalityTest {
	static WebDriver driver;
	@Before(order=1)
	@Given("^The user is in login page$")
	public void the_user_is_in_login_page() {	
		 System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Cucumber\\Cucumber\\driver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("http://demo.guru99.com/V1/index.php");

	}
	@Before(order=2)

	@When("^The user enter valid login details$")
	public void the_user_enter_valid_login_details() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("uid")).sendKeys("mngr165127");
		driver.findElement(By.name("password")).sendKeys("mytUsUv");
	}
	@Before(order=3)
	@When("^Click submit button$")
	public void click_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("btnLogin")).click();
	}
@After(order=3)
	@When("^The user navigates home page to Telecome home page$")
	public void the_user_navigates_to_Guru_Bank_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[text()='Telecom Project']")).click();
	}
@After(order=1)
	@Then("^The user should see success message$")
	public void the_user_should_see_success_message() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[text()='Bank Project']")).click();
	    throw new PendingException();
	}
	@Given("^The user Bank home page$")
	public void the_user_Bank_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^The user navigate to telecom register page$")
	public void the_user_navigate_to_telecom_register_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^The user enter valid details$")
	public void the_user_enter_valid_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	@Then("^The user should see success message after register$")
	public void the_user_should_see_success_message_after_register() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
