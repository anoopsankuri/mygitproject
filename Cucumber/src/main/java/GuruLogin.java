import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GuruLogin {
	static WebDriver driver;
	@Given("^The user is in demo guru page$")
	public void the_user_is_in_demo_guru_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Cucumber\\Cucumber\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/V1/index.php");
	}

	@When("^The user enter valid user name$")
	public void the_user_enter_valid_user_name() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("uid")).sendKeys("mngr165127");
	}

	@When("^The user enter valid password$")
	public void the_user_enter_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("password")).sendKeys("mytUsUv");
	}

	@Then("^Click on submit button$")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("btnLogin")).click();
	}

}
