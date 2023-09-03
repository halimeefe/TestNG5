package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {

    //-------------  org.seleniumhq.selenium:selenium-java:4.8.1 -------------------->TESTNG YE SELENİUM WEBDRIVER YÜKLEDİĞİMİZ LİNK
 // ----------------------------org.testng:testng:6.14.3 ----------------------->2.LİNK DRİVERDAN SONRA EKLENECEK --> TESTNG LİNKİ

 //----------------------------------------------------------------------------------------------------------------------------------------------------

 //       public static void main(String[] args) {
//        webSitesiniAc();
//        LoginIsleminiYap();
//        driveriKapat();
//    }

//    @Test JUnit
//    public void Test1(){
//        webSitesiniAc();  //  ilk önce çalışmalı before class
//        LoginIsleminiYap();
//        driveriKapat(); // en son çalışmalı after class

    @Test(priority =1)           // EĞER HERHANGİBİR SIRA VERMEZSEK TESTLERİ ALFABETİK SIRAYA GÖRE ÇALIŞTIRIR
    public void loginIsleminiYap(){// BU YÜZDEN ÖNCELİK SIRASINA GÖRE PRİORİTY YAZIP NUMARALANDIRIRIZ
        System.out.println("login test işlemi yapıldı");

    }
    @Test(priority =2)
    public void webSitesiniAc(){
        System.out.println("driver tanımlandı ve web sitesi açıldı");

    }
    @Test(priority = 3)
    public void driverıKapat(){
        System.out.println("driver kapatıldı");



    }
}


