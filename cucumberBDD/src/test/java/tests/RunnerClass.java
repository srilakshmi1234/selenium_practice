package tests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Testing_workspace\\workspace\\cucumberBDD\\src\\test\\resources\\properties_pkg\\features1.feature",
                 plugin= {"pretty","html:target/cucumber-reports"},
                 monochrome=true)

public class RunnerClass
{

}
