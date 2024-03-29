package testng.tests.d20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class C03 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }




    @Test
    @Ignore
    public void youtubeTest() {
        driver.get("https://youtube.com");

    }


    @Test(enabled = false)
    public void amazonTest() {
        driver.get("https://amazon.com");

    }

    @Test
    public void facebookTest() {
        driver.get("https://facebook.com");

            throw new SkipException("");
        }



    @AfterMethod
    public void tearDown() {
        driver.close();
    }


}
