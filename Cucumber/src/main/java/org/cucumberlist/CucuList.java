package org.cucumberlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucuList {
	static WebDriver driver;
	@Given("^The Guru Bank login page$")
	public void the_Guru_Bank_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Cucumber\\Cucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/V1/index.php");
	}

	

	//@When("^The user enter valid username$")
	//public void the_user_enter_valid_username() {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.name("uid")).sendKeys("mngr165127");
	//}

	@When("^The user enter valid username and password$")
	public void the_user_enter_valid_username_and_password(DataTable credits) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).
	    List<String> creditList = credits.asList(String.class);
	    driver.findElement(By.name("uid")).sendKeys(creditList.get(0));
	    driver.findElement(By.name("password")).sendKeys(creditList.get(1));
	}

	@Then("^User will login to Guru Bank home page$")
	public void user_will_login_to_Guru_Bank_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("btnLogin")).click();
	}


}
