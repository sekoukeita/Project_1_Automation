import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Dropbox\\Revature\\Training\\tools\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:9000");

        WebElement usernameElt = driver.findElement(By.id("username-input"));
        WebElement passwordElt = driver.findElement(By.id("password-input"));
        WebElement loginElt = driver.findElement(By.id("login-btn"));

        usernameElt.sendKeys("hassankeita");
        passwordElt.sendKeys("hass2016");
        loginElt.click();


       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement amountElt = driver.findElement(By.id("amount-input"));
        WebElement dateSubmittedElt = driver.findElement(By.id("dateSubmitted-input"));
        WebElement descriptionElt = driver.findElement(By.id("description-input"));
        WebElement typeElt = driver.findElement(By.id("type-travel"));
        WebElement submitElt = driver.findElement(By.id("submit-btn"));

        amountElt.sendKeys("875");
        dateSubmittedElt.sendKeys("12/20/2021");
        descriptionElt.sendKeys("Visit to Miami");
        typeElt.click();
        submitElt.click();

        driver.quit();

    }
}

