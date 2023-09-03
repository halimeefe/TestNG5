package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_PlaceOrderElements {

    // Bu sayfadaki bütün elemenalrın driverlar bağlantısı gerekiyor
    // bunun için aşağıdaki consructor eklendi ve için PageFatory ile
    // driver üzerinden bu (this) sayfadaki bütün elemnalar ilşkilendirildi.
    // Böylece Sayfada dan nesne türetildiği zaman değil, kullanıldığı
    // anda elemanların bulunması aktif oluyor.Bu yöntemle bütün sayfalarda
    // aynı isimde elemanlar var ise buradaki tanımlama hepsi için geçerli hale
    // gelmiş oluyor. buna yapıya Page Object Model (POM) adı veriliyor.


    public _03_PlaceOrderElements() {// boş constructor ekledik


        PageFactory.initElements(BaseDriver.driver, this); // DRİVERLA BURDAKİ ELEMANLARI BAŞLAT
        // driver.findElement ı hepsi için yap
    }
    @FindBy(name =" search")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='button'])[4]")
    public WebElement searchclick;


    @FindBy(xpath = "//button[text()='Add to Cart']")
    public WebElement Cart  ;

    @FindBy(linkText = "Shopping Cart")
    public WebElement shopingCard;

    @FindBy (xpath = "//a[text()='Checkout']")
    public WebElement    checkout;

    @FindBy(id = "button-payment-address")
    public WebElement cnt1;


    @FindBy(id = "button-shipping-address")
    public WebElement cnt2;

    @FindBy(id = "button-shipping-method")
    public WebElement cnt3;

    @FindBy (name = "agree" )
    public WebElement agree;

    @FindBy(id = "button-payment-method")
    public WebElement cnt4;

    @FindBy(id = "button-confirm")
    public WebElement confirm;

    @FindBy(css = "[id='content']>h1")
    public WebElement msg;











}





