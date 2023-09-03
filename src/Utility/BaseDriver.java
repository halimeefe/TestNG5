package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {


    public static WebDriver driver;
    public static WebDriverWait wait; //EXPLİCİTLY Wait KULLANIMI İÇİN WAİT TANIMLADIK

    @BeforeClass

    public void baslangicIslemler() {

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
        wait = new WebDriverWait(driver, Duration.ofSeconds(30)); //EXPLİCİTLYWAİT İÇİN TANIMLADIK

        //  bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));// İMPLİCİTLYWAİT E GEREK KALMAZ

        //  System.out.println("bitti = ");

       // logintest();

    }

    @AfterClass
    // SON ÇALIŞMASI GEREKEN YER
    public void bitisIslemleri() {

        Tools.Bekle(3);
        //   driver.quit();


    }

//    void logintest() {
//        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
//        WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
//        mail.sendKeys("ag@outlook.com");
//        Tools.Bekle(2);
//        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//        password.sendKeys("20232023");
//        Tools.Bekle(2);
//        WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
//        login.click();
//
//        Assert.assertTrue(driver.getTitle().equals("My Account")); //Title dan doğrulama yaptık


    }

//    public static void rndPsword() {
//
//        // String upper="ABCDEFGHIJKLMNOPQRSTUVWYZX";
//        //  String lower="abcdefghijklmnoprqstuvwxyz";
//        String num = "0123456789";
//        // String specialChars="_*^&$.";
//        String combination = num;
//        int lenght = 8;
//        char[] password = new char[lenght];
//        Random p = new Random();
//        for (int i = 0; i < lenght; i++) {
//            password[i] = combination.charAt(p.nextInt(combination.length()));
//        }
//        System.out.println(new String(password));
//
//
//    }
//
//    public static void rndMail() {
//        String chars = "abcdefghijklmnoprqstuvwxyz";
//        String text = "@outlook.com";
//        int lenght = 10;
//        char[] email = new char[lenght];
//        for (int i = 0; i < lenght; i++) {
//            int rand = (int) (Math.random() * chars.length());
//            email[i] = chars.charAt(rand);
//
//        }
//        System.out.println(email);
//

































