package com.nopcommerce.testsuite;

import com.google.common.base.Verify;
import com.nopcommerce.pages.BuildYourOwnComputerPage;
import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.DesktopsPage;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ComputerPageTest extends TestBase {
    HomePage homepage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    @Test
    public void verifyUserShouldNavigatetoComputerPageSuccessfully(){
        homepage.clickonComputerTab();
        String actualMsg = computerPage.getComputertext();
        String expectedMsg = "Computers";
        Assert.assertEquals(actualMsg, expectedMsg, "Computer text is verified");

    }


    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homepage.clickonComputerTab();
        computerPage.clickonDesktopsLink();
        String actualMsg = desktopsPage.getDesktopText();
        String expectedMsg = "Desktops";
        Assert.assertEquals(actualMsg, expectedMsg, "Desktops text is verified");
        buildYourOwnComputerPage.clickOnBuildYourComputer();
        buildYourOwnComputerPage.selectprocessorDropDown("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.selectRamDropDown("4");
        buildYourOwnComputerPage.clickOnRadioButtonHDD();
        buildYourOwnComputerPage.clickonRadioButtonOS();
        buildYourOwnComputerPage.clickonSoftwareCheckbox();
        buildYourOwnComputerPage.clickonAddtoCart();
        String actualMsg1 = buildYourOwnComputerPage.verifyProductAddedText();
        String expectedMsg1 = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMsg1, expectedMsg1, "Product added message is verified");

    }

}
