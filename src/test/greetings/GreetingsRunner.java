package test.greetings;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/greetings/Greetings.feature",
        monochrome = true
)
public class GreetingsRunner extends AbstractTestNGCucumberTests { }
