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
        WebElement usernameInputFieldXpath = driver.findElement(By.xpath("//input[@id='username']"));

        WebElement passwordInputField = driver.findElement(By.name("password"));
        WebElement passwordInputFieldXpath = driver.findElement(By.xpath("//input[@name='password']"));

        WebElement submitButton = driver.findElement(By.className("btn"));
        WebElement submitButtonXpath = driver.findElement(By.xpath("//button[@class='btn']"));

        List<WebElement> inputFields = driver.findElements(By.tagName("input"));
        List<WebElement> inputFieldsXpath = driver.findElements(By.xpath("//input"));

        WebElement linkTextLocator = driver.findElement(By.linkText("Practice Test Automation."));
        WebElement linkTextLocatorXpath = driver.findElement(By.xpath("//a[text()='Practice Test Automation.']"));

        WebElement partialLinkTextLocator = driver.findElement(By.partialLinkText("Test Automation"));
        WebElement partialLinkTextLocatorXpath = driver.findElement(By.xpath("//a[contains(text(), 'Test Automation')]"));

        WebElement passwordInputBelowUsername = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("username")));
        WebElement privacyPolicyLink = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.partialLinkText("Test Automation")));

        driver.quit();
    }
}
