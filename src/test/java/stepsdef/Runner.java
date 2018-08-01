package stepsdef;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {
        "html:target/cucumber-html-report",
        "json:target/cucumber.json",
        "pretty:target/cucumber.txt" ,
        "junit:target/cucumber-results.xml"},
        features="src\\test\\resources\\features",glue="stepsdef",
        tags = {"~@ignored"}
)
public class Runner {

}
