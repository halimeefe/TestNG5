package Gun05;

import Utility.BaseDriverParameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _01_SearchFunctionality extends BaseDriverParameters {


/*
      Senaryo ;
      1- Siteyi açınız.
      2- mac kelimeini göndererek aratınız.
      3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
      4- aynı işlemi samsung için de yapınız
    */


    @Test
    @Parameters("aranacakKelime")
    void test1(String text) {

        //  driver.get("https://opencart.abstracta.us/index.php?route=account/login");


        WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
        search.sendKeys("text");

        WebElement click = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
        click.click();

        List<WebElement> captions = driver.findElements(By.cssSelector("div[class='caption']>h4"));// ANASAYFADAKİ GÖRSELLERİ ALDIK

        for (WebElement e : captions) //foreach ile e ye atadık
            Assert.assertTrue(e.getText().toLowerCase().contains("text")); //E NİN GETTEXİNDE MAC VARMI DOĞRULAMA YAPARIZ


        // SAMSUNG ARAMASINI XML DOSYASINDA YAPTIRDIK

    }
}































