package ${groupId}.jUnitTests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJUnitTest {

    @Test
    public void firstSeleniumTest() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println("Successfully opened the website www.google.com");
        driver.quit();
    }
}
