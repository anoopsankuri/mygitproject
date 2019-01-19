package org.scenarioOutlineTestRunner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ScenarioOutlineTestRunner {
	static WebDriver driver;
	@Given("^The user in guru demo page$")
	public void the_user_in_guru_demo_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Cucumber\\Cucumber\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/V1/index.php");
	    driver.findElement(By.name("uid")).sendKeys("mngr165127");
	    driver.findElement(By.name("password")).sendKeys("mytUsUv");
	    driver.findElement(By.name("btnLogin")).click();
	}

	@Given("^The user need to navigate to add tariff plan page$")
	public void the_user_need_to_navigate_to_add_tariff_plan_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[text()='Telecom Project']")).click();
		driver.findElement(By.xpath("//*[text()='Add Tariff Plan']")).click();
	    
	}

	@When("^The user need to enter valid plan details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void the_user_need_to_enter_valid_plan_details(String MR, String FLM, String FIM, String FSP, String LPMRC, String IPMC, String SPC) 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("rental1")).sendKeys(MR);
		driver.findElement(By.id("local_minutes")).sendKeys(FLM);
		driver.findElement(By.id("inter_minutes")).sendKeys(FIM);
		driver.findElement(By.id("sms_pack")).sendKeys(FSP);
		driver.findElement(By.id("minutes_charges")).sendKeys(LPMRC);
		driver.findElement(By.id("inter_charges")).sendKeys(IPMC);
		driver.findElement(By.id("sms_charges")).sendKeys(SPC);
	}

	@When("^click submit button$")
	public void click_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("submit")).click();
	}

	@Then("^The user should see the success message$")
	public void the_user_should_see_the_success_message() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement result = driver.findElement(By.xpath("//*[@id='main']/div/h2"));
		String results=result.getText();
		System.out.println(results);
		Assert.assertEquals(results, "Congratulation you add Tariff Plan");
	    
	}
}
