package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _03_DataProvider_ÇokBoyutlu {


  @Test(dataProvider = "UserData")
  void UsernameTest(String username, String password){
      System.out.println("user:"+username+" "+password);
  }
    @DataProvider
    public Object[][]UserData(){ //İKİ BOYUTLU DATAPROVİDER I BİRDEN FAZLA DATA VE BİLGİ GÖNDERMEK İÇİN KULLANIYORUZ

      Object[][]data={

              {"Nurhayat","122333"},
              {"Alper","ererer"},
              {"uğur","ereerr3343"},
              {"Hakan","sdsdsd"},

      };
      return data;
    }
}
