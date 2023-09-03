package Gun06;

import Utility.BaseDriver;
import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_PlaceOrder extends BaseDriver {

    @Test
    void ProceedToCheckout(){

        _03_PlaceOrderElements elements=new _03_PlaceOrderElements();

        elements.searchBox.sendKeys("ipod");
        elements.searchclick.click();
        elements.Cart.click();
        elements.shopingCard.click();
        elements.checkout.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt3)).click();
        elements.agree.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cnt4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.confirm)).click();
        wait.until(ExpectedConditions.urlContains("success"));
        Assert.assertEquals(elements.msg.getText(),"Your order has been placed!"," Onay texti bulunamadı");
    }



}
