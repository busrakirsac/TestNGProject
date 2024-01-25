package testng.tests.d23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import testng.pages.BlueRentalPage;
import testng.utilities.ConfigReader;
import testng.utilities.Driver;
import testng.utilities.ExcelReader;

public class C03 {

    BlueRentalPage blueRentalPage;
    @Test
    public void test01() {

        //BlueRentalCar sayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        //Excel dosyasindaki tum email ve passwordler ile login olalim ve login oldugumuzu dogrulayalim
        blueRentalPage=new BlueRentalPage();
        String dosyaYolu="src\\test\\java\\techproed\\resources\\mysmoketestdata.xlsx";
        String sayfaIsmi="customer_info";
        ExcelReader excelReader = new ExcelReader(dosyaYolu,sayfaIsmi);

        for (int i = 1; i <= 7; i++) {
            String email = excelReader.getCellData(i,0);
            String password = excelReader.getCellData(i,1);
            System.out.println(email+" "+password);
            blueRentalPage.loginButton.click();
            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password, Keys.ENTER);
            blueRentalPage.loginVerify.click();
            Assert.assertTrue(blueRentalPage.profile.isDisplayed());
            blueRentalPage.logoutButton.click();
            blueRentalPage.okButton.click();
        }

        //sayfayi kapatalim
        Driver.closeDriver();

    }
}
