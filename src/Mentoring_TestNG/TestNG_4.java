package Mentoring_TestNG;

import Utility.BaseDriver;
import Utility.BaseDriverParameters;
import Utility.Tools;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_4 extends BaseDriverParameters {


//    https://www.saucedemo.com/ siteye gidin
//
//       CASE1-     -kayıtlı usernames için geçerli ve geçersiz password ile login işlemi gerçekleştirin.
//
//       CASE-2    -Eğer kullanıcı login olduysa hamburger menüye tıklayın, Logout olun.
//
//       CASE-3     -Eğer kullanıcı login olamadıysa error mesajı kapatın.
//
//       CASE-4-    username ve password alanlarına clear işlemi gerçekleştirin.
//
//      CASE-5     -Testi paralel test olarak xml file dan çalıştırın.

    //    DATA PROVİDER LA TESTİMİZİ ÇALIŞTIRIYORUZ  //

    @Test(dataProvider = "credentials")  //credentials kimlik bilgileri anlamında
    public void loginTest(String userName, String password) {   // PARAMETRE OLARAK USERNAME VE PASWORD PARANTEZİN İÇİNE YAZIYORUZ


        driver.get(" https://www.saucedemo.com/");
        WebElement userName1 = driver.findElement(By.id("user-name"));
        userName1.sendKeys(userName);

        WebElement password1 = driver.findElement(By.id("password"));
        password1.sendKeys(password);

        WebElement login1 = driver.findElement(By.id("login-button"));
        login1.click();

        if (userName.equals("standard_user") && password.equals("secret_sauce")){

            WebElement burgerMenu=driver.findElement(By.id("react-burger-menu-btn"));
            burgerMenu.click();
            WebElement logout=driver.findElement(By.xpath("//*[text()='Logout']"));
            logout.click();

        } else if (userName.equals("problem_user") && password.equals("secret_sauce")) {
            WebElement burgerMenu=driver.findElement(By.id("react-burger-menu-btn"));
            burgerMenu.click();

            WebElement logout=driver.findElement(By.xpath("//*[text()='Logout']"));
            logout.click();

        } else if (userName.equals("performance_glitch_user") && password.equals("secret_sauce")) {

        } else {
            WebElement errortext = driver.findElement(By.cssSelector("h3[data-test='error']"));
            Assert.assertTrue(errortext.isDisplayed());
            WebElement errorButton = driver.findElement(By.cssSelector("button>[class='svg-inline--fa fa-times fa-w-11 ']"));
            Tools.Bekle(3);
            errorButton.click();
            userName1.clear();
            password1.clear();

        }
    }

    @DataProvider
    public Object[][] credentials() {
            Object[][] credentialList=new Object[6][2];
        credentialList[0]=new Object[]{"standard_user","secret_sauce"};
        credentialList[1]=new Object[]{"standard_user","secret_cee"};
        credentialList[2]=new Object[]{"locked_out_user","secret_sauce"};
        credentialList[3]=new Object[]{"locked_out_user","secret"};
        credentialList[4]=new Object[]{"problem_user","secret_sauce"};
        credentialList[5]=new Object[]{"problem_user","secce"};

        return credentialList;




    }
}






//
//        WebElement userName2=driver.findElement(By.id("user-name"));
//        userName2.sendKeys("standard_user");
//
//        WebElement password2=driver.findElement(By.id("password"));
//        password2.sendKeys("secret_sauce");
//
//        WebElement login2=driver.findElement(By.id("login-button"));
//        login2.click();
//
//
//
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.saucedemo.com/"));
//












