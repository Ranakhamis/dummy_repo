package test.greetings;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class GreetingsStepdefs {

    @Given("I greet you")
    public void iGreetYou() {
        System.out.println("Hello there user.");
    }

    @And("Your name should be {string}")
    public void yourNameShouldBe(String arg0) {
        System.out.println("Your name is " + arg0);
    }
}
