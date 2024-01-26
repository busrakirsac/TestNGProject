package testng.tests.d24;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testng.pages.GooglePage;
import testng.utilities.ConfigReader;
import testng.utilities.Driver;

public class C02 {


    @DataProvider(name = "googleurunler")
    public static Object[][] urunler() {
        return new Object[][]{
                {"laptop"}, {"iphone"}, {"mouse"}
        };
    }


    @Test(dataProvider = "googleurunler")
    public void test01(String data) {

        //Google sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        //DataProvider ile istediğimiz arac isimlerini aratalım
        new GooglePage().searcBox.sendKeys(data, Keys.ENTER);

        //sayfayı kapatalım
        Driver.closeDriver();

    }
}