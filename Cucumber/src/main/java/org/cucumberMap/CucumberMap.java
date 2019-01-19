package org.cucumberMap;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberMap {
	static WebDriver driver;
	@Given("^User login into home page$")
	public void user_login_into_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Cucumber\\Cucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/V1/index.php");
	}

	@When("^User gives valid username and password$")
	public void user_gives_valid_username_and_password(DataTable details) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).
		Map<String, String> detailMap = details.asMap(String.class, String.class);
		driver.findElement(By.name("uid")).sendKeys(detailMap.get("UserName"));
		driver.findElement(By.name("password")).sendKeys(detailMap.get("Password"));
		System.out.println(details);
	    
	}

	@Then("^User will be in bank login page$")
	public void user_will_be_in_bank_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("btnLogin")).click();
	    
	}


}
