package testng.tests.d24;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import testng.pages.DataProviderPage;
import testng.utilities.DataProviderUtils;
import testng.utilities.Driver;

public class C04 {

    @Test(dataProvider = "positiveTestData", dataProviderClass = DataProviderUtils.class)
    public void test01(int age) {

        //https://dataprovider.netlify.app/ adresine gidelim
        Driver.getDriver().get("https://dataprovider.netlify.app/");

        //BlackBoxTesting techniques ile otomasyon test yapalim
        DataProviderPage dataProviderPage=new DataProviderPage();
        dataProviderPage.searcBox.sendKeys(String.valueOf(age), Keys.TAB,Keys.ENTER);

        Assert.assertTrue(dataProviderPage.positiveVerifyMessage.isDisplayed());
        //Driveri kapatalim
        Driver.closeDriver();

    }
}
