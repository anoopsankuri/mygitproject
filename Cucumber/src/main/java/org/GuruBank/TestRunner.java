package org.GuruBank;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\eclipse\\Cucumber\\Cucumber\\src\\main\\java\\org\\GuruBank", 
glue= {"GuruBank"},  plugin= {"html:target"}, tags= {"@LoginPage"},  dryRun=false)
public class TestRunner {
	

}
