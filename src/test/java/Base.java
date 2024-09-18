package Base;

import PageObject.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class Base {
    private WebDriver driver;
    protected RegisterPage registerPage;
    private By handphoneNumberField = By.xpath("//INPUT[@id='mobilePhone']");

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://www.cermati.com/app/gabung");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(handphoneNumberField));
        registerPage = new RegisterPage(driver);
    }

    @AfterClass
    public void teardown(){
        if (driver != null) {
            driver.quit();
        }
    }
}
