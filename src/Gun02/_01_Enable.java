package Gun02;

import Utility.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _01_Enable {

    @Test
    void test1(){
        System.out.println("test1");

    }
    @Test(enabled = false)  // ENABLED = FALSE TESTİ ERTELER
    void test2(){
        System.out.println("test 2");
    }


    @Test
    void test3(){
        System.out.println("test 3");
    }// TESTNG DE BÜTÜN CLASSLARA ULAŞAN BİR YAPI OLUŞTURDUKLARI İÇİN "PUBLİC" DEMEK ZORUNDA DEĞİLİZ



    public static WebDriver driver;

    @BeforeClass // İLK ÇALIŞMASI GEREKEN YER
   public void baslangicIslemler()
    {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        // driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);


        System.out.println("başlangıç işlemleri yapılıyor");
    }

    @AfterClass  // SON ÇALIŞMASI GEREKEN YER
   public void bitisIslemleri(){

        System.out.println("bitiş işlemleri yapılıyor");
        Tools.Bekle(3);
        driver.quit();

    }
}
