package testng.tests.d25;

import org.testng.annotations.Test;
import testng.utilities.ConfigReader;
import testng.utilities.Driver;

public class C01 {

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("OpenSourceUrl"));
        Driver.closeDriver();
    }


    @Test
    public void test02() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("OpenSourceUrl"));
        Driver.closeDriver();
    }

}
