package test.greetings;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GreetingsStepdefs {

    @Given("I greet you")
    public void iGreetYou() {
        System.out.println("Hello there user.");
    }

    @And("Your name should be {string}")
    public void yourNameShouldBe(String arg0) {
        System.out.println("Your name is " + arg0);
    }

    @And("I visit {string}")
    public void iVisit(String url) {
        String chromeDriverPath = "chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get(url);
        WebElement element = driver.findElement(By.tagName("html"));
        String elementSource = element.getAttribute("innerHTML");
        System.out.println(elementSource);
        driver.close();
    }
}
