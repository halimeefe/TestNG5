package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class _02_PlaceOrder extends BaseDriver {


    /*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/


  @Test
    void ProceedToCheckout(){


      WebElement searchBox = driver.findElement(By.name("search"));
      searchBox.sendKeys("ipod");

      WebElement searchclick= driver.findElement(By.xpath("(//button[@type='button'])[4]"));
      searchclick.click();

    // WebElement ipod=driver.findElement(By.linkText("iPod Classic"));
    // ipod.click();
     WebElement Cart=driver.findElement(By.xpath("//span[text()='Add to Cart']"));
     Cart.click();

     WebElement shopingCard=driver.findElement(By.linkText("Shopping Cart"));
     shopingCard.click();

     WebElement checkout =driver.findElement(By.xpath("//a[text()='Checkout']"));//span[text()='Checkout']
      checkout.click();

      WebElement cnt1=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));
     cnt1.click();

      WebElement cnt2=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
      cnt2.click();

      WebElement cnt3=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
      cnt3.click();

     // WebElement radio=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
     // radio.click();

      WebElement agree=driver.findElement(By.name("agree"));
      agree.click();

      WebElement cnt4=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-method")));
      cnt4.click();

      WebElement confirm=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-confirm")));
      confirm.click();

      wait.until(ExpectedConditions.urlContains("success"));

      WebElement msg=driver.findElement(By.cssSelector("[id='content']>h1"));
      Assert.assertEquals(msg.getText(),"Your order has been placed!","Onay texti bulunamadı");



//
//      WebElement firstName=driver.findElement(By.name("firstname"));
//      firstName.sendKeys("Halime");
//     Actions actions=new Actions(driver);
//      actions.moveToElement(firstName).sendKeys(Keys.TAB)
//              .sendKeys("efe").sendKeys(Keys.TAB)
//              .sendKeys("Technostudy").sendKeys(Keys.TAB)
//              .sendKeys("Yeni mahalle").sendKeys(Keys.TAB)
//              .sendKeys("ordu caddesi").sendKeys(Keys.TAB)
//              .sendKeys("İstanbul").sendKeys(Keys.TAB)
//              .sendKeys("1234").sendKeys(Keys.ENTER).build().perform();
//
//      WebElement webCountry= driver.findElement(By.name("country_id")); //COUNTRY SEÇİNCE ALTTARAF YANİ CİTY YENİLENİYOR SEÇİLEN ÜLKENİN ŞEHİRLERİNE GÖRE
//      Select country=new Select(webCountry);
//      country.selectByVisibleText("Turkey");
//
//      wait.until(ExpectedConditions.elementToBeClickable(webCountry));
//      WebElement webState= driver.findElement(By.name("zone_id"));
//      Select state=new Select(webState);
//      //state.selectByVisibleText("Ankara");  --->
//      //state.selectByValue("3321");
//      state.selectByVisibleText("İstanbul");
//
//      WebElement cnt=driver.findElement(By.cssSelector("[value='Continue']"));
//      cnt.click();
//
//    //  WebElement cntbtn=driver.findElement(By.xpath("//input[@value='Continue']"));
//    //  cntbtn.click();
//




      }



  }







