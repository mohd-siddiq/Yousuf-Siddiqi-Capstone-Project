package step.definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Utils;


public class Initializer extends Base {

	// In Initializer class we will write or define our beforeHooks and afterHooks
	// method and they are
	// both coming from io.cucumber;
	// @Before = when we add the @Before hooks annotation on top of our beforeHooks
	// method, this method will
	// run before every scenario;
	// cucumber Before and After hooks;
	@Before // import @Before from io.cucumber.java;
	public void beforeHooks(Scenario scenario) { // Import scenario from io.cucumber.java;
		// we used the logger to log when the scenario started;
		logger.info("Scenario " + scenario.getName() + "started ");
		// below methods are coming from base class
		// browser() will get the browser
		browser();
		// openBrowser() will launch the browser
		openBrowser();
		Utils.verify = scenario;
	}
	// @After = when we add the @After annotation on top of our afterHooks method,
	// this method will
	// run after every scenario;
	// In this method, we can also write the code to add a screenshot of our test
	// step, if it fails;
	@After // import it from io.cucumber.java;
	public void afterHooks(Scenario scenario) {
		// we can also write a code to capture screenshot if our test fails;
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Failed Test");
		} else {
			tearDown();
			logger.info("Scenario" + scenario.getName() + " " + scenario.getStatus());

		}
	}
}
