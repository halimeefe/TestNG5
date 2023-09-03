package Gun05;

import Utility.BaseDriverParameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _05_Task_2 extends BaseDriverParameters {

    /**
     * Bir önceki task da yapılan testi PARAMETERDRIVER ile yapınız
     * sonrasında fakrlı tarayıcılar ile çalıştırınız. (crossbrowser)
     * sonrasında paralel çalıştırınız.(parallel)
     */

    @Test(dataProvider = "getData")
    void test1(String text) {
        System.out.println("productName:" + text);

        WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
        search.clear(); // SEARCH CLEAR YAPTIK ESKİ DATAYI TEMİZLEMESİ İÇİN
        search.sendKeys("text");

        WebElement click = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
        click.click();

        List<WebElement> captions = driver.findElements(By.cssSelector("div[class='caption']>h4"));// ANASAYFADAKİ GÖRSELLERİ ALDIK

        for (WebElement e : captions) //foreach ile e ye atadık
            Assert.assertTrue(e.getText().toLowerCase().contains("text")); //E NİN GETTEXİNDE MAC VARMI DOĞRULAMA YAPARIZ


    }

    @DataProvider
        // DATA BÖLÜMÜ
    Object[] getData() { //DATAPROVİDER OLARAK KULLANILCAK METODUN TİPİ OBJECT OLMAK ZORUNDA, HEPSİNİ KAPSAMASI YANİ HEM STRİNG HEM INTEGER İÇİN
        {
            Object[] data = {"Mac", "Ipad", "samsung"};
            return data;
        }


        //  driver.get("https://opencart.abstracta.us/index.php?route=account/login");

    }
}

