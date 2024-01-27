package testng.tests.d25;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testng.pages.BlueRentalPage;
import testng.utilities.ConfigReader;
import testng.utilities.Driver;

public class C03 {

    @DataProvider(parallel = true)
    public static Object[][] credentials() {
        return new Object[][]{
                {"ayhancan@bluerentalcars.com", "ayhan"},
                {"beyhancan@bluerentalcars.com", "beyhan"},
                {"seyhan@bluerentalcars.com", "seyhan"},
                {"johnson@bluerentalcars.com", "johnson"}
        };
    }

    @Test(dataProvider = "credentials", invocationCount = 2)
    public void test01(String email,String password) {
        // BlueRentalCar Sayfasına Gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        //       Login butonuna tıklayalım
        BlueRentalPage blueRentalPage=new BlueRentalPage();
        blueRentalPage.loginButton.click();

        //       Dataprovider Kullanarak verilen email ve password bilgileri ile login olalım
        blueRentalPage.email.sendKeys(email);
        blueRentalPage.password.sendKeys(password, Keys.ENTER);

        //       Sayfayı kapatalım
        Driver.closeDriver();

    }
}
