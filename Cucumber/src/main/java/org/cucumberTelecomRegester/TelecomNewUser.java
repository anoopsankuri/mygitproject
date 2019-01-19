package org.cucumberTelecomRegester;



import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TelecomNewUser {
	static WebDriver driver;
	@Given("^User need to open Guru(\\d+) bank home page with valid credentials$")
	public void user_need_to_open_Guru_bank_home_page_with_valid_credentials(int args) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Cucumber\\Cucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/V1/index.php");
	    
	}

	@Given("^Enter Username and Password$")
	public void enter_Username_and_Password(DataTable Login) {
		
	    List<String> LoginList = Login.asList(String.class);
	    driver.findElement(By.name("uid")).sendKeys(LoginList.get(0));
	    driver.findElement(By.name("password")).sendKeys(LoginList.get(1));
	    driver.findElement(By.name("btnLogin")).click();
	    WebElement telcom = driver.findElement(By.xpath("//*[text()='Telecom Project']"));
		  telcom.click();
		  driver.findElement(By.xpath("(//*[text()='Add Customer'])[1]")).click();
	}

	@When("^Click Background Check$")
	public void click_Background_Check() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//*[text()='Done']")).click();
	}

	@When("^Fill Billing address form$")
	public void fill_Billing_address_form(DataTable detail) {
		List<List<String>> detailList = detail.asLists(String.class);
		driver.findElement(By.id("fname")).sendKeys(detailList.get(1).get(2));
		driver.findElement(By.id("lname")).sendKeys(detailList.get(2).get(2));
		driver.findElement(By.id("email")).sendKeys(detailList.get(3).get(2));
		driver.findElement(By.name("addr")).sendKeys(detailList.get(4).get(2));
		driver.findElement(By.id("telephoneno")).sendKeys(detailList.get(5).get(2));
	  

	}

	@Then("^After complete form User need to click submit buttons$")
	public void after_complete_form_User_need_to_click_submit_buttons() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("submit")).click();
		Thread.sleep(4000);
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://demo.guru99.com/telecom/access.php?uid=876165", url);
		System.out.println(url);
	    WebElement result = driver.findElement(By.xpath("//*[@class='alt access']/tbody/tr[2]/td[1]/b"));
	    System.out.println(result);
	}

	

}
