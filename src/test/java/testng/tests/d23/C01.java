package testng.tests.d23;

import org.testng.annotations.Test;
import testng.utilities.ExcelReader;

public class C01 {

    @Test
    public void test01() {
        String dosyaYolu="src/test/java/testng/resources/mysmoketestdata.xlsx";
        String sayfaIsmi="customer_info";
        ExcelReader excelReader=new ExcelReader(dosyaYolu,sayfaIsmi);
        System.out.println("excelReader.getCellData(0,0) = " + excelReader.getCellData(0, 0));
        System.out.println("excelReader.getCellData(0,1) = " + excelReader.getCellData(0, 1));

        String email = excelReader.getCellData(1,0);
        String password= excelReader.getCellData(1,1);
        System.out.println(email +" "+password);

    }

}
