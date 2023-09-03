package Gun02;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_SubscribeNewsLetter extends BaseDriver {

//    _04_SubscribeNewsLetter
//[20:43]
/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)
  */

    By link = By.linkText("Newsletter");
    By subYes = By.xpath("//input[@value='1']");
    By subNo = By.xpath("//input[@value='0']");
    By cntBtn = By.xpath("//input[@type='submit']");


    @Test(priority = 1)
    void subscribeFunctionYes() {


        WebElement newsLetterLink = driver.findElement(link);//"Newsletter"(linktext)
        newsLetterLink.click();

        WebElement subscribeYes = driver.findElement(subYes);
        subscribeYes.click();

        WebElement continuebutton = driver.findElement(cntBtn);
        continuebutton.click();

        Tools.successMessageValidation();


    }

    @Test(priority = 2)
    void subscribeFunctionNo() {

        WebElement newsLetterLinkk = driver.findElement(link);//"Newsletter"(linktext)
        newsLetterLinkk.click();

        WebElement subscribeNo = driver.findElement(subNo);
        subscribeNo.click();


        WebElement continuebutton = driver.findElement(cntBtn);
        continuebutton.click();

        Tools.successMessageValidation();

    }

    @Test(priority = 3)
    void subscribeFunctionForBoth() {
        WebElement newsLetterLinkk = driver.findElement(link);//"Newsletter"(linktext)
        newsLetterLinkk.click();

        WebElement subscribeNo = driver.findElement(subNo);
        subscribeNo.click();
        WebElement subscribeYes = driver.findElement(subYes);
        subscribeYes.click();

        if (subscribeYes.isSelected())
            subscribeNo.click();
        else
            subscribeYes.click();


        WebElement continuebutton = driver.findElement(cntBtn);
        continuebutton.click();

        //    WebElement msg=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")); BU KISIM SÜREKLİ ÇALIŞACAĞI İÇİN BASEDRİVERDA FONKSİYONA ALDIK
        //    Assert.assertTrue(msg.getText().toLowerCase().contains("success"));

        Tools.successMessageValidation();

    }







    }
















