package stepDefinitions;

import org.junit.After;

import core.Base;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base {
	
	// in this class we will write or define our beforeHooks and  afterHooks methods
	// they are coming from cucumber .
	// Before hooks will run before each scenario. 
	// After hooks will run after each scenario. 
	
	@Before  // we import it from cucumber 
	public void beforeHooks(Scenario scenario) { // import from cucumber.java
		logger.info("Scenario " + scenario.getName() +" Passed");  // we get scenario name from features file. 
		browser(); // this line will launch our browser
		openBrowser(); // this line will launch the url
		
	}
	@After
	public void afterHooks(Scenario scenario) {
		tearDown();
		logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
			
	}

}
