package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OTP_Page {
    private WebDriver driver;
    private By OTP_Container = By.xpath("//DIV[@class='container_Eq-qi']");
    public OTP_Page(WebDriver driver){
        this.driver = driver;
    }
    public WebElement OTP(){
        return driver.findElement(OTP_Container);
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
