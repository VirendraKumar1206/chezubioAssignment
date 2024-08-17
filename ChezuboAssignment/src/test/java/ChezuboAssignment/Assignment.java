package ChezuboAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;

public class Assignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\workspace-spring\\ChezuboAssignment\\src\\test\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Apple iPhone 14 Pro (128 GB) - Space Black");
        driver.findElement(By.id("nav-search-submit-button")).click();

        List<WebElement> results = driver.findElements(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"));

        Assert.assertFalse(results.isEmpty(), "No search results were found.");

        WebElement firstResult = results.get(0);
        Assert.assertTrue(firstResult.isDisplayed(), "The first search result is not displayed on the screen.");

        System.out.println("First search result text: " + firstResult.getText());

        driver.quit();
    }
}


