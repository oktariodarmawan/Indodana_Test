package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;

    private By handphoneNumberField = By.xpath("//INPUT[@id='mobilePhone']");
    private By emailFIeld = By.xpath("//INPUT[@id='email']");
    private By fnameField = By.xpath("//INPUT[@id='firstName']");
    private By lnameField = By.xpath("//INPUT[@id='lastName']");
    private By submitButton = By.xpath("//BUTTON[@data-button-name='register-new']");

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public void setPhoneNumber(String phoneNumber){
        driver.findElement(handphoneNumberField).sendKeys(phoneNumber);
    }

    public void setEmail(String email){
        driver.findElement(emailFIeld).sendKeys(email);
    }
    public void setFname(String fName){
        driver.findElement(fnameField).sendKeys(fName);
    }
    public void setLname(String lName){
        driver.findElement(lnameField).sendKeys(lName);
    }

    public OTP_Page clickSubmitButton(){
        driver.findElement(submitButton).click();
        return new OTP_Page(driver);
    }
}
