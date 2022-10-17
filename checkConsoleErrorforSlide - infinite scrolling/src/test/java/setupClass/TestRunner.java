package setupClass;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "." }, glue = { "stepDefination" },  tags= ("@BlogPage"),
		plugin = { "pretty", "html:target/site/cucumberscreenshot", "json:target/cucumber/cucumber.json",
				"usage:target/usage.jsonx", "junit:target/cucumber.xml" })

public class TestRunner {

	@BeforeClass
	public static void beforeClass() throws Exception {
		BaseClass.before_Class();
	}

	@AfterClass
	public static void afterClass() throws Exception {
		BaseClass.after_Class();
	}
   
}
