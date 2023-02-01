
//5 Build your own computer page
package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BuildYourOwnComputerPage extends Utility {
    By getBuildYourOwnComputer = By.linkText("Build your own computer");
    By buildYourOwnComputerText = By.xpath("//div[@class='item-grid']/div[1]/div/div[2]/h2/a");
    By processorDropDown = By.xpath("//select[@id='product_attribute_1']");
    By ramDropDown = By.xpath("//select[@id='product_attribute_2']");
    By radiobuttonHDD = By.xpath("//input[@id='product_attribute_3_6']");
    By radiobuttonOS = By.xpath("//input[@id='product_attribute_4_8']");
    By softwareCheckbox = By.xpath("//input[@id='product_attribute_5_10']");
    By addtoCartbutton = By.xpath("//button[@id='add-to-cart-button-1']");
    By productaddedmessage = By.xpath("//div[@class='bar-notification success']/p");


    public String getbuildyourcomputertext(){
        return getTextFromElement(buildYourOwnComputerText);
    }
    public void selectprocessorDropDown(String value){
        selectByVisibleTextFromDropDown(processorDropDown,value);
    }
    public void selectRamDropDown(String value){
        selectByValueFromDropDown(ramDropDown,value);
    }
    public void clickOnRadioButtonHDD(){
        clickOnElement(radiobuttonHDD);
    }
    public void clickonRadioButtonOS(){
        clickOnElement(radiobuttonOS);
    }
    public void clickonSoftwareCheckbox(){
        clickOnElement(softwareCheckbox);
    }
    public void clickonAddtoCart(){
        clickOnElement(addtoCartbutton);
    }
    public String verifyProductAddedText(){
        return getTextFromElement(productaddedmessage);
    }
    public void clickOnBuildYourComputer(){
        clickOnElement(getBuildYourOwnComputer);
    }



}
