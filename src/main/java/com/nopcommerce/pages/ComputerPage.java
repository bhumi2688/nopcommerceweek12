
/*3.ComputerPage - Comuters text, DesktopsLink, NotebooksLink, SoftwareLink Locators
and create appropriate methods for it.*/
package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By computerText = By.xpath("//ul[@class='top-menu notmobile']/li[1]");
    By desktopsLink = By.xpath("//div[@class='item-grid']/div[1]");
    By notebookslink = By.xpath("//div[@class='item-grid']/div[2]");
    By softwareLink = By.xpath("//div[@class='item-grid']/div[3]");

    public String getComputertext(){
        return getTextFromElement(computerText);
    }
    public void clickonDesktopsLink(){
        clickOnElement(desktopsLink);
    }
    public void clickonNoteBookslink(){
        clickOnElement(notebookslink);
    }
    public void clickonSoftwarelink(){
        clickOnElement(softwareLink);
    }


}
