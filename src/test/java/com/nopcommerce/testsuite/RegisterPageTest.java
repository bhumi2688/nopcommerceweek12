package com.nopcommerce.testsuite;


import com.google.common.base.Verify;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.RegisterPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.security.util.Password;

public class RegisterPageTest extends TestBase {
    HomePage homepage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homepage.clickonRegisterLink();
        String actualMsg = registerPage.verifyRegisterText();
        String expectedMsg = "Register";
        Assert.assertEquals(actualMsg, expectedMsg, "Register Text is verified");

    }
    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homepage.clickonRegisterLink();
        registerPage.clickonRegisterButton();
        String actualMsg = registerPage.verifyFirstnameRequired();
        String expectedMsg = "First name is required.";
        Assert.assertEquals(actualMsg, expectedMsg, "First name is required is verified");

        String actualMsg1 = registerPage.verifyLastNameRequired();
        String expectedMsg1 = "Last name is required.";
        Assert.assertEquals(actualMsg1, expectedMsg1, "Last name is required is verified");

        String actualMsg2 = registerPage.verifyEmailRequired();
        String expectedMsg2 = "Email is required.";
        Assert.assertEquals(actualMsg2, expectedMsg2, "Email is required is verified");

        String actualMsg3 = registerPage.verifyPasswordRequired();
        String expectedMsg3 = "Password is required.";
        Assert.assertEquals(actualMsg3, expectedMsg3, "Password is required is verified");

        String actualMsg4 = registerPage.verifyConfirmPasswordRequired();
        String expectedMsg4 = "Password is required.";
        Assert.assertEquals(actualMsg4, expectedMsg4, "Password is required is verified");

    }
    @Test
    public void verifyUserShouldCreateAccountSuccessfully(){
        homepage.clickonRegisterLink();
        registerPage.selectMaleFemaleRadioButton();
        registerPage.enterFirstName("treat5");
        registerPage.enterLastName("tasty1");
        registerPage.selectDateofBirthDay("4");
        registerPage.selectDateofBirthMonth("June");
        registerPage.selectDateofBirthYear("1986");
        registerPage.enterEmail("treat5_tasty2@gmail.com");
        registerPage.enterPasswordField("123456TT");
        registerPage.enterConfirmPassword("123456TT");
        registerPage.clickonRegisterButton();
        String actualMsg4 = registerPage.verifyRegistrationCompleteMsg();
        String expectedMsg4 = "Your registration completed";
        Assert.assertEquals(actualMsg4, expectedMsg4, "Registration complete message is verified");


    }

}
