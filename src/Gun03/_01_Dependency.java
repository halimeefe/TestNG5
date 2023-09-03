package Gun03;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {

    //ARABANIN HAREKETİ : START ,DRİVE ,PARK ,STOP HAREKET SIRASI


    @Test
    void StartCar() {
        System.out.println("startCar");
        // Assert.fail();//hata verdiren asser
    }

    @Test(dependsOnMethods = {"startCar"})
//BU TESTİN ÇALIŞMASI START CAR IN HATASIZ ÇALIŞMASINA BAĞLI
    void driveCar() {
        System.out.println("driveCar");

    }

    @Test(dependsOnMethods = {"startCar", "driveCar"})
    void parkCar() {
        System.out.println("parkCar");

    }

    //alwaysRun =true bağımlılıkları var ama hata çıkarsada yine çalıştır
    @Test(dependsOnMethods = {"parkCar"}, alwaysRun = true)
    void stopCar() {
        System.out.println("stopCar");
    }


}
    // aynı seviyedeki testler için priority verilebilir.
    // bağımlı testler, direk metodundan çalıştırdığınızda bağımlı olduğu metod zincirinde
    // 2 üste kadar ototmatik çağırıp çalışabilir.








