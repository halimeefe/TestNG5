package Gun04;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static Utility.BaseDriver.driver;

public class _04_ContactUs extends BaseDriver {

    /*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */

    @Test
        @Parameters("mesaj") // XML DEKİ PARAMETRE ADI AYNI OLMAK ZORUNDA
        void contactUs(String gelenMesaj) {
            //STRİNG GELENMESAJ : METOD İÇİN GEREKLİ TANIMLAMA AYNI OLMAK ZORUNDA DEĞİL
            driver.get("https://opencart.abstracta.us/index.php?route=account/login");


            WebElement cnt=driver.findElement(By.xpath("//a[text()='Contact Us']"));
           cnt.click();

            WebElement msg=driver.findElement(By.xpath("//*[@id='input-enquiry']"));
          msg.sendKeys(gelenMesaj);

        WebElement sbmt=driver.findElement(By.xpath("//input[@type='submit']"));
        sbmt.click();

        WebElement dgr=driver.findElement(By.xpath("//h1[text()='Contact Us']"));

            System.out.println(dgr.getText());
            Assert.assertEquals("Contact Us" ,dgr.getText(), "Karşılaştırma başarısız oldu");

         //   Assert.assertTrue(driver.getCurrentUrl().contains("success")); BU ŞEKİLDE URL DEN DE KONTROL EDEBİLİRİZ
    }
}
