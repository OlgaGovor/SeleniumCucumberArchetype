package ${groupId}.stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseStepDefs {

    WebDriver driver;

    @Given("^user open www.google.com$")
    public void userOpenUrl() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/selenium/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }

    @Then("^www.google.com is opened$")
    public void urlIsOpened() {
        System.out.println("Successfully opened the website www.google.com");
        driver.quit();
    }

}
