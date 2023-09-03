package Gun02;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Ornek extends BaseDriver {

    // https://opencart.abstracta.us/index.php?route=account/login
    //Ayşe
    //Gül
    //ag@outlook.com
    //20232023 password
    //123456789 phone

    @Test
    void logintest()
    {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement mail=driver.findElement(By.xpath("//input[@name='email']"));
        mail.sendKeys("ag@outlook.com");
        Tools.Bekle(2);
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("20232023");
        Tools.Bekle(2);
        WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
        login.click();

        Assert.assertTrue(driver.getTitle().equals("My Account")); //Title dan doğrulama yaptık//actual result
        Assert.assertEquals(driver.getTitle(),"My Account","Login olamadı");// bu hata olduğu zaman sadece çalışır



    }



}
