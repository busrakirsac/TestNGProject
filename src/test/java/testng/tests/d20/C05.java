package testng.tests.d20;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05 {

    @Test
    public void test01() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(2,2);

        softAssert.assertTrue(2>3,);

        softAssert.assertFalse(3>2,);

        softAssert.assertNotEquals("java","java"," iki string farkli olmaliydi, bu kontrol basarisiz olacak");

        softAssert.assertAll();



    }

    @Test
    public void hardAssertion() {

        System.out.println("bu kod hard assertion dan once ");

        Assert.assertTrue(false);

        System.out.println("bu kod hard assertion dan sonra ");


    }
    }

