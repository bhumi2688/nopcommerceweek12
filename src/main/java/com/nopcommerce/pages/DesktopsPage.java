
//4.DesktopsPage - Desktops text, Sortby, Display, selectProductList Locators and it's actions
package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility {
    By desktopText = By.xpath("//div[@class='page category-page']/div/h1");
    By sortBy = By.xpath("//div[@class='product-selectors']/div[2]/span");
    By display = By.xpath("//div[@class='product-selectors']/div[3]");
    By selectProductList = By.xpath("//div[@class='product-selectors']/div[1]/a[2]");

    public String getDesktopText(){
        return getTextFromElement(desktopText);
    }
    public void clickonSortBy(){
        clickOnElement(sortBy);
    }
    public void clickonDisplay(){
        clickOnElement(display);
    }
    public void setSelectProductList(){
        clickOnElement(selectProductList);
    }


}
