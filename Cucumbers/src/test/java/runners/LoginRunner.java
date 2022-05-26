package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//		//features = //"src\\test\\java\\features\\TechfiosLogin.feature",//if it's 2,separate with comma under same curly braces
//		features = {"classpath:features"},  // if more than 2 features are to be run
//		glue="steps",
//		tags =                   //"@Scenario1,@OtherScenario2",//running diff. scenarios from diff. features 
//		monochrome= true,
//		dryRun =false,
//		plugin = {
//				"pretty",
//				"html:target/cucumber",
//				"json:target/cucumber.json"}
//		
//		)
//public class LoginRunner {
//	
//}
		
//	

@RunWith(Cucumber.class)
@CucumberOptions(
		features =  "/src/test/java/features/NewBankAccountAndLogin.feature",
		glue="steps" , dryRun = true, monochrome = true, plugin = { "pretty", "html:test-output" })


public class LoginRunner {

}

//src\\main\\java\\com.qa.features
//com.qa.stepDefinition
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//    features = "src\\main\\java\\com\\qa\\features"
//    ,glue={"com/qa/stepDefinition"}
//    ,format={"pretty","html:test-output"}
//}


