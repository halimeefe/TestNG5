package Gun07;

import Gun06._03_PlaceOrderElements;
import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _01_WishListPom extends BaseDriver {

    @Test
    @Parameters("searchText")

    void addToWishList(String text) {

        _03_PlaceOrderElements poe=new _03_PlaceOrderElements();

        poe.searchBox.sendKeys(text);
        poe.searchclick.click();

       _02_WishListElements wle=new _02_WishListElements();

        int randomSecim = Tools.RandomGenarator(wle.searchResult.size());//0,1,2,3
        String wishItems = wle.searchResult.get(randomSecim).getText(); // TIKLATILACAK ÜRÜNÜN ADINI ALDIK
        wle.wishBtnList.get(randomSecim).click(); //SEÇİLEN ÜRÜNÜN WİSH LİSTİNİ TIKLADIK
        wle. wishClk.click();
        Tools.listContainsString(wle.wishTableList, wishItems); //TOLLS TAN DOĞRULAMA FONKSİYONUNU ÇAĞIRDIK

    }
}
