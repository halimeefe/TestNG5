package Gun03;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class _02_AdressFunctionality extends BaseDriver {




        @Test
        void addAddress(){


            WebElement addressBook= driver.findElement(By.linkText("Address Book"));
            addressBook.click();

            WebElement newAdress= driver.findElement(By.linkText("New Address"));
            newAdress.click();

            WebElement firstName= driver.findElement(By.id("input-firstname"));
            firstName.sendKeys("Halime");

            WebElement lastname= driver.findElement(By.id("input-lastname"));
            lastname.sendKeys("Efe");

            WebElement company= driver.findElement(By.id("input-company"));
            company.sendKeys("Techno Study");

            WebElement address1= driver.findElement(By.id("input-address-1"));
            address1.sendKeys("Yeni mahalle");

            WebElement address2= driver.findElement(By.id("input-address-2"));
            address2.sendKeys("Ordu Caddesi");

            WebElement city= driver.findElement(By.id("input-city"));
            city.sendKeys("İstanbul");

            WebElement postCode= driver.findElement(By.id("input-postcode"));
            postCode.sendKeys("12345");

            // ülke seçimi tamam
            WebElement webCountry= driver.findElement(By.id("input-country")); //COUNTRY SEÇİNCE ALTTARAF YANİ CİTY YENİLENİYOR SEÇİLEN ÜLKENİN ŞEHİRLERİNE GÖRE
            Select country=new Select(webCountry);
            country.selectByVisibleText("Turkey");


            //2.Seçenek
            wait.until(ExpectedConditions.elementToBeClickable(webCountry));  //-->COUNTRY CLİKABLE OLANA KADAR BEKLETCEZ

            // STATE YANİ ŞEHİR SEÇİMİ
            // 1.Seçenek
           WebElement options=driver.findElement(By.cssSelector("select[id='input-zone']>option"));  //-->SELECT İD NİN OPTİONSLARI
           wait.until(ExpectedConditions.stalenessOf(options));     // --> OPTİONSLARIN BAYATLAMASI GEÇENE KADAR BEKLE

            WebElement webState= driver.findElement(By.id("input-zone"));
            Select state=new Select(webState);
            //state.selectByVisibleText("Ankara");  --->
            //state.selectByValue("3321");
            state.selectByIndex(7);    //-->SELECTBYINDEX EXPLCİTLYWAİT İLE ÇALIŞIR BAYAT ELEMAN HATASI VERME İHTİMALİ VAR


            //selectByVisibleText, selectByValue : FİNDELEMENT GİBİ ÇALIŞTIĞINDAN İMPLİCİTLYWAİTİ KULLANIR

            // selectByIndex :İMPLİCİTLYWAİT İLE ÇALIŞMIYOR  SADECE  EXPLİCTWAİT İLE ÇALIŞIR ,İMPLİCİTLY İLE STALE ELEMENT YANİ BAYAT ELEMENT HATASI VERİR

            WebElement defaddress = driver.findElement(By.xpath("//input[@value='1']"));
            defaddress.click();

            WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
            continueButton.click();

            Tools.successMessageValidation();
        }


        @Test(dependsOnMethods = {"addAddress"})
        void editAddress(){
            WebElement addressBook= driver.findElement(By.linkText("Address Book"));
            addressBook.click();

            List<WebElement> editAll= driver.findElements(By.linkText("Edit"));
            WebElement sonEdit= editAll.get( editAll.size()-1 ); // son edit
            sonEdit.click();

            WebElement firstName= driver.findElement(By.id("input-firstname"));
            firstName.clear();
            firstName.sendKeys("Halime1");

            WebElement lastname= driver.findElement(By.id("input-lastname"));
            lastname.clear();
            lastname.sendKeys("Efe1");

            WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
            continueButton.click();

            Tools.successMessageValidation();
        }

        @Test(dependsOnMethods = {"editAddress"})
        void deleteAddress(){

            WebElement addressBook= driver.findElement(By.linkText("Address Book"));
            addressBook.click();

            List<WebElement> editAll= driver.findElements(By.linkText("Delete"));
            WebElement silinebilirAdres= editAll.get( editAll.size()-2 ); // silinebilir 2.cisi
            silinebilirAdres.click();

            Tools.successMessageValidation();
        }






        }







