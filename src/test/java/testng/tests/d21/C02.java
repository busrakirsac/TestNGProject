package testng.tests.d21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testng.pages.AmazonPage;
import testng.utilities.Driver;

public class C02 {


    @Test
    public void test01() {

        //amazon sayfasina gidelim
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();


        //arama kutusunda iphone aratalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("iphone", Keys.ENTER);



    }
}
