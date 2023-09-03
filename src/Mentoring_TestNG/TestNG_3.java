package Mentoring_TestNG;

import Utility.BaseDriver;
import com.beust.ah.A;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Random;

public class TestNG_3 extends BaseDriver {


    @Test
    void Test1() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");//[id='password']  [id='user-name']

//        WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
//        register.click();
//        WebElement firstName=driver.findElement(By.id("customer.firstName"));
//        firstName.sendKeys("merve");
//        Actions actions=new Actions(driver);
//        actions.moveToElement(firstName).sendKeys(Keys.TAB).sendKeys("efe")
//                .sendKeys(Keys.TAB).sendKeys("yıldırım mah.33.sk").sendKeys(Keys.TAB)
//                .sendKeys("İSTANBUL").sendKeys(Keys.TAB).sendKeys("türkiye")
//                .sendKeys(Keys.TAB).sendKeys("12345").sendKeys(Keys.TAB)
//                .sendKeys("123456789").sendKeys(Keys.TAB).sendKeys("0789456123")
//                .sendKeys("merwfe").sendKeys(Keys.TAB).sendKeys()








//                  [id='customer.firstName']
//
//                 [id='customer.lastName']
//                 [id='customer.address.street']
//                 [id='customer.address.city']
//                 [id='customer.address.state']
//                 [id='customer.address.zipCode']
//                 [id='customer.phoneNumber']
//                [id='customer.ssn']
//                [id='customer.username']
//                 [id='customer.password']
//                  [id='repeatedPassword']
//                 input[value='Register']
//                  div[id='rightPanel']>p   // succcessfully
//
//
//                  name. "username"
//                  input[name='password']
//                          [value='Log In']
//
//        //h2[text()='Account Services']  login olduğunu doğrulama
//
//
//
//        //*[text()='Log Out']
//
//
//
                  





    }
}



