package stepsdef;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import webdriver.DriverManager;
import static webdriver.DriverManager.*;

public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario){
        System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
        setDriver(DriverManager.Driver.Firefox);
    }

    @After
    public void afterScenario(Scenario scenario){
        quitDriver();
    }
}
