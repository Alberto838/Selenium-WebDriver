import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        // WebElement locators
        WebElement usernameInputField = driver.findElement(By.id("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.className("btn"));

        List<WebElement> inputFields = driver.findElements(By.tagName("input"));

        WebElement linkTextLocator = driver.findElement(By.linkText("Practice Test Automation."));
        WebElement partialLinkTextLocator = driver.findElement(By.partialLinkText("Test Automation"));

        WebElement passwordInputBelowUsername = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("username")));
        WebElement privacyPolicyLink = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.partialLinkText("Test Automation")));

        driver.quit();
    }
}
