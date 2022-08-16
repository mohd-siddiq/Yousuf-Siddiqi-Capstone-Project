package runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

// Cucumber Options: //

//	  Cucumber Option, by using these option we can glue our feature files with stepDefinition methods and by using other options, 
//	  we can add the feature,scenario, or scenario outline tag and run those specific test ;
//	  @CucumberOptions(here we pass  all cucumber options we need );

//     We use our cucumber options to set up our runner class;

//		We will use JUnit to setup the TestRunner class and to run our tests 
//      we will use the code; @RunWith(Cucumber.class);	

//		The options in cucumber are: 
//
//		features = we can add the path to our feature files here 
//
//		glue = we can add the path to our stepDefinitions and those stepDefinitions will be glued to our features files;
//
//		tags = By adding the tags we will specify which features, scenario, scenario outline we want to run 
//
//		dryRun = If we set dryRun to true, it will check and make sure we have stepDefinition methods for each of the test step in our feature files, 
//		but if we set this to false, then it will run all of the tests that we have added the tag in feature file and the tag option in TestRunner class 
//
//		monochrome = will help us to print the stepDefinition methods in clean format in the console and we should set this to true; 

		@RunWith(Cucumber.class) // org.junit.runner.RunWith;
		@CucumberOptions( // import from io.cucumber.junit.CucumberOptions
							// make sure when you type classpath:features, all letters are lower case;
							features = "classpath:features", 
							glue = "step.definition", 
							tags = "@HomePage",
							dryRun = false, 
							monochrome = true, 
							plugin = {
				                          "pretty", 
				                          "html:target/site/cucumber-pretty",
				                          "json:target/cucumber.json" 
				            },
							//if we set this to false not generate the report for us;
							publish = true
							)
public class TestRunner {

					@AfterClass
					public static void generateReport() {
						CucumberReportingConfig.reportConfig();
	}
}
		
		