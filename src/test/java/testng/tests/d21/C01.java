package testng.tests.d21;

import org.testng.annotations.Test;
import testng.utilities.Driver;

public class C01 {

    @Test
    public void test01() {
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://facebook.com");
        Driver.getDriver().get("https://google.com");
    }

    @Test
    public void test02() {

    }
}
