
/*2.HomePage - All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, My
account link and LogOut link locatores*/
package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By sevenMenu = By.xpath("//ul[@class='top-menu notmobile']");
    By computerTab = By.xpath("//ul[@class='top-menu notmobile']/li[1]");
    By electronicsTab = By.xpath("//ul[@class='top-menu notmobile']/li[2]");
    By apparelTab = By.xpath("//ul[@class='top-menu notmobile']/li[3]");
    By digitalDownloadsTab = By.xpath("//ul[@class='top-menu notmobile']/li[4]");
    By booksTab = By.xpath("//ul[@class='top-menu notmobile']/li[5]");
    By jewelryTab = By.xpath("//ul[@class='top-menu notmobile']/li[6]");
    By giftCardsTab = By.xpath("//ul[@class='top-menu notmobile']/li[7]");
    By loginLink = By.xpath("//a[contains(text(),'Log in')]");
    By registerLink = By.xpath("//a[contains(text(),'Register')]");
    By nopCommerceLogo = By.xpath("//div[@class='header-logo']");
    By myAccountLink = By.xpath("//div[@class='footer-upper']/div[3]/ul/li[1]");
    By logoutLink = By.xpath("//a[contains(text(),'Log out')]");

    public void clickonComputerTab(){
        clickOnElement(computerTab);
    }
    public void clickonElectronicsTab(){
        clickOnElement(electronicsTab);
    }
    public void clickonApparelTab(){
        clickOnElement(apparelTab);
    }
    public void clickonDigitalDownloadsTab(){
        clickOnElement(digitalDownloadsTab);
    }
    public void clickonBooksTab(){
        clickOnElement(booksTab);
    }
    public void clickonJewelryTab(){
        clickOnElement(jewelryTab);
    }
    public void clickonGiftCardsTab(){
        clickOnElement(giftCardsTab);
    }
    public void clickonLoginLink(){
        clickOnElement(loginLink);
    }
    public void clickonRegisterLink(){
        clickOnElement(registerLink);
    }
    public void clickonNopCommerceLogo(){
        clickOnElement(nopCommerceLogo);
    }
    public void clickonmyAccountLink(){
        clickOnElement(myAccountLink);
    }
    public void clickonLogoutLink(){
        clickOnElement(logoutLink);
    }
    public String verifyLogoutLink(){
        return getTextFromElement(logoutLink);
    }
    public String verifyLoginLink(){
        return getTextFromElement(loginLink);
    }
}
