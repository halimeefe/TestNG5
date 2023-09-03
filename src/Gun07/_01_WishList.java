package Gun07;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class _01_WishList extends BaseDriver {

/*
    Senaryo ;
    1- Siteye gidiniz..

   1.Test;
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */

    @Test
    @Parameters("searchText") //XML İLE OLMALI
    void addToWishList(String text) {


        WebElement searchBox= driver.findElement(By.xpath("//input[@name='search']"));
        searchBox.sendKeys(text);


        WebElement searchButton = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
        searchButton.click();

        List<WebElement> searchResult = driver.findElements(By.cssSelector("div[class='caption']>h4>a"));//ANASAYFADAKİ ÜRÜNLERİN LOCATE İ
        int randomSecim= Tools.RandomGenarator(searchResult.size());//0,1,2,3

        String wishItems=searchResult.get(randomSecim).getText(); // TIKLATILACAK ÜRÜNÜN ADINI ALDIK
        System.out.println(wishItems);

        List<WebElement>wishBtnList=driver.findElements(By.cssSelector("[data-original-title='Add to Wish List']")); // AYNI ÜRÜNLERİN WİSH LİSTİN LOCATE İNİ BULDUK
        wishBtnList.get(randomSecim).click(); //SEÇİLEN ÜRÜNÜN WİSH LİSTİNİ TIKLADIK

        WebElement wishClk=driver.findElement(By.id("wishlist-total"));
        wishClk.click();

        List<WebElement>wishTableList=driver.findElements(By.cssSelector("[class='text-left']>a"));//WİSHLİSTTEKİ ÜRÜNLERİN LOCATE İ,ÜRÜN EKLEDİKÇE SAYISI ARTAN LOCATE

        Tools.listContainsString(wishTableList,wishItems); //TOLLS TAN DOĞRULAMA FONKSİYONUNU ÇAĞIRDIK






    }
}











