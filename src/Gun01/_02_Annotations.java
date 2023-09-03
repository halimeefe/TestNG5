package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {

                 //planlı test yapmamızı sağlar//
    /*
        @BeforeClass      -->   Class ın başında çalışacak   (driver işlemleri)
           @BeforeMethod  -->   Her metoddan(test metodları) önce çalışacak
               @Test      -->   testlerin çalıştığı metodlar
               @Test      -->   testlerin çalıştığı metodlar
           @AfterMethod   -->   Her metoddan sonra çalışacak
        @AfterClass       -->   Class ın çalışmasının sonunda çalışacak (driver kapat)
     */

@BeforeClass
public void beforeClass(){ //  TEST VE METHODLARDAN ÖNCE ÇALIŞIR
    System.out.println("before class çalıştı");
}
@AfterClass
public void afterClass(){ // TEST VE METHODLARDAN EN SONUNDA ÇALIŞIR
    System.out.println("after class çalıştı");
}


    @BeforeMethod // BEFORE METHOD HER METHODDAN ÖNCE ÇALIŞIR
    public void beforeMethod()
    {
        System.out.println("before method class çalıştı");
    }


    @Test
    public void Test1() {
        System.out.println("test 1 çalıştı");


    }
    @AfterMethod  // HER METHODDAN SONRA ÇALIŞIR
    public void afterMethod() {

        System.out.println("after method çalıştı");
    }

    @Test
    public void Test2(){

        System.out.println(" test 2 çalıştı");

    }

}





