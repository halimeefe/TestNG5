package Mentoring_TestNG;

import Utility.BaseDriver;
import Utility.BaseDriverParameters;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class TestDeneme extends BaseDriver {



    @Test
    void Test1(){


        driver.get("http://automationpractice.pl/index.php");

        Actions actions=new Actions(driver);
        List<WebElement>menuBar=driver.findElements(By.cssSelector(".sf-menu>li"));
        actions.moveToElement(menuBar.get(0)).perform();
        Tools.Bekle(3);
        WebElement casulDresses=driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(casulDresses));
        casulDresses.click();

        JavascriptExecutor j=(JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,400)");
        Tools.Bekle(3);

        driver.findElement(By.cssSelector(".icon-th-list")).click();
        driver.findElement(By.cssSelector(".button.lnk_view")).click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        List<WebElement>images=driver.findElements(By.cssSelector("#thumbs_list_frame>li"));
        for (int i = 0; i < images.size(); i++) {
            actions.moveToElement(images.get(i)).perform();
            Tools.Bekle(2);
        }

         driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
    }
}
