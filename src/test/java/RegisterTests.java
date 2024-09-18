import PageObject.OTP_Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class RegisterTests extends Base.Base {

    @Test
    public void successfulRegister(){
        registerPage.setPhoneNumber("085782894575");
        registerPage.setEmail("kevinodtesting@gmail.com");
        registerPage.setFname("Kevin");
        registerPage.setLname("Oktario");
        OTP_Page otpPage = registerPage.clickSubmitButton();

        WebElement otpContainer = otpPage.OTP();
        String currentUrl = otpPage.getCurrentUrl();

        //Assert the otp container
        Assert.assertTrue(otpContainer.isDisplayed(), "The element is not visible on the page");
    }
}

