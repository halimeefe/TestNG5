package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {


    public static void Bekle(int sn) {



            try {
                Thread.sleep(1000 * sn); // milisaniye  cinsinden beklediği
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }
    public static void successMessageValidation(){

            WebElement msgLabel = BaseDriver.driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));

            Assert.assertTrue(msgLabel.getText().toLowerCase().contains("success"));

    }

    public static int RandomGenarator(int max) { //4 -->Random ürün seçen fonksiyon hazırladık
        return (int) (Math.random() * max);

    }
    public static void  listContainsString(List<WebElement>list,String aranacakKelime){
        boolean bulundu=false;
        for (WebElement e : list){
            if (e.getText().toLowerCase().contains(aranacakKelime.toLowerCase()))
            {
                bulundu=true;
                break; // ürün bulunduysa çıksın
            }
        }
        if (bulundu==false)
            Assert.fail(); // bulunamadıysa assert fail versin,testi bitirsin
    }


    }

