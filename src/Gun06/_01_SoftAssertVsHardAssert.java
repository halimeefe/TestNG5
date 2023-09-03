package Gun06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {



    @Test
    void hardAssert(){
        String s1="Merhaba";
        System.out.println("Hard assert öncesi");
        Assert.assertEquals("Merhaba123",s1," ");
        System.out.println("Hard assert sonrası");
    }

    @Test
    void softAssert(){
        String strHomePage="www.facebook.com/homepage";
        String strCardPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccounthomepage";

        SoftAssert _softAssert=new SoftAssert();

        _softAssert.assertEquals("www.facebook.com/homepage",strHomePage);//true
        System.out.println("soft Assert 1");

        _softAssert.assertEquals("www.facebook.com/profile",strCardPage);//false
        System.out.println("soft Assert 2");

        _softAssert.assertEquals("www.facebook.com/settings",strEditAccount);//false
        System.out.println("soft Assert 3");

        _softAssert.assertAll();  // bütün assert sonuçlarını işleme koyuyor
        System.out.println("soft AssertAll : aktiflik sonrası");

    }



}
