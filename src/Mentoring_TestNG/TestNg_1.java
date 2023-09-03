package Mentoring_TestNG;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg_1 extends BaseDriver {

//    https://www.saucedemo.com/ sitesine gidin
//
//            - username ve password ile login olun
//
//- Sauce Labs Backpack ürünü sepete ekleyin
//
//- Eklediğiniz ürünün sepette olduğunu doğrulayı


    @Test
    void Test1(){
    driver.get("https://www.saucedemo.com/");//[id='password']  [id='user-name']

    WebElement username=driver.findElement(By.cssSelector("[id='user-name']"));
    username.sendKeys("standard_user");
    WebElement password=driver.findElement(By.cssSelector("[id='password']"));
    password.sendKeys("secret_sauce");
     WebElement login=driver.findElement(By.xpath("//*[@name='login-button']"));////*[text()='Sauce Labs Backpack']
     login.click();
     WebElement product=driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
     product.click();//*[@id='add-to-cart-sauce-labs-backpack']
    WebElement cart=driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
    cart.click();//[id='shopping_cart_container']
    WebElement shop=driver.findElement(By.cssSelector("[id='shopping_cart_container']"));
    shop.click();//[id='item_4_title_link']
    WebElement control=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));

    Assert.assertEquals(control.getText().equals("Sauce Labs Backpack"),"Karşılaştırma başarısız");


}




}
