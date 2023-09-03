package Mentoring_TestNG;

import Utility.BaseDriver;
import org.testng.annotations.Test;

public class TestNG_2 extends BaseDriver {


    @Test
    void Test1(){
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");


    }
}
