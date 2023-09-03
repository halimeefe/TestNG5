package Gun02;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions  {

@Test
    void EqualOrnek() {
    String s1 = "Merhaba";
    String s2 = "Merhaba";

    //Actual (oluşan), Expected(beklenen) ,Mesaj(opsiyonel)
    Assert.assertEquals(s1, s2, "Karşılaştırma başarısız oldu");// TESTNG DE MESAJ EN SONDA OLUR
    // BU FONKSİYON SADECE HATA OLUNCA MESAJI DÖNDÜRÜR
}

 @Test
 void notEqualsOrnek()
    {
       String s1="Merhaba";
       String s2="Merhaba1";

        Assert.assertNotEquals(s1,s2,"Gerçek sonuç ve Beklenen eşit oldu");//BURADA EŞİTLİK BEKLEMİYORUZ TERSİ OLURSA ONA UYGUN MESAJ YAZDIK ve bize hata vermesini bekliyoruz

    }

    @Test
    void TrueOrnek(){

    int s1=55;
    int s2=66;

    Assert.assertTrue(s1 == s2,"Gerçek sonuç ve beklenen eşit Olmadı");//Beklediğim olmayınca mesaj gözükecek// Mesajı else gibi düşünün
    }

    @Test
    void nullOrnek(){
    String s1=null;
    Assert.assertNull(s1,"Oluşan null olmadı");


    }
    @Test
    void direkFail()
    {
        int a=55;
        if (a==55)
            Assert.fail();// ASSERT FAİL HATA OLUŞTU
    }
}





