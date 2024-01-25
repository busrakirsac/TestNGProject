package testng.tests.d22;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import testng.pages.BlueRentalPage;
import testng.utilities.ConfigReader;
import testng.utilities.Driver;
import testng.utilities.ReusableMethods;

public class C04 {

    @Test
    public void test01() {

        //Name:
        //US100208_Negative_Login
        //Description:
        //Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
        //Acceptance Criteria
        //Customer email: fake@bluerentalcars.com
        //Customer password: fakepass
        //Error:
        //User with email fake@bluerentalcars.com not found

        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        BlueRentalPage blueRentalPage = new BlueRentalPage();

        blueRentalPage.loginButton.click();
        String fakeEmail =ConfigReader.getProperty("fakeEmail");
        String fakePassword =ConfigReader.getProperty("fakePassword");

        blueRentalPage.email.sendKeys(fakeEmail);
        blueRentalPage.password.sendKeys(fakePassword, Keys.ENTER);

        ReusableMethods.visibleWait(blueRentalPage.negatifloginVerify,15);

        Assert.assertTrue(blueRentalPage.negatifloginVerify.isDisplayed());

        Driver.closeDriver();

    }
}
